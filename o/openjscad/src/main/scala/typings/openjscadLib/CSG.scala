package typings
package openjscadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG")
@js.native
class CSG ()
  extends CxG
     with ICenter {
  var cachedBoundingBox: js.Array[openjscadLib.CSGNs.Vector3D] = js.native
  var isCanonicalized: scala.Boolean = js.native
  var isRetesselated: scala.Boolean = js.native
  var polygons: js.Array[openjscadLib.CSGNs.Polygon] = js.native
  var properties: openjscadLib.CSGNs.Properties = js.native
  def canonicalized(): CSG = js.native
  /* CompleteClass */
  override def center(cAxes: js.Array[java.lang.String]): CxG = js.native
  def connectTo(
    myConnector: openjscadLib.CSGNs.Connector,
    otherConnector: openjscadLib.CSGNs.Connector,
    mirror: scala.Boolean,
    normalrotation: scala.Double
  ): CSG = js.native
  def contract(radius: scala.Double, resolution: scala.Double): CSG = js.native
  def cutByPlane(plane: openjscadLib.CSGNs.Plane): CSG = js.native
  def expand(radius: scala.Double, resolution: scala.Double): CSG = js.native
  def expandedShell(radius: scala.Double, resolution: scala.Double, unionWithThis: scala.Boolean): CSG = js.native
  def fixTJunctions(): CSG = js.native
  def getFeatures(features: js.Any): js.Any = js.native
  def getTransformationAndInverseTransformationToFlatLying(): js.Any = js.native
  def getTransformationToFlatLying(): js.Any = js.native
  def intersect(csg: js.Array[CSG]): CSG = js.native
  def intersect(csg: CSG): CSG = js.native
  def intersectSub(csg: CSG): CSG = js.native
  def intersectSub(csg: CSG, retesselate: scala.Boolean): CSG = js.native
  def intersectSub(csg: CSG, retesselate: scala.Boolean, canonicalize: scala.Boolean): CSG = js.native
  def invert(): CSG = js.native
  def lieFlat(): CSG = js.native
  def mayOverlap(csg: CSG): scala.Boolean = js.native
  def projectToOrthoNormalBasis(orthobasis: openjscadLib.CSGNs.OrthoNormalBasis): CAG = js.native
  def reTesselated(): CSG = js.native
  def sectionCut(orthobasis: openjscadLib.CSGNs.OrthoNormalBasis): CAG = js.native
  def setColor(args: js.Any): CSG = js.native
  def setShared(shared: openjscadLib.CSGNs.PolygonNs.Shared): CSG = js.native
  def stretchAtPlane(normal: js.Array[scala.Double], point: js.Array[scala.Double], length: scala.Double): CSG = js.native
  def subtract(csg: js.Array[CSG]): CSG = js.native
  def subtract(csg: CSG): CSG = js.native
  def subtractSub(csg: CSG, retesselate: scala.Boolean, canonicalize: scala.Boolean): CSG = js.native
  def toCompactBinary(): Anon_PolygonSharedIndexes = js.native
  def toPointCloud(cuberadius: js.Any): CSG = js.native
  def toPolygons(): js.Array[openjscadLib.CSGNs.Polygon] = js.native
  def toTriangles(): js.Array[_] = js.native
  def toX3D(): stdLib.Blob = js.native
  def transform1(matrix4x4: openjscadLib.CSGNs.Matrix4x4): CSG = js.native
  def union(csg: js.Array[CSG]): CSG = js.native
  def union(csg: CSG): CSG = js.native
  def unionForNonIntersecting(csg: CSG): CSG = js.native
  def unionSub(csg: CSG): CSG = js.native
  def unionSub(csg: CSG, retesselate: scala.Boolean): CSG = js.native
  def unionSub(csg: CSG, retesselate: scala.Boolean, canonicalize: scala.Boolean): CSG = js.native
}

@JSGlobal("CSG")
@js.native
object CSG extends js.Object {
  var defaultResolution2D: scala.Double = js.native
  var defaultResolution3D: scala.Double = js.native
  def fromCompactBinary(bin: js.Any): openjscadLib.CSG = js.native
  def fromObject(obj: js.Any): openjscadLib.CSG = js.native
  def fromPolygons(polygons: js.Array[openjscadLib.CSGNs.Polygon]): openjscadLib.CSG = js.native
  def fromSlices(options: js.Any): openjscadLib.CSG = js.native
}

