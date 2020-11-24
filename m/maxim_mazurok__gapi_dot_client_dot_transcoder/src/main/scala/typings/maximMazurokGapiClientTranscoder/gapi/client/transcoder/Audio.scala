package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audio extends js.Object {
  
  /** Enable boosting high frequency components. The default is `false`. */
  var highBoost: js.UndefOr[Boolean] = js.native
  
  /** Enable boosting low frequency components. The default is `false`. */
  var lowBoost: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify audio loudness normalization in loudness units relative to full scale (LUFS). Enter a value between -24 and 0, where -24 is the Advanced Television Systems Committee (ATSC
    * A/85), -23 is the EU R128 broadcast standard, -19 is the prior standard for online mono audio, -18 is the ReplayGain standard, -16 is the prior standard for stereo audio, -14 is the
    * new online audio standard recommended by Spotify, as well as Amazon Echo, and 0 disables normalization. The default is 0.
    */
  var lufs: js.UndefOr[Double] = js.native
}
object Audio {
  
  @scala.inline
  def apply(): Audio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audio]
  }
  
  @scala.inline
  implicit class AudioOps[Self <: Audio] (val x: Self) extends AnyVal {
    
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
    def setHighBoost(value: Boolean): Self = this.set("highBoost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighBoost: Self = this.set("highBoost", js.undefined)
    
    @scala.inline
    def setLowBoost(value: Boolean): Self = this.set("lowBoost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowBoost: Self = this.set("lowBoost", js.undefined)
    
    @scala.inline
    def setLufs(value: Double): Self = this.set("lufs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLufs: Self = this.set("lufs", js.undefined)
  }
}
