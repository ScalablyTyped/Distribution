package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.ChannelId
import typings.maximMazurokGapiClientYoutube.anon.OnBehalfOfContentOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelBannersResource extends js.Object {
  
  /** Inserts a new resource into this collection. */
  def insert(request: ChannelId): Request[ChannelBannerResource] = js.native
  def insert(request: OnBehalfOfContentOwner, body: ChannelBannerResource): Request[ChannelBannerResource] = js.native
}
