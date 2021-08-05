package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
object Convex {
  
  @JSImport("p2", "Convex")
  @js.native
  val ^ : js.Any = js.native
  
  inline def triangleArea(a: js.Array[Double], b: js.Array[Double], c: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("triangleArea")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
}
