package typings.maximMazurokGapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGamesconfiguration.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageConfigurationsResource extends js.Object {
  
  /** Uploads an image for a resource with the given ID and image type. */
  def upload(): Request[ImageConfiguration] = js.native
  def upload(request: Fields): Request[ImageConfiguration] = js.native
}
