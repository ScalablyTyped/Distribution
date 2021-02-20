package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audio extends StObject {
  
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
  implicit class AudioMutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighBoost(value: Boolean): Self = StObject.set(x, "highBoost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighBoostUndefined: Self = StObject.set(x, "highBoost", js.undefined)
    
    @scala.inline
    def setLowBoost(value: Boolean): Self = StObject.set(x, "lowBoost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowBoostUndefined: Self = StObject.set(x, "lowBoost", js.undefined)
    
    @scala.inline
    def setLufs(value: Double): Self = StObject.set(x, "lufs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLufsUndefined: Self = StObject.set(x, "lufs", js.undefined)
  }
}
