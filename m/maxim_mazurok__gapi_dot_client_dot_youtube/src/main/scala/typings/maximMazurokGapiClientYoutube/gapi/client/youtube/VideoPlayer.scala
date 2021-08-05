package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoPlayer extends StObject {
  
  var embedHeight: js.UndefOr[String] = js.undefined
  
  /** An <iframe> tag that embeds a player that will play the video. */
  var embedHtml: js.UndefOr[String] = js.undefined
  
  /** The embed width */
  var embedWidth: js.UndefOr[String] = js.undefined
}
object VideoPlayer {
  
  inline def apply(): VideoPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPlayer]
  }
  
  extension [Self <: VideoPlayer](x: Self) {
    
    inline def setEmbedHeight(value: String): Self = StObject.set(x, "embedHeight", value.asInstanceOf[js.Any])
    
    inline def setEmbedHeightUndefined: Self = StObject.set(x, "embedHeight", js.undefined)
    
    inline def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
    
    inline def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
    
    inline def setEmbedWidth(value: String): Self = StObject.set(x, "embedWidth", value.asInstanceOf[js.Any])
    
    inline def setEmbedWidthUndefined: Self = StObject.set(x, "embedWidth", js.undefined)
  }
}
