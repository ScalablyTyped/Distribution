package typings.phaser.Phaser.Types.Core

import typings.std.AudioContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config object containing various sound settings.
  */
trait AudioConfig extends js.Object {
  /**
    * An existing Web Audio context.
    */
  var context: js.UndefOr[AudioContext] = js.undefined
  /**
    * Use HTML5 Audio instead of Web Audio.
    */
  var disableWebAudio: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable all audio output.
    */
  var noAudio: js.UndefOr[Boolean] = js.undefined
}

object AudioConfig {
  @scala.inline
  def apply(
    context: AudioContext = null,
    disableWebAudio: js.UndefOr[Boolean] = js.undefined,
    noAudio: js.UndefOr[Boolean] = js.undefined
  ): AudioConfig = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWebAudio)) __obj.updateDynamic("disableWebAudio")(disableWebAudio.asInstanceOf[js.Any])
    if (!js.isUndefined(noAudio)) __obj.updateDynamic("noAudio")(noAudio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioConfig]
  }
}

