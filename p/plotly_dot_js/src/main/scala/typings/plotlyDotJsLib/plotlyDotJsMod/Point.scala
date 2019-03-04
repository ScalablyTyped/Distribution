package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
}

object Point {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, z: scala.Double): Point = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[Point]
  }
}

