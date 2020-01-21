package typings.p2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRelaxation extends js.Object {
  var relaxation: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
}

object AnonRelaxation {
  @scala.inline
  def apply(relaxation: Int | Double = null, stiffness: Int | Double = null): AnonRelaxation = {
    val __obj = js.Dynamic.literal()
    if (relaxation != null) __obj.updateDynamic("relaxation")(relaxation.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelaxation]
  }
}

