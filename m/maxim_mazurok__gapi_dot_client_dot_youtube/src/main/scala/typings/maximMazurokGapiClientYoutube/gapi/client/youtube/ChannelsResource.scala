package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.CategoryId
import typings.maximMazurokGapiClientYoutube.anon.Part
import typings.maximMazurokGapiClientYoutube.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends js.Object {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[ChannelListResponse] = js.native
  def list(request: CategoryId): Request[ChannelListResponse] = js.native
  
  /** Updates an existing resource. */
  def update(request: Part): Request[Channel] = js.native
  def update(request: PrettyPrint, body: Channel): Request[Channel] = js.native
}
