package typings.poly2tri.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointLike extends js.Object {
  /** x coordinate */
  var x: Double
  /** y coordinate */
  var y: Double
}

object IPointLike {
  @scala.inline
  def apply(x: Double, y: Double): IPointLike = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPointLike]
  }
}

