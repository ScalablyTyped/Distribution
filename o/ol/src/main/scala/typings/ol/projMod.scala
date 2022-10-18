package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projProjectionMod.default
import typings.ol.projUnitsMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projMod {
  
  @JSImport("ol/proj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCommon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCommon")().asInstanceOf[Unit]
  
  inline def addCoordinateTransforms(
    source: ProjectionLike,
    destination: ProjectionLike,
    forward: js.Function1[/* p0 */ Coordinate, Coordinate],
    inverse: js.Function1[/* p0 */ Coordinate, Coordinate]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCoordinateTransforms")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], forward.asInstanceOf[js.Any], inverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addEquivalentProjections(projections: js.Array[default]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEquivalentProjections")(projections.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addEquivalentTransforms(
    projections1: js.Array[default],
    projections2: js.Array[default],
    forwardTransform: TransformFunction,
    inverseTransform: TransformFunction
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEquivalentTransforms")(projections1.asInstanceOf[js.Any], projections2.asInstanceOf[js.Any], forwardTransform.asInstanceOf[js.Any], inverseTransform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addProjection(projection: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addProjection")(projection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addProjections(projections: js.Array[default]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addProjections")(projections.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearAllProjections(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllProjections")().asInstanceOf[Unit]
  
  inline def clearUserProjection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearUserProjection")().asInstanceOf[Unit]
  
  inline def cloneTransform(input: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneTransform")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def cloneTransform(input: js.Array[Double], opt_output: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneTransform")(input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def cloneTransform(input: js.Array[Double], opt_output: js.Array[Double], opt_dimension: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneTransform")(input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any], opt_dimension.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def cloneTransform(input: js.Array[Double], opt_output: Unit, opt_dimension: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneTransform")(input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any], opt_dimension.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def createProjection(projection: String, defaultCode: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createProjection")(projection.asInstanceOf[js.Any], defaultCode.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createProjection(projection: Unit, defaultCode: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createProjection")(projection.asInstanceOf[js.Any], defaultCode.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createProjection(projection: default, defaultCode: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createProjection")(projection.asInstanceOf[js.Any], defaultCode.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createSafeCoordinateTransform(sourceProj: default, destProj: default, transform: js.Function1[/* p0 */ Coordinate, Coordinate]): js.Function1[/* p0 */ Coordinate, Coordinate] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSafeCoordinateTransform")(sourceProj.asInstanceOf[js.Any], destProj.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* p0 */ Coordinate, Coordinate]]
  
  inline def createTransformFromCoordinateTransform(coordTransform: js.Function1[/* p0 */ Coordinate, Coordinate]): TransformFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformFromCoordinateTransform")(coordTransform.asInstanceOf[js.Any]).asInstanceOf[TransformFunction]
  
  inline def equivalent(projection1: default, projection2: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equivalent")(projection1.asInstanceOf[js.Any], projection2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fromLonLat(coordinate: Coordinate): Coordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLonLat")(coordinate.asInstanceOf[js.Any]).asInstanceOf[Coordinate]
  inline def fromLonLat(coordinate: Coordinate, opt_projection: ProjectionLike): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLonLat")(coordinate.asInstanceOf[js.Any], opt_projection.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def fromUserCoordinate(coordinate: js.Array[Double], destProjection: ProjectionLike): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUserCoordinate")(coordinate.asInstanceOf[js.Any], destProjection.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def fromUserExtent(extent: Extent, destProjection: ProjectionLike): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUserExtent")(extent.asInstanceOf[js.Any], destProjection.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def get(projectionLike: ProjectionLike): default = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(projectionLike.asInstanceOf[js.Any]).asInstanceOf[default]
  
  inline def getPointResolution(projection: ProjectionLike, resolution: Double, point: Coordinate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointResolution")(projection.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getPointResolution(projection: ProjectionLike, resolution: Double, point: Coordinate, opt_units: Units): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointResolution")(projection.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], point.asInstanceOf[js.Any], opt_units.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTransform(source: ProjectionLike, destination: ProjectionLike): TransformFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransform")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[TransformFunction]
  
  inline def getTransformFromProjections(sourceProjection: default, destinationProjection: default): TransformFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformFromProjections")(sourceProjection.asInstanceOf[js.Any], destinationProjection.asInstanceOf[js.Any])).asInstanceOf[TransformFunction]
  
  inline def getUserProjection(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserProjection")().asInstanceOf[default]
  
  inline def identityTransform(input: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("identityTransform")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def identityTransform(input: js.Array[Double], opt_output: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("identityTransform")(input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def identityTransform(input: js.Array[Double], opt_output: js.Array[Double], opt_dimension: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("identityTransform")(input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any], opt_dimension.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def identityTransform(input: js.Array[Double], opt_output: Unit, opt_dimension: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("identityTransform")(input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any], opt_dimension.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def setUserProjection(projection: ProjectionLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserProjection")(projection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toLonLat(coordinate: Coordinate): Coordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("toLonLat")(coordinate.asInstanceOf[js.Any]).asInstanceOf[Coordinate]
  inline def toLonLat(coordinate: Coordinate, opt_projection: ProjectionLike): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("toLonLat")(coordinate.asInstanceOf[js.Any], opt_projection.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def toUserCoordinate(coordinate: js.Array[Double], sourceProjection: ProjectionLike): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUserCoordinate")(coordinate.asInstanceOf[js.Any], sourceProjection.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def toUserExtent(extent: Extent, sourceProjection: ProjectionLike): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("toUserExtent")(extent.asInstanceOf[js.Any], sourceProjection.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def transform(coordinate: Coordinate, source: ProjectionLike, destination: ProjectionLike): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(coordinate.asInstanceOf[js.Any], source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def transformExtent(extent: Extent, source: ProjectionLike, destination: ProjectionLike): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("transformExtent")(extent.asInstanceOf[js.Any], source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Extent]
  inline def transformExtent(extent: Extent, source: ProjectionLike, destination: ProjectionLike, opt_stops: Double): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("transformExtent")(extent.asInstanceOf[js.Any], source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opt_stops.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def transformWithProjections(point: Coordinate, sourceProjection: default, destinationProjection: default): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("transformWithProjections")(point.asInstanceOf[js.Any], sourceProjection.asInstanceOf[js.Any], destinationProjection.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def useGeographic(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useGeographic")().asInstanceOf[Unit]
  
  type ProjectionLike = default | String
  
  type TransformFunction = js.Function3[
    /* p0 */ js.Array[Double], 
    /* p1 */ js.UndefOr[js.Array[Double]], 
    /* p2 */ js.UndefOr[Double], 
    js.Array[Double]
  ]
}
