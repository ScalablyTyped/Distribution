package typings.openjscad

import typings.openjscad.CAG.Side
import typings.openjscad.CSG.Matrix4x4
import typings.openjscad.CSG.OrthoNormalBasis
import typings.openjscad.CSG.Path2D
import typings.openjscad.CSG.Polygon
import typings.openjscad.CSG.Vector3D
import typings.openjscad.anon.SideVertexIndices
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CAG_
  extends CxG
     with ICenter {
  var isCanonicalized: Boolean = js.native
  var sides: js.Array[Side] = js.native
  def _toCSGWall(z0: js.Any, z1: js.Any): CSG = js.native
  def _toPlanePolygons(options: js.Any): js.Array[Polygon] = js.native
  def _toVector3DPairs(m: Matrix4x4): js.Array[js.Array[Vector3D]] = js.native
  def _toWallPolygons(options: js.Any): js.Array[_] = js.native
  def area(): Double = js.native
  def canonicalized(): CAG = js.native
  def check(): Unit = js.native
  def contract(radius: Double, resolution: Double): CAG = js.native
  def expand(radius: Double, resolution: Double): CAG = js.native
  def expandedShell(radius: Double, resolution: Double): CAG = js.native
  def extrude(options: CAGExtrudeOptions): CSG = js.native
  def extrudeInOrthonormalBasis(orthonormalbasis: OrthoNormalBasis, depth: Double): CSG = js.native
  def extrudeInOrthonormalBasis(orthonormalbasis: OrthoNormalBasis, depth: Double, options: js.Any): CSG = js.native
  def extrudeInPlane(axis1: js.Any, axis2: js.Any, depth: js.Any, options: js.Any): CSG = js.native
  def flipped(): CAG = js.native
  def getOutlinePaths(): js.Array[Path2D] = js.native
  def intersect(cag: js.Array[CAG]): CAG = js.native
  def intersect(cag: CAG): CAG = js.native
  def isSelfIntersecting(): Boolean = js.native
  def overCutInsideCorners(cutterradius: js.Any): CAG = js.native
  def rotateExtrude(options: js.Any): CSG = js.native
  def subtract(cag: js.Array[CAG]): CAG = js.native
  def subtract(cag: CAG): CAG = js.native
  def toCompactBinary(): SideVertexIndices = js.native
  def toDxf(): Blob = js.native
  def union(cag: js.Array[CAG]): CAG = js.native
  def union(cag: CAG): CAG = js.native
}

