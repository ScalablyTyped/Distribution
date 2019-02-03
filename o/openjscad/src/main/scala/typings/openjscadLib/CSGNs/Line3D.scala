package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Line3D")
@js.native
class Line3D protected ()
  extends openjscadLib.CxG {
  def this(point: Vector3D, direction: Vector3D) = this()
  var direction: Vector3D = js.native
  var point: Vector3D = js.native
  def closestPointOnLine(point: Vector3D): Vector3D = js.native
  def distanceToPoint(point: Vector3D): scala.Double = js.native
  def equals(line3d: Line3D): scala.Boolean = js.native
  def intersectWithPlane(plane: Plane): Vector3D = js.native
  def reverse(): Line3D = js.native
}

/* static members */
@JSGlobal("CSG.Line3D")
@js.native
object Line3D extends js.Object {
  def fromPlanes(p1: openjscadLib.CSGNs.Plane, p2: openjscadLib.CSGNs.Plane): openjscadLib.CSGNs.Line3D = js.native
  def fromPoints(p1: openjscadLib.CSGNs.Vector3D, p2: openjscadLib.CSGNs.Vector3D): openjscadLib.CSGNs.Line3D = js.native
}

