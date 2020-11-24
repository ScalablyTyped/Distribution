package typings.phaser.Phaser.Types.Sound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Marked section of a sound represented by name, and optionally start time, duration, and config object.
  */
@js.native
trait SoundMarker extends js.Object {
  
  /**
    * An optional config object containing default marker settings.
    */
  var config: js.UndefOr[SoundConfig] = js.native
  
  /**
    * Playback duration of this marker.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Unique identifier of a sound marker.
    */
  var name: String = js.native
  
  /**
    * Sound position offset at witch playback should start.
    */
  var start: js.UndefOr[Double] = js.native
}
object SoundMarker {
  
  @scala.inline
  def apply(name: String): SoundMarker = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundMarker]
  }
  
  @scala.inline
  implicit class SoundMarkerOps[Self <: SoundMarker] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: SoundConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
