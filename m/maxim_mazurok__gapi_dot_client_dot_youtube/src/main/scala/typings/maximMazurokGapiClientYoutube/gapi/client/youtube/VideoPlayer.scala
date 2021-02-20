package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoPlayer extends StObject {
  
  var embedHeight: js.UndefOr[String] = js.native
  
  /** An <iframe> tag that embeds a player that will play the video. */
  var embedHtml: js.UndefOr[String] = js.native
  
  /** The embed width */
  var embedWidth: js.UndefOr[String] = js.native
}
object VideoPlayer {
  
  @scala.inline
  def apply(): VideoPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPlayer]
  }
  
  @scala.inline
  implicit class VideoPlayerMutableBuilder[Self <: VideoPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbedHeight(value: String): Self = StObject.set(x, "embedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedHeightUndefined: Self = StObject.set(x, "embedHeight", js.undefined)
    
    @scala.inline
    def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
    
    @scala.inline
    def setEmbedWidth(value: String): Self = StObject.set(x, "embedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedWidthUndefined: Self = StObject.set(x, "embedWidth", js.undefined)
  }
}
