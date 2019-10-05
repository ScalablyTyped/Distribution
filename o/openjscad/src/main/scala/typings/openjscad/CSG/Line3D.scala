package typings.openjscad.CSG

import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Line3D")
@js.native
class Line3D protected () extends CxG {
  def this(point: Vector3D, direction: Vector3D) = this()
  var direction: Vector3D = js.native
  var point: Vector3D = js.native
  def closestPointOnLine(point: Vector3D): Vector3D = js.native
  def distanceToPoint(point: Vector3D): Double = js.native
  def equals(line3d: Line3D): Boolean = js.native
  def intersectWithPlane(plane: Plane): Vector3D = js.native
  def reverse(): Line3D = js.native
}

/* static members */
@JSGlobal("CSG.Line3D")
@js.native
object Line3D extends js.Object {
  def fromPlanes(p1: Plane, p2: Plane): Line3D = js.native
  def fromPoints(p1: Vector3D, p2: Vector3D): Line3D = js.native
}

