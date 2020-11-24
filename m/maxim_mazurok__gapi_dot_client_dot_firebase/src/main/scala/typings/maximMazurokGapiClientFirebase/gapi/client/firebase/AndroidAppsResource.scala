package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebase.anon.Alt
import typings.maximMazurokGapiClientFirebase.anon.Fields
import typings.maximMazurokGapiClientFirebase.anon.Key
import typings.maximMazurokGapiClientFirebase.anon.Name
import typings.maximMazurokGapiClientFirebase.anon.Oauthtoken
import typings.maximMazurokGapiClientFirebase.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidAppsResource extends js.Object {
  
  def create(request: Fields, body: AndroidApp): Request[Operation] = js.native
  /**
    * Requests the creation of a new AndroidApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The
    * `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
    */
  def create(request: Key): Request[Operation] = js.native
  
  /** Gets the specified AndroidApp. */
  def get(): Request[AndroidApp] = js.native
  def get(request: Alt): Request[AndroidApp] = js.native
  
  /** Gets the configuration artifact associated with the specified AndroidApp. */
  def getConfig(): Request[AndroidAppConfig] = js.native
  def getConfig(request: Alt): Request[AndroidAppConfig] = js.native
  
  /**
    * Lists each AndroidApp associated with the specified FirebaseProject. The elements are returned in no particular order, but will be a consistent view of the Apps when additional
    * requests are made with a `pageToken`.
    */
  def list(): Request[ListAndroidAppsResponse] = js.native
  def list(request: Oauthtoken): Request[ListAndroidAppsResponse] = js.native
  
  /** Updates the attributes of the specified AndroidApp. */
  def patch(request: Name): Request[AndroidApp] = js.native
  def patch(request: PrettyPrint, body: AndroidApp): Request[AndroidApp] = js.native
  
  var sha: ShaResource = js.native
}
