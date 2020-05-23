package typings.p2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relaxation extends js.Object {
  var relaxation: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
}

object Relaxation {
  @scala.inline
  def apply(relaxation: js.UndefOr[Double] = js.undefined, stiffness: js.UndefOr[Double] = js.undefined): Relaxation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(relaxation)) __obj.updateDynamic("relaxation")(relaxation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relaxation]
  }
}

