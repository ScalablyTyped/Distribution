package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Convex extends Shape {
  var axes: js.Array[js.Array[scala.Double]]
  var centerOfMass: js.Array[scala.Double]
  var triangles: js.Array[scala.Double]
  var vertices: js.Array[js.Array[scala.Double]]
  def projectOntoLocalAxis(localAxis: js.Array[scala.Double], result: js.Array[scala.Double]): scala.Unit
  def projectOntoWorldAxis(
    localAxis: js.Array[scala.Double],
    shapeOffset: js.Array[scala.Double],
    shapeAngle: scala.Double,
    result: js.Array[scala.Double]
  ): scala.Unit
  def updateCenterOfMass(): scala.Unit
}

