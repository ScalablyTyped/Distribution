package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScale extends js.Object {
  var scale: js.UndefOr[Double] = js.undefined
}

object AnonScale {
  @scala.inline
  def apply(scale: Int | Double = null): AnonScale = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScale]
  }
}

