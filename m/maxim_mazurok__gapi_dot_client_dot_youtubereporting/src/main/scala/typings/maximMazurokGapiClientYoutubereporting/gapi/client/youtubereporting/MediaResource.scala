package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutubereporting.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaResource extends StObject {
  
  /** Method for media download. Download is supported on the URI `/v1/media/{+name}?alt=media`. */
  def download(): Request[GdataMedia] = js.native
  def download(request: Key): Request[GdataMedia] = js.native
}
