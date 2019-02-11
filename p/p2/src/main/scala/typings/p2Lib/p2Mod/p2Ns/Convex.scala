package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Convex extends Shape {
  var axes: js.Array[js.Tuple2[scala.Double, scala.Double]] = js.native
  var centerOfMass: js.Tuple2[scala.Double, scala.Double] = js.native
  var triangles: js.Tuple3[
    js.Tuple2[scala.Double, scala.Double], 
    js.Tuple2[scala.Double, scala.Double], 
    js.Tuple2[scala.Double, scala.Double]
  ] = js.native
  var vertices: js.Array[js.Tuple2[scala.Double, scala.Double]] = js.native
  def projectOntoLocalAxis(localAxis: js.Array[scala.Double], result: js.Array[scala.Double]): scala.Unit = js.native
  def projectOntoWorldAxis(
    localAxis: js.Array[scala.Double],
    shapeOffset: js.Array[scala.Double],
    shapeAngle: scala.Double,
    result: js.Array[scala.Double]
  ): scala.Unit = js.native
  def updateCenterOfMass(): scala.Unit = js.native
  def updateNormals(): scala.Unit = js.native
  def updateTriangles(): scala.Unit = js.native
}

