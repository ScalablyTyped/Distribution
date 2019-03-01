package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionOptions extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
}

object TransitionOptions {
  @scala.inline
  def apply(duration: scala.Int | scala.Double = null, easing: java.lang.String = null): TransitionOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    __obj.asInstanceOf[TransitionOptions]
  }
}

