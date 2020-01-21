package typings.openjscad

import typings.openjscad.CAG.Side
import typings.openjscad.CSG.ICircleOptions
import typings.openjscad.CSG.IRectangleOptions
import typings.openjscad.CSG.Matrix4x4
import typings.openjscad.CSG.OrthoNormalBasis
import typings.openjscad.CSG.Path2D
import typings.openjscad.CSG.Polygon
import typings.openjscad.CSG.Vector2D
import typings.openjscad.CSG.Vector3D
import typings.openjscad.CSG.fuzzyFactory
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CAG")
@js.native
class CAG ()
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
  /* CompleteClass */
  override def center(cAxes: js.Array[String]): CxG = js.native
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
  def toCompactBinary(): AnonClassSideVertexIndices = js.native
  def toDxf(): Blob = js.native
  def union(cag: js.Array[CAG]): CAG = js.native
  def union(cag: CAG): CAG = js.native
}

/* static members */
@JSGlobal("CAG")
@js.native
object CAG extends js.Object {
  @js.native
  class Side protected () extends CxG {
    def this(vertex0: Vertex, vertex1: Vertex) = this()
    var tag: Double = js.native
    var vertex0: Vertex = js.native
    var vertex1: Vertex = js.native
    def direction(): Vector2D = js.native
    def flipped(): Side = js.native
    def getTag(): Double = js.native
    def length(): Double = js.native
    def lengthSquared(): Double = js.native
    def toPolygon3D(z0: js.Any, z1: js.Any): Polygon = js.native
  }
  
  @js.native
  class Vertex protected () extends js.Object {
    def this(pos: Vector2D) = this()
    var pos: Vector2D = js.native
    var tag: Double = js.native
    def getTag(): Double = js.native
  }
  
  @js.native
  class fuzzyCAGFactory () extends js.Object {
    var vertexfactory: fuzzyFactory = js.native
    def getCAG(sourcecag: CAG): CAG = js.native
    def getSide(sourceside: Side): Side = js.native
    def getVertex(sourcevertex: Vertex): Vertex = js.native
  }
  
  def PathsToDxf(paths: js.Array[Path2D]): Blob = js.native
  def circle(options: ICircleOptions): CAG = js.native
  def fromCompactBinary(bin: js.Any): CAG = js.native
  def fromFakeCSG(csg: CSG): CAG = js.native
  def fromPoints(points: js.Array[Vector2D]): CAG = js.native
  def fromPointsNoCheck(points: js.Array[Vector2D]): CAG = js.native
  def fromSides(sides: js.Array[Side]): CAG = js.native
  def linesIntersect(p0start: Vector2D, p0end: Vector2D, p1start: Vector2D, p1end: Vector2D): Boolean = js.native
  def rectangle(options: IRectangleOptions): CAG = js.native
  def roundedRectangle(options: js.Any): CAG = js.native
  /* static members */
  @js.native
  object Side extends js.Object {
    def _fromFakePolygon(polygon: Polygon): Side = js.native
  }
  
}

