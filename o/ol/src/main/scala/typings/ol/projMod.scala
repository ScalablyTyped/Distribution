package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projectionMod.default
import typings.ol.unitsMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projMod {
  
  @JSImport("ol/proj", "addCommon")
  @js.native
  def addCommon(): Unit = js.native
  
  @JSImport("ol/proj", "addCoordinateTransforms")
  @js.native
  def addCoordinateTransforms(
    source: ProjectionLike,
    destination: ProjectionLike,
    forward: js.Function1[/* p0 */ Coordinate, Coordinate],
    inverse: js.Function1[/* p0 */ Coordinate, Coordinate]
  ): Unit = js.native
  
  @JSImport("ol/proj", "addEquivalentProjections")
  @js.native
  def addEquivalentProjections(projections: js.Array[default]): Unit = js.native
  
  @JSImport("ol/proj", "addEquivalentTransforms")
  @js.native
  def addEquivalentTransforms(
    projections1: js.Array[default],
    projections2: js.Array[default],
    forwardTransform: TransformFunction,
    inverseTransform: TransformFunction
  ): Unit = js.native
  
  @JSImport("ol/proj", "addProjection")
  @js.native
  def addProjection(projection: default): Unit = js.native
  
  @JSImport("ol/proj", "addProjections")
  @js.native
  def addProjections(projections: js.Array[default]): Unit = js.native
  
  @JSImport("ol/proj", "clearAllProjections")
  @js.native
  def clearAllProjections(): Unit = js.native
  
  @JSImport("ol/proj", "clearUserProjection")
  @js.native
  def clearUserProjection(): Unit = js.native
  
  @JSImport("ol/proj", "cloneTransform")
  @js.native
  def cloneTransform(input: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("ol/proj", "cloneTransform")
  @js.native
  def cloneTransform(input: js.Array[Double], opt_output: js.UndefOr[scala.Nothing], opt_dimension: Double): js.Array[Double] = js.native
  @JSImport("ol/proj", "cloneTransform")
  @js.native
  def cloneTransform(input: js.Array[Double], opt_output: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("ol/proj", "cloneTransform")
  @js.native
  def cloneTransform(input: js.Array[Double], opt_output: js.Array[Double], opt_dimension: Double): js.Array[Double] = js.native
  
  @JSImport("ol/proj", "createProjection")
  @js.native
  def createProjection(projection: js.UndefOr[scala.Nothing], defaultCode: String): default = js.native
  @JSImport("ol/proj", "createProjection")
  @js.native
  def createProjection(projection: String, defaultCode: String): default = js.native
  @JSImport("ol/proj", "createProjection")
  @js.native
  def createProjection(projection: default, defaultCode: String): default = js.native
  
  @JSImport("ol/proj", "createSafeCoordinateTransform")
  @js.native
  def createSafeCoordinateTransform(sourceProj: default, destProj: default, transform: js.Function1[/* p0 */ Coordinate, Coordinate]): js.Function1[/* p0 */ Coordinate, Coordinate] = js.native
  
  @JSImport("ol/proj", "createTransformFromCoordinateTransform")
  @js.native
  def createTransformFromCoordinateTransform(coordTransform: js.Function1[/* p0 */ Coordinate, Coordinate]): TransformFunction = js.native
  
  @JSImport("ol/proj", "equivalent")
  @js.native
  def equivalent(projection1: default, projection2: default): Boolean = js.native
  
  @JSImport("ol/proj", "fromLonLat")
  @js.native
  def fromLonLat(coordinate: Coordinate): Coordinate = js.native
  @JSImport("ol/proj", "fromLonLat")
  @js.native
  def fromLonLat(coordinate: Coordinate, opt_projection: ProjectionLike): Coordinate = js.native
  
  @JSImport("ol/proj", "fromUserCoordinate")
  @js.native
  def fromUserCoordinate(coordinate: js.Array[Double], destProjection: ProjectionLike): js.Array[Double] = js.native
  
  @JSImport("ol/proj", "fromUserExtent")
  @js.native
  def fromUserExtent(extent: Extent, destProjection: ProjectionLike): Extent = js.native
  
  @JSImport("ol/proj", "get")
  @js.native
  def get(projectionLike: ProjectionLike): default = js.native
  
  @JSImport("ol/proj", "getPointResolution")
  @js.native
  def getPointResolution(projection: ProjectionLike, resolution: Double, point: Coordinate): Double = js.native
  @JSImport("ol/proj", "getPointResolution")
  @js.native
  def getPointResolution(projection: ProjectionLike, resolution: Double, point: Coordinate, opt_units: Units): Double = js.native
  
  @JSImport("ol/proj", "getTransform")
  @js.native
  def getTransform(source: ProjectionLike, destination: ProjectionLike): TransformFunction = js.native
  
  @JSImport("ol/proj", "getTransformFromProjections")
  @js.native
  def getTransformFromProjections(sourceProjection: default, destinationProjection: default): TransformFunction = js.native
  
  @JSImport("ol/proj", "getUserProjection")
  @js.native
  def getUserProjection(): default = js.native
  
  @JSImport("ol/proj", "identityTransform")
  @js.native
  def identityTransform(input: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("ol/proj", "identityTransform")
  @js.native
  def identityTransform(input: js.Array[Double], opt_output: js.UndefOr[scala.Nothing], opt_dimension: Double): js.Array[Double] = js.native
  @JSImport("ol/proj", "identityTransform")
  @js.native
  def identityTransform(input: js.Array[Double], opt_output: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("ol/proj", "identityTransform")
  @js.native
  def identityTransform(input: js.Array[Double], opt_output: js.Array[Double], opt_dimension: Double): js.Array[Double] = js.native
  
  @JSImport("ol/proj", "setUserProjection")
  @js.native
  def setUserProjection(projection: ProjectionLike): Unit = js.native
  
  @JSImport("ol/proj", "toLonLat")
  @js.native
  def toLonLat(coordinate: Coordinate): Coordinate = js.native
  @JSImport("ol/proj", "toLonLat")
  @js.native
  def toLonLat(coordinate: Coordinate, opt_projection: ProjectionLike): Coordinate = js.native
  
  @JSImport("ol/proj", "toUserCoordinate")
  @js.native
  def toUserCoordinate(coordinate: js.Array[Double], sourceProjection: ProjectionLike): js.Array[Double] = js.native
  
  @JSImport("ol/proj", "toUserExtent")
  @js.native
  def toUserExtent(extent: Extent, sourceProjection: ProjectionLike): Extent = js.native
  
  @JSImport("ol/proj", "transform")
  @js.native
  def transform(coordinate: Coordinate, source: ProjectionLike, destination: ProjectionLike): Coordinate = js.native
  
  @JSImport("ol/proj", "transformExtent")
  @js.native
  def transformExtent(extent: Extent, source: ProjectionLike, destination: ProjectionLike): Extent = js.native
  @JSImport("ol/proj", "transformExtent")
  @js.native
  def transformExtent(extent: Extent, source: ProjectionLike, destination: ProjectionLike, opt_stops: Double): Extent = js.native
  
  @JSImport("ol/proj", "transformWithProjections")
  @js.native
  def transformWithProjections(point: Coordinate, sourceProjection: default, destinationProjection: default): Coordinate = js.native
  
  @JSImport("ol/proj", "useGeographic")
  @js.native
  def useGeographic(): Unit = js.native
  
  type ProjectionLike = default | String
  
  type TransformFunction = js.Function3[
    /* p0 */ js.Array[Double], 
    /* p1 */ js.UndefOr[js.Array[Double]], 
    /* p2 */ js.UndefOr[Double], 
    js.Array[Double]
  ]
}
