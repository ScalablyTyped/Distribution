package typings.openjscad.CSG

import typings.openjscad.CAG
import typings.openjscad.CSG.Polygon.Shared
import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Polygon")
@js.native
class Polygon protected () extends CxG {
  def this(vertices: js.Array[Vertex]) = this()
  def this(vertices: Vector3D) = this()
  def this(vertices: js.Array[Vertex], shared: Shared) = this()
  def this(vertices: Vector3D, shared: Shared) = this()
  def this(vertices: js.Array[Vertex], shared: Shared, plane: Plane) = this()
  def this(vertices: Vector3D, shared: Shared, plane: Plane) = this()
  var cachedBoundingBox: js.Array[Vector3D] = js.native
  var cachedBoundingSphere: js.Any = js.native
  var plane: Plane = js.native
  var shared: Shared = js.native
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
  def checkIfConvex(): Unit = js.native
  def extrude(offsetvector: js.Any): typings.openjscad.CSG = js.native
  def flipped(): Polygon = js.native
  def getArea(): Double = js.native
  def getSignedVolume(): Double = js.native
  def getTetraFeatures(features: js.Any): js.Array[_] = js.native
  def projectToOrthoNormalBasis(orthobasis: OrthoNormalBasis): CAG = js.native
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
  def solidFromSlices(options: js.Any): typings.openjscad.CSG = js.native
}

/* static members */
@JSGlobal("CSG.Polygon")
@js.native
object Polygon extends js.Object {
  @js.native
  class Shared protected () extends js.Object {
    def this(color: js.Any) = this()
    var color: js.Any = js.native
    var tag: js.Any = js.native
    def getHash(): js.Any = js.native
    def getTag(): js.Any = js.native
  }
  
  var defaultShared: Shared = js.native
  def createFromPoints(points: js.Array[js.Array[Double]]): Polygon = js.native
  def createFromPoints(points: js.Array[js.Array[Double]], shared: Shared): Polygon = js.native
  def createFromPoints(points: js.Array[js.Array[Double]], shared: Shared, plane: Plane): Polygon = js.native
  def fromObject(obj: js.Any): Polygon = js.native
  def isConvexPoint(prevpoint: js.Any, point: js.Any, nextpoint: js.Any, normal: js.Any): Boolean = js.native
  def isStrictlyConvexPoint(prevpoint: js.Any, point: js.Any, nextpoint: js.Any, normal: js.Any): Boolean = js.native
  def verticesConvex(vertices: js.Array[Vertex], planenormal: js.Any): Boolean = js.native
  /* static members */
  @js.native
  object Shared extends js.Object {
    def fromColor(args: js.Any): Shared = js.native
    def fromObject(obj: js.Any): Shared = js.native
  }
  
}

