package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoStream extends StObject {
  
  /** H264 codec settings. */
  var h264: js.UndefOr[H264CodecSettings] = js.undefined
  
  /** H265 codec settings. */
  var h265: js.UndefOr[H265CodecSettings] = js.undefined
  
  /** VP9 codec settings. */
  var vp9: js.UndefOr[Vp9CodecSettings] = js.undefined
}
object VideoStream {
  
  inline def apply(): VideoStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoStream]
  }
  
  extension [Self <: VideoStream](x: Self) {
    
    inline def setH264(value: H264CodecSettings): Self = StObject.set(x, "h264", value.asInstanceOf[js.Any])
    
    inline def setH264Undefined: Self = StObject.set(x, "h264", js.undefined)
    
    inline def setH265(value: H265CodecSettings): Self = StObject.set(x, "h265", value.asInstanceOf[js.Any])
    
    inline def setH265Undefined: Self = StObject.set(x, "h265", js.undefined)
    
    inline def setVp9(value: Vp9CodecSettings): Self = StObject.set(x, "vp9", value.asInstanceOf[js.Any])
    
    inline def setVp9Undefined: Self = StObject.set(x, "vp9", js.undefined)
  }
}
