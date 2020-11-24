package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebase.anon.Alt
import typings.maximMazurokGapiClientFirebase.anon.Fields
import typings.maximMazurokGapiClientFirebase.anon.Oauthtoken
import typings.maximMazurokGapiClientFirebase.anon.PrettyPrint
import typings.maximMazurokGapiClientFirebase.anon.UpdateMask
import typings.maximMazurokGapiClientFirebase.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAppsResource extends js.Object {
  
  def create(request: Fields, body: WebApp): Request[Operation] = js.native
  /**
    * Requests the creation of a new WebApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The
    * `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
    */
  def create(request: UploadType): Request[Operation] = js.native
  
  /** Gets the specified WebApp. */
  def get(): Request[WebApp] = js.native
  def get(request: Alt): Request[WebApp] = js.native
  
  /** Gets the configuration artifact associated with the specified WebApp. */
  def getConfig(): Request[WebAppConfig] = js.native
  def getConfig(request: Alt): Request[WebAppConfig] = js.native
  
  /**
    * Lists each WebApp associated with the specified FirebaseProject. The elements are returned in no particular order, but will be a consistent view of the Apps when additional requests
    * are made with a `pageToken`.
    */
  def list(): Request[ListWebAppsResponse] = js.native
  def list(request: Oauthtoken): Request[ListWebAppsResponse] = js.native
  
  def patch(request: PrettyPrint, body: WebApp): Request[WebApp] = js.native
  /** Updates the attributes of the specified WebApp. */
  def patch(request: UpdateMask): Request[WebApp] = js.native
}
