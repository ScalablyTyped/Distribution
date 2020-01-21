package typings.pendoIoBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrowSize extends js.Object {
  var arrowSize: js.UndefOr[Double] = js.undefined
}

object AnonArrowSize {
  @scala.inline
  def apply(arrowSize: Int | Double = null): AnonArrowSize = {
    val __obj = js.Dynamic.literal()
    if (arrowSize != null) __obj.updateDynamic("arrowSize")(arrowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrowSize]
  }
}

