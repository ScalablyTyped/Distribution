package typings.mlDashLevenbergDashMarquardt.mlDashLevenbergDashMarquardtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coordinates of points to fit.
  */
trait Data extends js.Object {
  var x: js.Array[Double]
  var y: js.Array[Double]
}

object Data {
  @scala.inline
  def apply(x: js.Array[Double], y: js.Array[Double]): Data = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Data]
  }
}

