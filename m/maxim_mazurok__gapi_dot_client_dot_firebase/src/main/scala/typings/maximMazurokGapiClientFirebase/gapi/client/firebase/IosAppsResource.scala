package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebase.anon.Alt
import typings.maximMazurokGapiClientFirebase.anon.Fields
import typings.maximMazurokGapiClientFirebase.anon.Oauthtoken
import typings.maximMazurokGapiClientFirebase.anon.PrettyPrint
import typings.maximMazurokGapiClientFirebase.anon.QuotaUser
import typings.maximMazurokGapiClientFirebase.anon.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosAppsResource extends js.Object {
  
  def create(request: Fields, body: IosApp): Request[Operation] = js.native
  /**
    * Requests the creation of a new IosApp in the specified FirebaseProject. The result of this call is an `Operation` which can be used to track the provisioning process. The
    * `Operation` is automatically deleted after completion, so there is no need to call `DeleteOperation`.
    */
  def create(request: QuotaUser): Request[Operation] = js.native
  
  /** Gets the specified IosApp. */
  def get(): Request[IosApp] = js.native
  def get(request: Alt): Request[IosApp] = js.native
  
  /** Gets the configuration artifact associated with the specified IosApp. */
  def getConfig(): Request[IosAppConfig] = js.native
  def getConfig(request: Alt): Request[IosAppConfig] = js.native
  
  /**
    * Lists each IosApp associated with the specified FirebaseProject. The elements are returned in no particular order, but will be a consistent view of the Apps when additional requests
    * are made with a `pageToken`.
    */
  def list(): Request[ListIosAppsResponse] = js.native
  def list(request: Oauthtoken): Request[ListIosAppsResponse] = js.native
  
  def patch(request: PrettyPrint, body: IosApp): Request[IosApp] = js.native
  /** Updates the attributes of the specified IosApp. */
  def patch(request: Resource): Request[IosApp] = js.native
}
