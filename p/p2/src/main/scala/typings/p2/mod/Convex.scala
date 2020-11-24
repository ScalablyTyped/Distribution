package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Convex")
@js.native
class Convex () extends Shape {
  def this(options: ConvexOptions) = this()
  
  var axes: js.Array[js.Tuple2[Double, Double]] = js.native
  
  var centerOfMass: js.Tuple2[Double, Double] = js.native
  
  def projectOntoLocalAxis(localAxis: js.Array[Double], result: js.Array[Double]): Unit = js.native
  
  def projectOntoWorldAxis(
    localAxis: js.Array[Double],
    shapeOffset: js.Array[Double],
    shapeAngle: Double,
    result: js.Array[Double]
  ): Unit = js.native
  
  var triangles: js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  
  def updateCenterOfMass(): Unit = js.native
  
  def updateNormals(): Unit = js.native
  
  def updateTriangles(): Unit = js.native
  
  var vertices: js.Array[js.Tuple2[Double, Double]] = js.native
}
/* static members */
@JSImport("p2", "Convex")
@js.native
object Convex extends js.Object {
  
  def triangleArea(a: js.Array[Double], b: js.Array[Double], c: js.Array[Double]): Double = js.native
}
