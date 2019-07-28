package typings.openjscad.CSGNs

import typings.openjscad.Anon_Back
import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Plane")
@js.native
class Plane protected () extends CxG {
  def this(normal: Vector3D, w: Double) = this()
  var normal: Vector3D = js.native
  var tag: Double = js.native
  var w: Double = js.native
  def equals(n: Plane): Boolean = js.native
  def flipped(): Plane = js.native
  def getTag(): Double = js.native
  def intersectWithLine(line3d: Line3D): Vector3D = js.native
  def intersectWithPlane(plane: Plane): Line3D = js.native
  def mirrorPoint(point3d: Vector3D): Vector3D = js.native
  def signedDistanceToPoint(point: Vector3D): Double = js.native
  def splitLineBetweenPoints(p1: Vector3D, p2: Vector3D): Vector3D = js.native
  def splitPolygon(polygon: Polygon): Anon_Back = js.native
}

/* static members */
@JSGlobal("CSG.Plane")
@js.native
object Plane extends js.Object {
  var EPSILON: Double = js.native
  def anyPlaneFromVector3Ds(a: Vector3D, b: Vector3D, c: Vector3D): Plane = js.native
  def fromNormalAndPoint(normal: js.Array[Double], point: js.Array[Double]): Plane = js.native
  def fromNormalAndPoint(normal: Vector3D, point: Vector3D): Plane = js.native
  def fromObject(obj: js.Any): Plane = js.native
  def fromPoints(a: Vector3D, b: Vector3D, c: Vector3D): Plane = js.native
  def fromVector3Ds(a: Vector3D, b: Vector3D, c: Vector3D): Plane = js.native
}

