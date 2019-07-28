package typings.openjscad

import typings.openjscad.CSGNs.Connector
import typings.openjscad.CSGNs.Matrix4x4
import typings.openjscad.CSGNs.OrthoNormalBasis
import typings.openjscad.CSGNs.Plane
import typings.openjscad.CSGNs.Polygon
import typings.openjscad.CSGNs.PolygonNs.Shared
import typings.openjscad.CSGNs.Properties
import typings.openjscad.CSGNs.Vector3D
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG")
@js.native
class CSG ()
  extends CxG
     with ICenter {
  var cachedBoundingBox: js.Array[Vector3D] = js.native
  var isCanonicalized: Boolean = js.native
  var isRetesselated: Boolean = js.native
  var polygons: js.Array[Polygon] = js.native
  var properties: Properties = js.native
  def canonicalized(): CSG = js.native
  /* CompleteClass */
  override def center(cAxes: js.Array[String]): CxG = js.native
  def connectTo(myConnector: Connector, otherConnector: Connector, mirror: Boolean, normalrotation: Double): CSG = js.native
  def contract(radius: Double, resolution: Double): CSG = js.native
  def cutByPlane(plane: Plane): CSG = js.native
  def expand(radius: Double, resolution: Double): CSG = js.native
  def expandedShell(radius: Double, resolution: Double, unionWithThis: Boolean): CSG = js.native
  def fixTJunctions(): CSG = js.native
  def getFeatures(features: js.Any): js.Any = js.native
  def getTransformationAndInverseTransformationToFlatLying(): js.Any = js.native
  def getTransformationToFlatLying(): js.Any = js.native
  def intersect(csg: js.Array[CSG]): CSG = js.native
  def intersect(csg: CSG): CSG = js.native
  def intersectSub(csg: CSG): CSG = js.native
  def intersectSub(csg: CSG, retesselate: Boolean): CSG = js.native
  def intersectSub(csg: CSG, retesselate: Boolean, canonicalize: Boolean): CSG = js.native
  def invert(): CSG = js.native
  def lieFlat(): CSG = js.native
  def mayOverlap(csg: CSG): Boolean = js.native
  def projectToOrthoNormalBasis(orthobasis: OrthoNormalBasis): CAG = js.native
  def reTesselated(): CSG = js.native
  def sectionCut(orthobasis: OrthoNormalBasis): CAG = js.native
  def setColor(args: js.Any): CSG = js.native
  def setShared(shared: Shared): CSG = js.native
  def stretchAtPlane(normal: js.Array[Double], point: js.Array[Double], length: Double): CSG = js.native
  def subtract(csg: js.Array[CSG]): CSG = js.native
  def subtract(csg: CSG): CSG = js.native
  def subtractSub(csg: CSG, retesselate: Boolean, canonicalize: Boolean): CSG = js.native
  def toCompactBinary(): Anon_Class = js.native
  def toPointCloud(cuberadius: js.Any): CSG = js.native
  def toPolygons(): js.Array[Polygon] = js.native
  def toTriangles(): js.Array[_] = js.native
  def toX3D(): Blob = js.native
  def transform1(matrix4x4: Matrix4x4): CSG = js.native
  def union(csg: js.Array[CSG]): CSG = js.native
  def union(csg: CSG): CSG = js.native
  def unionForNonIntersecting(csg: CSG): CSG = js.native
  def unionSub(csg: CSG): CSG = js.native
  def unionSub(csg: CSG, retesselate: Boolean): CSG = js.native
  def unionSub(csg: CSG, retesselate: Boolean, canonicalize: Boolean): CSG = js.native
}

/* static members */
@JSGlobal("CSG")
@js.native
object CSG extends js.Object {
  var defaultResolution2D: Double = js.native
  var defaultResolution3D: Double = js.native
  def fromCompactBinary(bin: js.Any): CSG = js.native
  def fromObject(obj: js.Any): CSG = js.native
  def fromPolygons(polygons: js.Array[Polygon]): CSG = js.native
  def fromSlices(options: js.Any): CSG = js.native
}

