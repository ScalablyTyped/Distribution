package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.ChannelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResource extends js.Object {
  
  /** Retrieves a list of search resources */
  def list(): Request[SearchListResponse] = js.native
  def list(request: ChannelType): Request[SearchListResponse] = js.native
}
