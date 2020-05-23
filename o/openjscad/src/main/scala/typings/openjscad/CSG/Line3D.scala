package typings.openjscad.CSG

import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line3D extends CxG {
  var direction: Vector3D = js.native
  var point: Vector3D = js.native
  def closestPointOnLine(point: Vector3D): Vector3D = js.native
  def distanceToPoint(point: Vector3D): Double = js.native
  def equals(line3d: Line3D): Boolean = js.native
  def intersectWithPlane(plane: Plane): Vector3D = js.native
  def reverse(): Line3D = js.native
}

