package typings.openlayers.mod.proj

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.olx.ProjectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Projection definition class. One of these is created for each projection
  * supported in the application and stored in the {@link ol.proj} namespace.
  * You can use these in applications, but this is not required, as API params
  * and options use {@link ol.ProjectionLike} which means the simple string
  * code will suffice.
  *
  * You can use {@link ol.proj.get} to retrieve the object for a particular
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
  * If you use proj4js, aliases can be added using `proj4.defs()`; see
  * [documentation](https://github.com/proj4js/proj4js). To set an alternative
  * namespace for proj4, use {@link ol.proj.setProj4}.
  *
  * @param options Projection options.
  * @struct
  * @api stable
  */
@JSImport("openlayers", "proj.Projection")
@js.native
class Projection protected () extends js.Object {
  /**
    * @classdesc
    * Projection definition class. One of these is created for each projection
    * supported in the application and stored in the {@link ol.proj} namespace.
    * You can use these in applications, but this is not required, as API params
    * and options use {@link ol.ProjectionLike} which means the simple string
    * code will suffice.
    *
    * You can use {@link ol.proj.get} to retrieve the object for a particular
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
    * If you use proj4js, aliases can be added using `proj4.defs()`; see
    * [documentation](https://github.com/proj4js/proj4js). To set an alternative
    * namespace for proj4, use {@link ol.proj.setProj4}.
    *
    * @param options Projection options.
    * @struct
    * @api stable
    */
  def this(options: ProjectionOptions) = this()
  
  /**
    * Get the code for this projection, e.g. 'EPSG:4326'.
    * @return Code.
    * @api stable
    */
  def getCode(): String = js.native
  
  /**
    * Get the validity extent for this projection.
    * @return Extent.
    * @api stable
    */
  def getExtent(): Extent_ = js.native
  
  /**
    * Get the amount of meters per unit of this projection.  If the projection is
    * not configured with `metersPerUnit` or a units identifier, the return is
    * `undefined`.
    * @return Meters.
    * @api stable
    */
  def getMetersPerUnit(): Double = js.native
  
  /**
    * Get the resolution of the point in degrees or distance units.
    * For projections with degrees as the unit this will simply return the
    * provided resolution. The default for other projections is to estimate
    * the point resolution by transforming the 'point' pixel to EPSG:4326,
    * measuring its width and height on the normal sphere,
    * and taking the average of the width and height.
    * An alternative implementation may be given when constructing a
    * projection. For many local projections,
    * such a custom function will return the resolution unchanged.
    * @param resolution Resolution in projection units.
    * @param point Point.
    * @return Point resolution in projection units.
    * @api
    */
  def getPointResolution(resolution: Double, point: Coordinate_): Double = js.native
  
  /**
    * Get the units of this projection.
    * @return Units.
    * @api stable
    */
  def getUnits(): Units = js.native
  
  /**
    * Get the world extent for this projection.
    * @return Extent.
    * @api
    */
  def getWorldExtent(): Extent_ = js.native
  
  /**
    * Is this projection a global projection which spans the whole world?
    * @return Whether the projection is global.
    * @api stable
    */
  def isGlobal(): Boolean = js.native
  
  /**
    * Set the validity extent for this projection.
    * @param extent Extent.
    * @api stable
    */
  def setExtent(extent: Extent_): Unit = js.native
  
  /**
    * Set the getPointResolution function for this projection.
    * @param func Function
    * @api
    */
  def setGetPointResolution(func: js.Function2[/* resolution */ Double, /* coords */ Coordinate_, Double]): Unit = js.native
  
  /**
    * Set if the projection is a global projection which spans the whole world
    * @param global Whether the projection is global.
    * @api stable
    */
  def setGlobal(global: Boolean): Unit = js.native
  
  /**
    * Set the world extent for this projection.
    * @param worldExtent World extent
    *     [minlon, minlat, maxlon, maxlat].
    * @api
    */
  def setWorldExtent(worldExtent: Extent_): Unit = js.native
}
