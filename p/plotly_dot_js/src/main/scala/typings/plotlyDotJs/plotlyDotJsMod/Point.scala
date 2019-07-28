package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var x: Double
  var y: Double
  var z: Double
}

object Point {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): Point = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[Point]
  }
}

