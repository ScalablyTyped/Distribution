package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Polygon")
@js.native
class Polygon protected ()
  extends openjscadLib.CxG {
  def this(vertices: js.Array[Vertex]) = this()
  def this(vertices: Vector3D) = this()
  def this(vertices: js.Array[Vertex], shared: openjscadLib.CSGNs.PolygonNs.Shared) = this()
  def this(vertices: Vector3D, shared: openjscadLib.CSGNs.PolygonNs.Shared) = this()
  def this(vertices: js.Array[Vertex], shared: openjscadLib.CSGNs.PolygonNs.Shared, plane: Plane) = this()
  def this(vertices: Vector3D, shared: openjscadLib.CSGNs.PolygonNs.Shared, plane: Plane) = this()
  var cachedBoundingBox: js.Array[Vector3D] = js.native
  var cachedBoundingSphere: js.Any = js.native
  var plane: Plane = js.native
  var shared: openjscadLib.CSGNs.PolygonNs.Shared = js.native
  var vertices: js.Array[Vertex] = js.native
  /**
              *
              * @param walls Array of wall polygons
              * @param bottom Bottom polygon
              * @param top Top polygon
              */
  /* private */ def _addWalls(walls: js.Any, bottom: js.Any, top: js.Any, bFlipped: js.Any): js.Any = js.native
  def boundingBox(): js.Array[Vector3D] = js.native
  def boundingSphere(): js.Any = js.native
  def checkIfConvex(): scala.Unit = js.native
  def extrude(offsetvector: js.Any): openjscadLib.CSG = js.native
  def flipped(): Polygon = js.native
  def getArea(): scala.Double = js.native
  def getSignedVolume(): scala.Double = js.native
  def getTetraFeatures(features: js.Any): js.Array[_] = js.native
  def projectToOrthoNormalBasis(orthobasis: OrthoNormalBasis): openjscadLib.CAG = js.native
  def setColor(args: js.Any): Polygon = js.native
  /**
              * Creates solid from slices (CSG.Polygon) by generating walls
              * @param {Object} options Solid generating options
              *  - numslices {Number} Number of slices to be generated
              *  - callback(t, slice) {Function} Callback function generating slices.
              *          arguments: t = [0..1], slice = [0..numslices - 1]
              *          return: CSG.Polygon or null to skip
              *  - loop {Boolean} no flats, only walls, it's used to generate solids like a tor
              */
  def solidFromSlices(options: js.Any): openjscadLib.CSG = js.native
}

@JSGlobal("CSG.Polygon")
@js.native
object Polygon extends js.Object {
  var defaultShared: openjscadLib.CSGNs.PolygonNs.Shared = js.native
  def createFromPoints(points: js.Array[js.Array[scala.Double]]): openjscadLib.CSGNs.Polygon = js.native
  def createFromPoints(points: js.Array[js.Array[scala.Double]], shared: openjscadLib.CSGNs.PolygonNs.Shared): openjscadLib.CSGNs.Polygon = js.native
  def createFromPoints(
    points: js.Array[js.Array[scala.Double]],
    shared: openjscadLib.CSGNs.PolygonNs.Shared,
    plane: openjscadLib.CSGNs.Plane
  ): openjscadLib.CSGNs.Polygon = js.native
  def fromObject(obj: js.Any): openjscadLib.CSGNs.Polygon = js.native
  def isConvexPoint(prevpoint: js.Any, point: js.Any, nextpoint: js.Any, normal: js.Any): scala.Boolean = js.native
  def isStrictlyConvexPoint(prevpoint: js.Any, point: js.Any, nextpoint: js.Any, normal: js.Any): scala.Boolean = js.native
  def verticesConvex(vertices: js.Array[openjscadLib.CSGNs.Vertex], planenormal: js.Any): scala.Boolean = js.native
}

