package typings.p2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Relaxation extends js.Object {
  var relaxation: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
}

object Anon_Relaxation {
  @scala.inline
  def apply(relaxation: Int | Double = null, stiffness: Int | Double = null): Anon_Relaxation = {
    val __obj = js.Dynamic.literal()
    if (relaxation != null) __obj.updateDynamic("relaxation")(relaxation.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Relaxation]
  }
}

