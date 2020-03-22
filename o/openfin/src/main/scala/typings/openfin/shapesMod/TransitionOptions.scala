package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionOptions extends js.Object {
  var interrupt: Boolean
  var tween: js.UndefOr[String] = js.undefined
}

object TransitionOptions {
  @scala.inline
  def apply(interrupt: Boolean, tween: String = null): TransitionOptions = {
    val __obj = js.Dynamic.literal(interrupt = interrupt.asInstanceOf[js.Any])
    if (tween != null) __obj.updateDynamic("tween")(tween.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionOptions]
  }
}

