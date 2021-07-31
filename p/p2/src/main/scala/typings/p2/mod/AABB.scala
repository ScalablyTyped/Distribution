package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "AABB")
@js.native
class AABB () extends StObject {
  def this(options: AABBOptions) = this()
  
  def containsPoint(point: js.Tuple2[Double, Double]): Boolean = js.native
  
  def copy(aabb: AABB): Unit = js.native
  
  def extend(aabb: AABB): Unit = js.native
  
  var lowerBound: js.Tuple2[Double, Double] = js.native
  
  def overlaps(aabb: AABB): Boolean = js.native
  
  def overlapsRay(ray: Ray): Double = js.native
  
  def setFromPoints(points: js.Array[js.Tuple2[Double, Double]], position: js.Tuple2[Double, Double]): Unit = js.native
  def setFromPoints(points: js.Array[js.Tuple2[Double, Double]], position: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def setFromPoints(
    points: js.Array[js.Tuple2[Double, Double]],
    position: js.Tuple2[Double, Double],
    angle: Double,
    skinSize: Double
  ): Unit = js.native
  def setFromPoints(
    points: js.Array[js.Tuple2[Double, Double]],
    position: js.Tuple2[Double, Double],
    angle: Unit,
    skinSize: Double
  ): Unit = js.native
  
  var upperBound: js.Tuple2[Double, Double] = js.native
}
