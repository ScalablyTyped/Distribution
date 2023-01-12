package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreprocessingConfig extends StObject {
  
  /** Audio preprocessing configuration. */
  var audio: js.UndefOr[Audio] = js.undefined
  
  /** Color preprocessing configuration. */
  var color: js.UndefOr[Color] = js.undefined
  
  /** Specify the video cropping configuration. */
  var crop: js.UndefOr[Crop] = js.undefined
  
  /** Deblock preprocessing configuration. */
  var deblock: js.UndefOr[Deblock] = js.undefined
  
  /** Denoise preprocessing configuration. */
  var denoise: js.UndefOr[Denoise] = js.undefined
  
  /** Specify the video pad filter configuration. */
  var pad: js.UndefOr[Pad] = js.undefined
}
object PreprocessingConfig {
  
  inline def apply(): PreprocessingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreprocessingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreprocessingConfig] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: Audio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCrop(value: Crop): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setDeblock(value: Deblock): Self = StObject.set(x, "deblock", value.asInstanceOf[js.Any])
    
    inline def setDeblockUndefined: Self = StObject.set(x, "deblock", js.undefined)
    
    inline def setDenoise(value: Denoise): Self = StObject.set(x, "denoise", value.asInstanceOf[js.Any])
    
    inline def setDenoiseUndefined: Self = StObject.set(x, "denoise", js.undefined)
    
    inline def setPad(value: Pad): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
