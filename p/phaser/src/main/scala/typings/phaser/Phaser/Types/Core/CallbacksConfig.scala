package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbacksConfig extends js.Object {
  /**
    * A function to run at the end of the boot sequence. At this point, all the game systems have started and plugins have been loaded.
    */
  var postBoot: js.UndefOr[BootCallback] = js.undefined
  /**
    * A function to run at the start of the boot sequence.
    */
  var preBoot: js.UndefOr[BootCallback] = js.undefined
}

object CallbacksConfig {
  @scala.inline
  def apply(postBoot: /* game */ Game => Unit = null, preBoot: /* game */ Game => Unit = null): CallbacksConfig = {
    val __obj = js.Dynamic.literal()
    if (postBoot != null) __obj.updateDynamic("postBoot")(js.Any.fromFunction1(postBoot))
    if (preBoot != null) __obj.updateDynamic("preBoot")(js.Any.fromFunction1(preBoot))
    __obj.asInstanceOf[CallbacksConfig]
  }
}

