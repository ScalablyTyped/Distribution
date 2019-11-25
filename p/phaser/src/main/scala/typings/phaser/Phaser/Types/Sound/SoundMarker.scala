package typings.phaser.Phaser.Types.Sound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Marked section of a sound represented by name, and optionally start time, duration, and config object.
  */
trait SoundMarker extends js.Object {
  /**
    * An optional config object containing default marker settings.
    */
  var config: js.UndefOr[SoundConfig] = js.undefined
  /**
    * Playback duration of this marker.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Unique identifier of a sound marker.
    */
  var name: String
  /**
    * Sound position offset at witch playback should start.
    */
  var start: js.UndefOr[Double] = js.undefined
}

object SoundMarker {
  @scala.inline
  def apply(
    name: String,
    config: SoundConfig = null,
    duration: Int | Double = null,
    start: Int | Double = null
  ): SoundMarker = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundMarker]
  }
}

