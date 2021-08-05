package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Video extends StObject {
  
  /** The video source's unique identifier for this video. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The video source. */
  var source: js.UndefOr[String] = js.undefined
  
  /** An URL to a video. The URL is valid as long as the source video exists and sharing settings do not change. */
  var url: js.UndefOr[String] = js.undefined
  
  /** The properties of the video. */
  var videoProperties: js.UndefOr[VideoProperties] = js.undefined
}
object Video {
  
  inline def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  
  extension [Self <: Video](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVideoProperties(value: VideoProperties): Self = StObject.set(x, "videoProperties", value.asInstanceOf[js.Any])
    
    inline def setVideoPropertiesUndefined: Self = StObject.set(x, "videoProperties", js.undefined)
  }
}
