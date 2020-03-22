package typings.popmotionPopcorn.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @popmotion/popcorn.@popmotion/popcorn/lib/types.Point2D & {  z  :number} */
trait Point3D extends Point {
  var x: Double
  var y: Double
  var z: Double
}

object Point3D {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): Point3D = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Point3D]
  }
}

