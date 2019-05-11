package typings
package phaserLib.PhaserNs.TypesNs.CoreNs

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
  def apply(postBoot: BootCallback = null, preBoot: BootCallback = null): CallbacksConfig = {
    val __obj = js.Dynamic.literal()
    if (postBoot != null) __obj.updateDynamic("postBoot")(postBoot)
    if (preBoot != null) __obj.updateDynamic("preBoot")(preBoot)
    __obj.asInstanceOf[CallbacksConfig]
  }
}

