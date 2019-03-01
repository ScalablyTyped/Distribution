package typings
package mlDashLevenbergDashMarquardtLib.mlDashLevenbergDashMarquardtMod.LMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coordinates of points to fit.
  */
trait Data extends js.Object {
  var x: js.Array[scala.Double]
  var y: js.Array[scala.Double]
}

object Data {
  @scala.inline
  def apply(x: js.Array[scala.Double], y: js.Array[scala.Double]): Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Data]
  }
}

