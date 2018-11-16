package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Plane")
@js.native
class Plane protected ()
  extends openjscadLib.CxG {
  def this(normal: Vector3D, w: scala.Double) = this()
  var normal: Vector3D = js.native
  var tag: scala.Double = js.native
  var w: scala.Double = js.native
  def equals(n: Plane): scala.Boolean = js.native
  def flipped(): Plane = js.native
  def getTag(): scala.Double = js.native
  def intersectWithLine(line3d: Line3D): Vector3D = js.native
  def intersectWithPlane(plane: Plane): Line3D = js.native
  def mirrorPoint(point3d: Vector3D): Vector3D = js.native
  def signedDistanceToPoint(point: Vector3D): scala.Double = js.native
  def splitLineBetweenPoints(p1: Vector3D, p2: Vector3D): Vector3D = js.native
  def splitPolygon(polygon: Polygon): openjscadLib.Anon_Type = js.native
}

@JSGlobal("CSG.Plane")
@js.native
object Plane extends js.Object {
  var EPSILON: scala.Double = js.native
  def anyPlaneFromVector3Ds(a: openjscadLib.CSGNs.Vector3D, b: openjscadLib.CSGNs.Vector3D, c: openjscadLib.CSGNs.Vector3D): openjscadLib.CSGNs.Plane = js.native
  def fromNormalAndPoint(normal: js.Array[scala.Double], point: js.Array[scala.Double]): openjscadLib.CSGNs.Plane = js.native
  def fromNormalAndPoint(normal: openjscadLib.CSGNs.Vector3D, point: openjscadLib.CSGNs.Vector3D): openjscadLib.CSGNs.Plane = js.native
  def fromObject(obj: js.Any): openjscadLib.CSGNs.Plane = js.native
  def fromPoints(a: openjscadLib.CSGNs.Vector3D, b: openjscadLib.CSGNs.Vector3D, c: openjscadLib.CSGNs.Vector3D): openjscadLib.CSGNs.Plane = js.native
  def fromVector3Ds(a: openjscadLib.CSGNs.Vector3D, b: openjscadLib.CSGNs.Vector3D, c: openjscadLib.CSGNs.Vector3D): openjscadLib.CSGNs.Plane = js.native
}

