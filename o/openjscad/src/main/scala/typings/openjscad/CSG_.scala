package typings.openjscad

import typings.openjscad.CSG.Connector
import typings.openjscad.CSG.Matrix4x4
import typings.openjscad.CSG.OrthoNormalBasis
import typings.openjscad.CSG.Plane
import typings.openjscad.CSG.Polygon
import typings.openjscad.CSG.Polygon.Shared
import typings.openjscad.CSG.Properties
import typings.openjscad.CSG.Vector3D
import typings.openjscad.anon.Class
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSG_
  extends CxG
     with ICenter {
  var cachedBoundingBox: js.Array[Vector3D] = js.native
  var isCanonicalized: Boolean = js.native
  var isRetesselated: Boolean = js.native
  var polygons: js.Array[Polygon] = js.native
  var properties: Properties = js.native
  def canonicalized(): CSG = js.native
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
  def toCompactBinary(): Class = js.native
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

