package typings
package atPopmotionPopcornLib.libUtilsInterpolateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolateOptions[T] extends js.Object {
  var clamp: js.UndefOr[scala.Boolean] = js.undefined
  var ease: js.UndefOr[MixEasing] = js.undefined
  var mixer: js.UndefOr[MixerFactory[T]] = js.undefined
}

object InterpolateOptions {
  @scala.inline
  def apply[T](
    clamp: js.UndefOr[scala.Boolean] = js.undefined,
    ease: MixEasing = null,
    mixer: MixerFactory[T] = null
  ): InterpolateOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clamp)) __obj.updateDynamic("clamp")(clamp)
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (mixer != null) __obj.updateDynamic("mixer")(mixer)
    __obj.asInstanceOf[InterpolateOptions[T]]
  }
}

