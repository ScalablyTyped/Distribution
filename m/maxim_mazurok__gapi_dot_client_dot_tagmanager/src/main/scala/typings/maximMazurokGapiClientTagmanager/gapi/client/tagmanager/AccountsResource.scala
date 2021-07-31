package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTagmanager.anon.AccesstokenAltCallback
import typings.maximMazurokGapiClientTagmanager.anon.Callback
import typings.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typings.maximMazurokGapiClientTagmanager.anon.OauthtokenPageToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends StObject {
  
  var containers: ContainersResource = js.native
  
  /** Gets a GTM Account. */
  def get(): Request[Account] = js.native
  def get(request: Callback): Request[Account] = js.native
  
  /** Lists all GTM Accounts that a user has access to. */
  def list(): Request[ListAccountsResponse] = js.native
  def list(request: OauthtokenPageToken): Request[ListAccountsResponse] = js.native
  
  /** Updates a GTM Account. */
  def update(request: AccesstokenAltCallback): Request[Account] = js.native
  def update(request: Oauthtoken, body: Account): Request[Account] = js.native
  
  var user_permissions: UserPermissionsResource = js.native
}
