package typings.phaser.Phaser.Types.Sound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config object containing various sound settings.
  */
@js.native
trait SoundConfig extends js.Object {
  
  /**
    * Time, in seconds, that should elapse before the sound actually starts its playback.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Represents detuning of sound in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
    */
  var detune: js.UndefOr[Double] = js.native
  
  /**
    * Whether or not the sound or current sound marker should loop.
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean indicating whether the sound should be muted or not.
    */
  var mute: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the speed at which the sound should be played.
    */
  var rate: js.UndefOr[Double] = js.native
  
  /**
    * Position of playback for this sound, in seconds.
    */
  var seek: js.UndefOr[Double] = js.native
  
  /**
    * A value between 0 (silence) and 1 (full volume).
    */
  var volume: js.UndefOr[Double] = js.native
}
object SoundConfig {
  
  @scala.inline
  def apply(): SoundConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoundConfig]
  }
  
  @scala.inline
  implicit class SoundConfigOps[Self <: SoundConfig] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDetune(value: Double): Self = this.set("detune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetune: Self = this.set("detune", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMute(value: Boolean): Self = this.set("mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMute: Self = this.set("mute", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    
    @scala.inline
    def setSeek(value: Double): Self = this.set("seek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeek: Self = this.set("seek", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
