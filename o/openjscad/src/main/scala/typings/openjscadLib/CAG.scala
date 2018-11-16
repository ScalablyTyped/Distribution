package typings
package openjscadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CAG")
@js.native
class CAG ()
  extends CxG
     with ICenter {
  var isCanonicalized: scala.Boolean = js.native
  var sides: js.Array[openjscadLib.CAGNs.Side] = js.native
  def _toCSGWall(z0: js.Any, z1: js.Any): CSG = js.native
  def _toPlanePolygons(options: js.Any): js.Array[openjscadLib.CSGNs.Polygon] = js.native
  def _toVector3DPairs(m: openjscadLib.CSGNs.Matrix4x4): js.Array[js.Array[openjscadLib.CSGNs.Vector3D]] = js.native
  def _toWallPolygons(options: js.Any): js.Array[_] = js.native
  def area(): scala.Double = js.native
  def canonicalized(): CAG = js.native
  /* CompleteClass */
  override def center(cAxes: js.Array[java.lang.String]): CxG = js.native
  def check(): scala.Unit = js.native
  def contract(radius: scala.Double, resolution: scala.Double): CAG = js.native
  def expand(radius: scala.Double, resolution: scala.Double): CAG = js.native
  def expandedShell(radius: scala.Double, resolution: scala.Double): CAG = js.native
  def extrude(options: CAG_extrude_options): CSG = js.native
  def extrudeInOrthonormalBasis(orthonormalbasis: openjscadLib.CSGNs.OrthoNormalBasis, depth: scala.Double): CSG = js.native
  def extrudeInOrthonormalBasis(orthonormalbasis: openjscadLib.CSGNs.OrthoNormalBasis, depth: scala.Double, options: js.Any): CSG = js.native
  def extrudeInPlane(axis1: js.Any, axis2: js.Any, depth: js.Any, options: js.Any): CSG = js.native
  def flipped(): CAG = js.native
  def getOutlinePaths(): js.Array[openjscadLib.CSGNs.Path2D] = js.native
  def intersect(cag: js.Array[CAG]): CAG = js.native
  def intersect(cag: CAG): CAG = js.native
  def isSelfIntersecting(): scala.Boolean = js.native
  def overCutInsideCorners(cutterradius: js.Any): CAG = js.native
  def rotateExtrude(options: js.Any): CSG = js.native
  def subtract(cag: js.Array[CAG]): CAG = js.native
  def subtract(cag: CAG): CAG = js.native
  def toCompactBinary(): Anon_VertexData = js.native
  def toDxf(): stdLib.Blob = js.native
  def union(cag: js.Array[CAG]): CAG = js.native
  def union(cag: CAG): CAG = js.native
}

@JSGlobal("CAG")
@js.native
object CAG extends js.Object {
  def PathsToDxf(paths: js.Array[openjscadLib.CSGNs.Path2D]): stdLib.Blob = js.native
  def circle(options: openjscadLib.CSGNs.ICircleOptions): openjscadLib.CAG = js.native
  def fromCompactBinary(bin: js.Any): openjscadLib.CAG = js.native
  def fromFakeCSG(csg: openjscadLib.CSG): openjscadLib.CAG = js.native
  def fromPoints(points: js.Array[openjscadLib.CSGNs.Vector2D]): openjscadLib.CAG = js.native
  def fromPointsNoCheck(points: js.Array[openjscadLib.CSGNs.Vector2D]): openjscadLib.CAG = js.native
  def fromSides(sides: js.Array[openjscadLib.CAGNs.Side]): openjscadLib.CAG = js.native
  def linesIntersect(
    p0start: openjscadLib.CSGNs.Vector2D,
    p0end: openjscadLib.CSGNs.Vector2D,
    p1start: openjscadLib.CSGNs.Vector2D,
    p1end: openjscadLib.CSGNs.Vector2D
  ): scala.Boolean = js.native
  def rectangle(options: openjscadLib.CSGNs.IRectangleOptions): openjscadLib.CAG = js.native
  def roundedRectangle(options: js.Any): openjscadLib.CAG = js.native
}

