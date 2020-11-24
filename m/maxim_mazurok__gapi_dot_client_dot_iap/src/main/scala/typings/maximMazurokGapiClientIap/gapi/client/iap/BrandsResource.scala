package typings.maximMazurokGapiClientIap.gapi.client.iap

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIap.anon.Alt
import typings.maximMazurokGapiClientIap.anon.Callback
import typings.maximMazurokGapiClientIap.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrandsResource extends js.Object {
  
  def create(request: Alt, body: Brand): Request[Brand] = js.native
  /**
    * Constructs a new OAuth brand for the project if one does not exist. The created brand is "internal only", meaning that OAuth clients created under it only accept requests from users
    * who belong to the same G Suite organization as the project. The brand is created in an un-reviewed status. NOTE: The "internal only" status can be manually changed in the Google
    * Cloud console. Requires that a brand does not already exist for the project, and that the specified support email is owned by the caller.
    */
  def create(request: Oauthtoken): Request[Brand] = js.native
  
  /** Retrieves the OAuth brand of the project. */
  def get(): Request[Brand] = js.native
  def get(request: Callback): Request[Brand] = js.native
  
  var identityAwareProxyClients: IdentityAwareProxyClientsResource = js.native
  
  /** Lists the existing brands for the project. */
  def list(): Request[ListBrandsResponse] = js.native
  def list(request: Alt): Request[ListBrandsResponse] = js.native
}
