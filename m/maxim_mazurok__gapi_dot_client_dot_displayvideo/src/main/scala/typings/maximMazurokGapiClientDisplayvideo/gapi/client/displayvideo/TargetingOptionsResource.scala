package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.TargetingOptionId
import typings.maximMazurokGapiClientDisplayvideo.anon.TargetingTypeUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingOptionsResource extends js.Object {
  
  /** Gets a single targeting option. */
  def get(): Request[TargetingOption] = js.native
  def get(request: TargetingOptionId): Request[TargetingOption] = js.native
  
  /** Lists targeting options of a given type. */
  def list(): Request[ListTargetingOptionsResponse] = js.native
  def list(request: TargetingTypeUploadType): Request[ListTargetingOptionsResponse] = js.native
}
