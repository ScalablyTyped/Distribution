package typings.maximMazurokGapiClientVault.gapi.client.vault

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientVault.anon.AccountId
import typings.maximMazurokGapiClientVault.anon.HoldId
import typings.maximMazurokGapiClientVault.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends StObject {
  
  /**
    * Adds an account to a hold. Accounts can be added only to a hold that does not have an organizational unit set. If you try to add an account to an organizational unit-based hold, an
    * error is returned.
    */
  def create(request: HoldId): Request[HeldAccount] = js.native
  def create(request: Key, body: HeldAccount): Request[HeldAccount] = js.native
  
  /** Removes an account from a hold. */
  def delete(): Request[js.Object] = js.native
  def delete(request: AccountId): Request[js.Object] = js.native
  
  /**
    * Lists the accounts covered by a hold. This can list only individually-specified accounts covered by the hold. If the hold covers an organizational unit, use the [Admin
    * SDK](https://developers.google.com/admin-sdk/). to list the members of the organizational unit on hold.
    */
  def list(): Request[ListHeldAccountsResponse] = js.native
  def list(request: Key): Request[ListHeldAccountsResponse] = js.native
}
