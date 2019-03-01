package typings
package poly2triLib.poly2triMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointLike extends js.Object {
  /** x coordinate */
  var x: scala.Double
  /** y coordinate */
  var y: scala.Double
}

object IPointLike {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): IPointLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[IPointLike]
  }
}

