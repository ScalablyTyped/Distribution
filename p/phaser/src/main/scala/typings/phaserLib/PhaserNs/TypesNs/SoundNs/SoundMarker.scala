package typings
package phaserLib.PhaserNs.TypesNs.SoundNs

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
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Unique identifier of a sound marker.
    */
  var name: java.lang.String
  /**
    * Sound position offset at witch playback should start.
    */
  var start: js.UndefOr[scala.Double] = js.undefined
}

object SoundMarker {
  @scala.inline
  def apply(
    name: java.lang.String,
    config: SoundConfig = null,
    duration: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): SoundMarker = {
    val __obj = js.Dynamic.literal(name = name)
    if (config != null) __obj.updateDynamic("config")(config)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundMarker]
  }
}

