package typings.maximMazurokGapiClientVault.gapi.client.vault

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientVault.anon.Alt
import typings.maximMazurokGapiClientVault.anon.Key
import typings.maximMazurokGapiClientVault.anon.MatterId
import typings.maximMazurokGapiClientVault.anon.Oauthtoken
import typings.maximMazurokGapiClientVault.anon.PageSize
import typings.maximMazurokGapiClientVault.anon.PrettyPrint
import typings.maximMazurokGapiClientVault.anon.QuotaUser
import typings.maximMazurokGapiClientVault.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoldsResource extends StObject {
  
  var accounts: AccountsResource = js.native
  
  def addHeldAccounts(request: Key, body: AddHeldAccountsRequest): Request[AddHeldAccountsResponse] = js.native
  /** Adds accounts to a hold. Returns a list of accounts that have been successfully added. Accounts can be added only to an existing account-based hold. */
  def addHeldAccounts(request: MatterId): Request[AddHeldAccountsResponse] = js.native
  
  def create(request: Alt, body: Hold): Request[Hold] = js.native
  /** Creates a hold in the specified matter. */
  def create(request: Oauthtoken): Request[Hold] = js.native
  
  /** Removes the specified hold and releases the accounts or organizational unit covered by the hold. If the data is not preserved by another hold or retention rule, it might be purged. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets the specified hold. */
  def get(): Request[Hold] = js.native
  def get(request: PrettyPrint): Request[Hold] = js.native
  
  /** Lists the holds in a matter. */
  def list(): Request[ListHoldsResponse] = js.native
  def list(request: PageSize): Request[ListHoldsResponse] = js.native
  
  def removeHeldAccounts(request: Key, body: RemoveHeldAccountsRequest): Request[RemoveHeldAccountsResponse] = js.native
  /** Removes the specified accounts from a hold. Returns a list of statuses in the same order as the request. */
  def removeHeldAccounts(request: QuotaUser): Request[RemoveHeldAccountsResponse] = js.native
  
  def update(request: Key, body: Hold): Request[Hold] = js.native
  /**
    * Updates the scope (organizational unit or accounts) and query parameters of a hold. You cannot add accounts to a hold that covers an organizational unit, nor can you add
    * organizational units to a hold that covers individual accounts. If you try, the unsupported values are ignored.
    */
  def update(request: Resource): Request[Hold] = js.native
}
