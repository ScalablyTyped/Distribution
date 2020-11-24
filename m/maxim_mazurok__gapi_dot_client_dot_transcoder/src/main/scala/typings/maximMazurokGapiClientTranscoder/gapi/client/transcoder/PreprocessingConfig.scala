package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreprocessingConfig extends js.Object {
  
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
  implicit class PreprocessingConfigOps[Self <: PreprocessingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAudio(value: Audio): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCrop(value: Crop): Self = this.set("crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    
    @scala.inline
    def setDeblock(value: Deblock): Self = this.set("deblock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeblock: Self = this.set("deblock", js.undefined)
    
    @scala.inline
    def setDenoise(value: Denoise): Self = this.set("denoise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDenoise: Self = this.set("denoise", js.undefined)
  }
}
