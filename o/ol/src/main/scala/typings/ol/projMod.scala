package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projectionMod.default
import typings.ol.unitsMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj", JSImport.Namespace)
@js.native
object projMod extends js.Object {
  def addCommon(): Unit = js.native
  def addCoordinateTransforms(
    source: ProjectionLike,
    destination: ProjectionLike,
    forward: js.Function1[/* p0 */ Coordinate, Coordinate],
    inverse: js.Function1[/* p0 */ Coordinate, Coordinate]
  ): Unit = js.native
  def addEquivalentProjections(projections: js.Array[default]): Unit = js.native
  def addEquivalentTransforms(
    projections1: js.Array[default],
    projections2: js.Array[default],
    forwardTransform: TransformFunction,
    inverseTransform: TransformFunction
  ): Unit = js.native
  def addProjection(projection: default): Unit = js.native
  def addProjections(projections: js.Array[default]): Unit = js.native
  def clearAllProjections(): Unit = js.native
  def clearUserProjection(): Unit = js.native
  def cloneTransform(input: js.Array[Double]): js.Array[Double] = js.native
  def cloneTransform(input: js.Array[Double], opt_output: js.Array[Double]): js.Array[Double] = js.native
  def cloneTransform(input: js.Array[Double], opt_output: js.Array[Double], opt_dimension: Double): js.Array[Double] = js.native
  def createProjection(projection: js.UndefOr[scala.Nothing], defaultCode: String): default = js.native
  def createProjection(projection: String, defaultCode: String): default = js.native
  def createProjection(projection: default, defaultCode: String): default = js.native
  def createTransformFromCoordinateTransform(coordTransform: js.Function1[/* p0 */ Coordinate, Coordinate]): TransformFunction = js.native
  def equivalent(projection1: default, projection2: default): Boolean = js.native
  def fromLonLat(coordinate: Coordinate): Coordinate = js.native
  def fromLonLat(coordinate: Coordinate, opt_projection: ProjectionLike): Coordinate = js.native
  def fromUserCoordinate(coordinate: js.Array[Double], destProjection: ProjectionLike): js.Array[Double] = js.native
  def fromUserExtent(extent: Extent, destProjection: ProjectionLike): Extent = js.native
  def get(projectionLike: ProjectionLike): default = js.native
  def getPointResolution(projection: ProjectionLike, resolution: Double, point: Coordinate): Double = js.native
  def getPointResolution(projection: ProjectionLike, resolution: Double, point: Coordinate, opt_units: Units): Double = js.native
  def getTransform(source: ProjectionLike, destination: ProjectionLike): TransformFunction = js.native
  def getTransformFromProjections(sourceProjection: default, destinationProjection: default): TransformFunction = js.native
  def getUserProjection(): default = js.native
  def identityTransform(input: js.Array[Double]): js.Array[Double] = js.native
  def identityTransform(input: js.Array[Double], opt_output: js.Array[Double]): js.Array[Double] = js.native
  def identityTransform(input: js.Array[Double], opt_output: js.Array[Double], opt_dimension: Double): js.Array[Double] = js.native
  def setUserProjection(projection: ProjectionLike): Unit = js.native
  def toLonLat(coordinate: Coordinate): Coordinate = js.native
  def toLonLat(coordinate: Coordinate, opt_projection: ProjectionLike): Coordinate = js.native
  def toUserCoordinate(coordinate: js.Array[Double], sourceProjection: ProjectionLike): js.Array[Double] = js.native
  def toUserExtent(extent: Extent, sourceProjection: ProjectionLike): Extent = js.native
  def transform(coordinate: Coordinate, source: ProjectionLike, destination: ProjectionLike): Coordinate = js.native
  def transformExtent(extent: Extent, source: ProjectionLike, destination: ProjectionLike): Extent = js.native
  def transformWithProjections(point: Coordinate, sourceProjection: default, destinationProjection: default): Coordinate = js.native
  def useGeographic(): Unit = js.native
  type ProjectionLike = default | String
  type TransformFunction = js.Function3[
    /* p0 */ js.Array[Double], 
    /* p1 */ js.UndefOr[js.Array[Double]], 
    /* p2 */ js.UndefOr[Double], 
    js.Array[Double]
  ]
}

