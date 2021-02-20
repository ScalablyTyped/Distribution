package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreprocessingConfig extends StObject {
  
  /** Audio preprocessing configuration. */
  var audio: js.UndefOr[Audio] = js.native
  
  /** Color preprocessing configuration. */
  var color: js.UndefOr[Color] = js.native
  
  /** Specify the video cropping configuration. */
  var crop: js.UndefOr[Crop] = js.native
  
  /** Deblock preprocessing configuration. */
  var deblock: js.UndefOr[Deblock] = js.native
  
  /** Denoise preprocessing configuration. */
  var denoise: js.UndefOr[Denoise] = js.native
}
object PreprocessingConfig {
  
  @scala.inline
  def apply(): PreprocessingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreprocessingConfig]
  }
  
  @scala.inline
  implicit class PreprocessingConfigMutableBuilder[Self <: PreprocessingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: Audio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCrop(value: Crop): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    @scala.inline
    def setDeblock(value: Deblock): Self = StObject.set(x, "deblock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeblockUndefined: Self = StObject.set(x, "deblock", js.undefined)
    
    @scala.inline
    def setDenoise(value: Denoise): Self = StObject.set(x, "denoise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenoiseUndefined: Self = StObject.set(x, "denoise", js.undefined)
  }
}
