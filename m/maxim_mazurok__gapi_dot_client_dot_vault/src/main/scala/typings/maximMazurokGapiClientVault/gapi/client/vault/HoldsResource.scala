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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoldsResource extends js.Object {
  
  var accounts: AccountsResource = js.native
  
  def addHeldAccounts(request: Key, body: AddHeldAccountsRequest): Request[AddHeldAccountsResponse] = js.native
  /** Adds HeldAccounts to a hold. Returns a list of accounts that have been successfully added. Accounts can only be added to an existing account-based hold. */
  def addHeldAccounts(request: MatterId): Request[AddHeldAccountsResponse] = js.native
  
  def create(request: Alt, body: Hold): Request[Hold] = js.native
  /** Creates a hold in the given matter. */
  def create(request: Oauthtoken): Request[Hold] = js.native
  
  /** Removes a hold by ID. This will release any HeldAccounts on this Hold. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets a hold by ID. */
  def get(): Request[Hold] = js.native
  def get(request: PrettyPrint): Request[Hold] = js.native
  
  /** Lists holds within a matter. An empty page token in ListHoldsResponse denotes no more holds to list. */
  def list(): Request[ListHoldsResponse] = js.native
  def list(request: PageSize): Request[ListHoldsResponse] = js.native
  
  def removeHeldAccounts(request: Key, body: RemoveHeldAccountsRequest): Request[RemoveHeldAccountsResponse] = js.native
  /**
    * Removes HeldAccounts from a hold. Returns a list of statuses in the same order as the request. If this request leaves the hold with no held accounts, the hold will not apply to any
    * accounts.
    */
  def removeHeldAccounts(request: QuotaUser): Request[RemoveHeldAccountsResponse] = js.native
  
  def update(request: Key, body: Hold): Request[Hold] = js.native
  /**
    * Updates the OU and/or query parameters of a hold. You cannot add accounts to a hold that covers an OU, nor can you add OUs to a hold that covers individual accounts. Accounts listed
    * in the hold will be ignored.
    */
  def update(request: Resource): Request[Hold] = js.native
}
