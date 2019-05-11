package typings
package phaserLib.PhaserNs.TypesNs.CoreNs

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
  var context: js.UndefOr[stdLib.AudioContext] = js.undefined
  /**
    * Use HTML5 Audio instead of Web Audio.
    */
  var disableWebAudio: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable all audio output.
    */
  var noAudio: js.UndefOr[scala.Boolean] = js.undefined
}

object AudioConfig {
  @scala.inline
  def apply(
    context: stdLib.AudioContext = null,
    disableWebAudio: js.UndefOr[scala.Boolean] = js.undefined,
    noAudio: js.UndefOr[scala.Boolean] = js.undefined
  ): AudioConfig = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(disableWebAudio)) __obj.updateDynamic("disableWebAudio")(disableWebAudio)
    if (!js.isUndefined(noAudio)) __obj.updateDynamic("noAudio")(noAudio)
    __obj.asInstanceOf[AudioConfig]
  }
}

