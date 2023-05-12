package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.projProjectionMod.Options
import typings.ol.projProjectionMod.default
import typings.ol.projUnitsMod.MetersPerUnitLookup
import typings.ol.projUnitsMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projMod {
  
  @JSImport("ol/proj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/proj", "METERS_PER_UNIT")
  @js.native
  val METERS_PER_UNIT: MetersPerUnitLookup = js.native
  
  /**
    * @typedef {Object} Options
    * @property {string} code The SRS identifier code, e.g. `EPSG:4326`.
    * @property {import("./Units.js").Units} [units] Units. Required unless a
    * proj4 projection is defined for `code`.
    * @property {import("../extent.js").Extent} [extent] The validity extent for the SRS.
    * @property {string} [axisOrientation='enu'] The axis orientation as specified in Proj4.
    * @property {boolean} [global=false] Whether the projection is valid for the whole globe.
    * @property {number} [metersPerUnit] The meters per unit for the SRS.
    * If not provided, the `units` are used to get the meters per unit from the {@link METERS_PER_UNIT}
    * lookup table.
    * @property {import("../extent.js").Extent} [worldExtent] The world extent for the SRS.
    * @property {function(number, import("../coordinate.js").Coordinate):number} [getPointResolution]
    * Function to determine resolution at a point. The function is called with a
    * `number` view resolution and a {@link module:ol/coordinate~Coordinate} as arguments, and returns
    * the `number` resolution in projection units at the passed coordinate. If this is `undefined`,
    * the default {@link module:ol/proj.getPointResolution} function will be used.
    */
  /**
    * @classdesc
    * Projection definition class. One of these is created for each projection
    * supported in the application and stored in the {@link module:ol/proj} namespace.
    * You can use these in applications, but this is not required, as API params
    * and options use {@link module:ol/proj~ProjectionLike} which means the simple string
    * code will suffice.
    *
    * You can use {@link module:ol/proj.get} to retrieve the object for a particular
    * projection.
    *
    * The library includes definitions for `EPSG:4326` and `EPSG:3857`, together
    * with the following aliases:
    * * `EPSG:4326`: CRS:84, urn:ogc:def:crs:EPSG:6.6:4326,
    *     urn:ogc:def:crs:OGC:1.3:CRS84, urn:ogc:def:crs:OGC:2:84,
    *     http://www.opengis.net/gml/srs/epsg.xml#4326,
    *     urn:x-ogc:def:crs:EPSG:4326
    * * `EPSG:3857`: EPSG:102100, EPSG:102113, EPSG:900913,
    *     urn:ogc:def:crs:EPSG:6.18:3:3857,
    *     http://www.opengis.net/gml/srs/epsg.xml#3857
    *
    * If you use [proj4js](https://github.com/proj4js/proj4js), aliases can
    * be added using `proj4.defs()`. After all required projection definitions are
    * added, call the {@link module:ol/proj/proj4.register} function.
    *
    * @api
    */
  @JSImport("ol/proj", "Projection")
  @js.native
  open class Projection protected () extends default {
    /**
      * @param {Options} options Projection options.
      */
    def this(options: Options) = this()
  }
  
  inline def addCommon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCommon")().asInstanceOf[Unit]
  
  inline def addCoordinateTransforms(
    source: ProjectionLike,
    destination: ProjectionLike,
    forward: js.Function1[/* arg0 */ Coordinate, Coordinate],
    inverse: js.Function1[/* arg0 */ Coordinate, Coordinate]
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
  inline def cloneTransform(input: js.Array[Double], output: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneTransform")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def createProjection(projection: String, defaultCode: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createProjection")(projection.asInstanceOf[js.Any], defaultCode.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createProjection(projection: Unit, defaultCode: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createProjection")(projection.asInstanceOf[js.Any], defaultCode.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createProjection(projection: default, defaultCode: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createProjection")(projection.asInstanceOf[js.Any], defaultCode.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createSafeCoordinateTransform(sourceProj: default, destProj: default, transform: js.Function1[/* arg0 */ Coordinate, Coordinate]): js.Function1[/* arg0 */ Coordinate, Coordinate] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSafeCoordinateTransform")(sourceProj.asInstanceOf[js.Any], destProj.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg0 */ Coordinate, Coordinate]]
  
  inline def createTransformFromCoordinateTransform(coordTransform: js.Function1[/* arg0 */ Coordinate, Coordinate]): TransformFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformFromCoordinateTransform")(coordTransform.asInstanceOf[js.Any]).asInstanceOf[TransformFunction]
  
  inline def disableCoordinateWarning(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableCoordinateWarning")().asInstanceOf[Unit]
  inline def disableCoordinateWarning(disable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableCoordinateWarning")(disable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def equivalent(projection1: default, projection2: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equivalent")(projection1.asInstanceOf[js.Any], projection2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fromLonLat(coordinate: Coordinate): Coordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLonLat")(coordinate.asInstanceOf[js.Any]).asInstanceOf[Coordinate]
  inline def fromLonLat(coordinate: Coordinate, projection: ProjectionLike): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLonLat")(coordinate.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def fromUserCoordinate(coordinate: js.Array[Double], destProjection: ProjectionLike): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUserCoordinate")(coordinate.asInstanceOf[js.Any], destProjection.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def fromUserExtent(extent: Extent, destProjection: ProjectionLike): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUserExtent")(extent.asInstanceOf[js.Any], destProjection.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def fromUserResolution(resolution: Double, destProjection: ProjectionLike): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUserResolution")(resolution.asInstanceOf[js.Any], destProjection.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def get(projectionLike: ProjectionLike): default | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(projectionLike.asInstanceOf[js.Any]).asInstanceOf[default | Null]
  
  inline def getPointResolution(projection: ProjectionLike, resolution: Double, point: Coordinate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointResolution")(projection.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getPointResolution(projection: ProjectionLike, resolution: Double, point: Coordinate, units: Units): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointResolution")(projection.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], point.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTransform(source: ProjectionLike, destination: ProjectionLike): TransformFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransform")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[TransformFunction]
  
  inline def getTransformFromProjections(sourceProjection: default, destinationProjection: default): TransformFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformFromProjections")(sourceProjection.asInstanceOf[js.Any], destinationProjection.asInstanceOf[js.Any])).asInstanceOf[TransformFunction]
  
  inline def getUserProjection(): default | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserProjection")().asInstanceOf[default | Null]
  
  inline def identityTransform(input: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("identityTransform")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def identityTransform(input: js.Array[Double], output: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("identityTransform")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def setUserProjection(projection: ProjectionLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserProjection")(projection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toLonLat(coordinate: Coordinate): Coordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("toLonLat")(coordinate.asInstanceOf[js.Any]).asInstanceOf[Coordinate]
  inline def toLonLat(coordinate: Coordinate, projection: ProjectionLike): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("toLonLat")(coordinate.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def toUserCoordinate(coordinate: js.Array[Double], sourceProjection: ProjectionLike): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUserCoordinate")(coordinate.asInstanceOf[js.Any], sourceProjection.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def toUserExtent(extent: Extent, sourceProjection: ProjectionLike): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("toUserExtent")(extent.asInstanceOf[js.Any], sourceProjection.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def toUserResolution(resolution: Double, sourceProjection: ProjectionLike): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toUserResolution")(resolution.asInstanceOf[js.Any], sourceProjection.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def transform(coordinate: Coordinate, source: ProjectionLike, destination: ProjectionLike): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(coordinate.asInstanceOf[js.Any], source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def transformExtent(extent: Extent, source: ProjectionLike, destination: ProjectionLike): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("transformExtent")(extent.asInstanceOf[js.Any], source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Extent]
  inline def transformExtent(extent: Extent, source: ProjectionLike, destination: ProjectionLike, stops: Double): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("transformExtent")(extent.asInstanceOf[js.Any], source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], stops.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def transformWithProjections(point: Coordinate, sourceProjection: default, destinationProjection: default): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("transformWithProjections")(point.asInstanceOf[js.Any], sourceProjection.asInstanceOf[js.Any], destinationProjection.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def useGeographic(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useGeographic")().asInstanceOf[Unit]
  
  type ProjectionLike = js.UndefOr[default | String]
  
  type TransformFunction = js.Function3[
    /* arg0 */ js.Array[Double], 
    /* arg1 */ js.UndefOr[js.Array[Double]], 
    /* arg2 */ js.UndefOr[Double], 
    js.Array[Double]
  ]
}
