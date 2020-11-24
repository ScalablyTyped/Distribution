package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationFade extends js.Object {
  
  /** The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s */
  var endTimeOffset: js.UndefOr[String] = js.native
  
  /** Required. Type of fade animation: `FADE_IN` or `FADE_OUT`. */
  var fadeType: js.UndefOr[String] = js.native
  
  /** The time to start the fade animation, in seconds. Default: 0 */
  var startTimeOffset: js.UndefOr[String] = js.native
  
  /** Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. */
  var xy: js.UndefOr[NormalizedCoordinate] = js.native
}
object AnimationFade {
  
  @scala.inline
  def apply(): AnimationFade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationFade]
  }
  
  @scala.inline
  implicit class AnimationFadeOps[Self <: AnimationFade] (val x: Self) extends AnyVal {
    
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
    def setEndTimeOffset(value: String): Self = this.set("endTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimeOffset: Self = this.set("endTimeOffset", js.undefined)
    
    @scala.inline
    def setFadeType(value: String): Self = this.set("fadeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeType: Self = this.set("fadeType", js.undefined)
    
    @scala.inline
    def setStartTimeOffset(value: String): Self = this.set("startTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeOffset: Self = this.set("startTimeOffset", js.undefined)
    
    @scala.inline
    def setXy(value: NormalizedCoordinate): Self = this.set("xy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXy: Self = this.set("xy", js.undefined)
  }
}
