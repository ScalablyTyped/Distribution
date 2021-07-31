package typings.openlayers.mod

import typings.openlayers.mod.olx.ProjectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proj {
  
  @JSImport("openlayers", "proj")
  @js.native
  val ^ : js.Any = js.native
  
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
  class Projection protected () extends StObject {
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
  
  /**
    * Registers coordinate transform functions to convert coordinates between the
    * source projection and the destination projection.
    * The forward and inverse functions convert coordinate pairs; this function
    * converts these into the functions used internally which also handle
    * extents and coordinate arrays.
    *
    * @param source Source projection.
    * @param destination Destination projection.
    * @param forward The forward transform
    *     function (that is, from the source projection to the destination
    *     projection) that takes a {@link ol.Coordinate} as argument and returns
    *     the transformed {@link ol.Coordinate}.
    * @param inverse The inverse transform
    *     function (that is, from the destination projection to the source
    *     projection) that takes a {@link ol.Coordinate} as argument and returns
    *     the transformed {@link ol.Coordinate}.
    * @api stable
    */
  @scala.inline
  def addCoordinateTransforms(
    source: ProjectionLike,
    destination: ProjectionLike,
    forward: js.Function1[/* coords */ Coordinate_, Coordinate_],
    inverse: js.Function1[/* coords */ Coordinate_, Coordinate_]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCoordinateTransforms")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], forward.asInstanceOf[js.Any], inverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Registers transformation functions that don't alter coordinates. Those allow
    * to transform between projections with equal meaning.
    *
    * @param projections Projections.
    * @api
    */
  @scala.inline
  def addEquivalentProjections(projections: js.Array[Projection]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEquivalentProjections")(projections.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Add a Projection object to the list of supported projections that can be
    * looked up by their code.
    *
    * @param projection Projection instance.
    * @api stable
    */
  @scala.inline
  def addProjection(projection: Projection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addProjection")(projection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Checks if two projections are the same, that is every coordinate in one
    * projection does represent the same geographic point as the same coordinate in
    * the other projection.
    *
    * @param projection1 Projection 1.
    * @param projection2 Projection 2.
    * @return Equivalent.
    * @api
    */
  @scala.inline
  def equivalent(projection1: Projection, projection2: Projection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equivalent")(projection1.asInstanceOf[js.Any], projection2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Transforms a coordinate from longitude/latitude to a different projection.
    * @param coordinate Coordinate as longitude and latitude, i.e.
    *     an array with longitude as 1st and latitude as 2nd element.
    * @param opt_projection Target projection. The
    *     default is Web Mercator, i.e. 'EPSG:3857'.
    * @return Coordinate projected to the target projection.
    * @api stable
    */
  @scala.inline
  def fromLonLat(coordinate: Coordinate_): Coordinate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLonLat")(coordinate.asInstanceOf[js.Any]).asInstanceOf[Coordinate_]
  @scala.inline
  def fromLonLat(coordinate: Coordinate_, opt_projection: ProjectionLike): Coordinate_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLonLat")(coordinate.asInstanceOf[js.Any], opt_projection.asInstanceOf[js.Any])).asInstanceOf[Coordinate_]
  
  /**
    * Fetches a Projection object for the code specified.
    *
    * @param projectionLike Either a code string which is
    *     a combination of authority and identifier such as "EPSG:4326", or an
    *     existing projection object, or undefined.
    * @return Projection object, or null if not in list.
    * @api stable
    */
  @scala.inline
  def get(projectionLike: ProjectionLike): Projection = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(projectionLike.asInstanceOf[js.Any]).asInstanceOf[Projection]
  
  /**
    * Get the resolution of the point in degrees or distance units. For
    * projections with degrees as the unit this will simply return the
    * provided resolution. For other projections the point resolution is
    * estimated by transforming the 'point' pixel to EPSG:4326, measuring
    * its width and height on the normal sphere, and taking the average of
    * the width and height.
    * @param projection The projection.
    * @param resolution Nominal resolution in projection units.
    * @param point Point to find adjusted resolution at.
    * @return Point to find adjusted resolution at.
    */
  @scala.inline
  def getPointResolution(projection: Projection, resolution: Double, point: Coordinate_): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointResolution")(projection.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Given the projection-like objects, searches for a transformation
    * function to convert a coordinates array from the source projection to the
    * destination projection.
    *
    * @param source Source.
    * @param destination Destination.
    * @return Transform function.
    * @api stable
    */
  @scala.inline
  def getTransform(source: ProjectionLike, destination: ProjectionLike): TransformFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransform")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[TransformFunction]
  
  /**
    * Register proj4. If not explicitly registered, it will be assumed that
    * proj4js will be loaded in the global namespace. For example in a
    * browserify ES6 environment you could use:
    *
    *     import ol from 'openlayers';
    *     import proj4 from 'proj4';
    *     ol.proj.setProj4(proj4);
    *
    * @param proj4 Proj4.
    * @api
    */
  @scala.inline
  def setProj4(proj4: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProj4")(proj4.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Transforms a coordinate to longitude/latitude.
    * @param coordinate Projected coordinate.
    * @param opt_projection Projection of the coordinate.
    *     The default is Web Mercator, i.e. 'EPSG:3857'.
    * @return Coordinate as longitude and latitude, i.e. an array
    *     with longitude as 1st and latitude as 2nd element.
    * @api stable
    */
  @scala.inline
  def toLonLat(coordinate: Coordinate_): Coordinate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("toLonLat")(coordinate.asInstanceOf[js.Any]).asInstanceOf[Coordinate_]
  @scala.inline
  def toLonLat(coordinate: Coordinate_, opt_projection: ProjectionLike): Coordinate_ = (^.asInstanceOf[js.Dynamic].applyDynamic("toLonLat")(coordinate.asInstanceOf[js.Any], opt_projection.asInstanceOf[js.Any])).asInstanceOf[Coordinate_]
  
  /**
    * Transforms a coordinate from source projection to destination projection.
    * This returns a new coordinate (and does not modify the original).
    *
    * See {@link ol.proj.transformExtent} for extent transformation.
    * See the transform method of {@link ol.geom.Geometry} and its subclasses for
    * geometry transforms.
    *
    * @param coordinate Coordinate.
    * @param source Source projection-like.
    * @param destination Destination projection-like.
    */
  @scala.inline
  def transform(coordinate: Coordinate_, source: ProjectionLike, destination: ProjectionLike): Coordinate_ = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(coordinate.asInstanceOf[js.Any], source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Coordinate_]
  
  /**
    * Transforms an extent from source projection to destination projection.  This
    * returns a new extent (and does not modify the original).
    *
    * @param extent The extent to transform.
    * @param source Source projection-like.
    * @param destination Destination projection-like.
    * @return The transformed extent.
    * @api stable
    */
  @scala.inline
  def transformExtent(extent: Extent_, source: ProjectionLike, destination: ProjectionLike): Extent_ = (^.asInstanceOf[js.Dynamic].applyDynamic("transformExtent")(extent.asInstanceOf[js.Any], source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Extent_]
  
  /**
    * Meters per unit lookup table.
    * @const
    * @api stable
    */
  object METERS_PER_UNIT
  
  /**
    * Projection units: `'degrees'`, `'ft'`, `'m'`, `'pixels'`, `'tile-pixels'` or
    * `'us-ft'`.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.openlayers.openlayersStrings.degrees
    - typings.openlayers.openlayersStrings.ft
    - typings.openlayers.openlayersStrings.m
    - typings.openlayers.openlayersStrings.pixels
    - typings.openlayers.openlayersStrings.`tile-pixels`
    - typings.openlayers.openlayersStrings.`us-ft`
  */
  trait Units extends StObject
  object Units {
    
    @scala.inline
    def degrees: typings.openlayers.openlayersStrings.degrees = "degrees".asInstanceOf[typings.openlayers.openlayersStrings.degrees]
    
    @scala.inline
    def ft: typings.openlayers.openlayersStrings.ft = "ft".asInstanceOf[typings.openlayers.openlayersStrings.ft]
    
    @scala.inline
    def m: typings.openlayers.openlayersStrings.m = "m".asInstanceOf[typings.openlayers.openlayersStrings.m]
    
    @scala.inline
    def pixels: typings.openlayers.openlayersStrings.pixels = "pixels".asInstanceOf[typings.openlayers.openlayersStrings.pixels]
    
    @scala.inline
    def `tile-pixels`: typings.openlayers.openlayersStrings.`tile-pixels` = "tile-pixels".asInstanceOf[typings.openlayers.openlayersStrings.`tile-pixels`]
    
    @scala.inline
    def `us-ft`: typings.openlayers.openlayersStrings.`us-ft` = "us-ft".asInstanceOf[typings.openlayers.openlayersStrings.`us-ft`]
  }
}
