package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AABBOptions extends js.Object {
  var lowerBound: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var upperBound: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

object AABBOptions {
  @scala.inline
  def apply(
    lowerBound: js.Tuple2[scala.Double, scala.Double] = null,
    upperBound: js.Tuple2[scala.Double, scala.Double] = null
  ): AABBOptions = {
    val __obj = js.Dynamic.literal()
    if (lowerBound != null) __obj.updateDynamic("lowerBound")(lowerBound)
    if (upperBound != null) __obj.updateDynamic("upperBound")(upperBound)
    __obj.asInstanceOf[AABBOptions]
  }
}

