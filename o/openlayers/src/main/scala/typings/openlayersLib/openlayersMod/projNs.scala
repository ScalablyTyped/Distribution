package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "proj")
@js.native
object projNs extends js.Object {
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
    def this(options: openlayersLib.openlayersMod.olxNs.ProjectionOptions) = this()
    /**
      * Get the code for this projection, e.g. 'EPSG:4326'.
      * @return Code.
      * @api stable
      */
    def getCode(): java.lang.String = js.native
    /**
      * Get the validity extent for this projection.
      * @return Extent.
      * @api stable
      */
    def getExtent(): openlayersLib.openlayersMod.Extent = js.native
    /**
      * Get the amount of meters per unit of this projection.  If the projection is
      * not configured with `metersPerUnit` or a units identifier, the return is
      * `undefined`.
      * @return Meters.
      * @api stable
      */
    def getMetersPerUnit(): scala.Double = js.native
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
    def getPointResolution(resolution: scala.Double, point: openlayersLib.openlayersMod.Coordinate): scala.Double = js.native
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
    def getWorldExtent(): openlayersLib.openlayersMod.Extent = js.native
    /**
      * Is this projection a global projection which spans the whole world?
      * @return Whether the projection is global.
      * @api stable
      */
    def isGlobal(): scala.Boolean = js.native
    /**
      * Set the validity extent for this projection.
      * @param extent Extent.
      * @api stable
      */
    def setExtent(extent: openlayersLib.openlayersMod.Extent): scala.Unit = js.native
    /**
      * Set the getPointResolution function for this projection.
      * @param func Function
      * @api
      */
    def setGetPointResolution(
      func: js.Function2[
          /* resolution */ scala.Double, 
          /* coords */ openlayersLib.openlayersMod.Coordinate, 
          scala.Double
        ]
    ): scala.Unit = js.native
    /**
      * Set if the projection is a global projection which spans the whole world
      * @param global Whether the projection is global.
      * @api stable
      */
    def setGlobal(global: scala.Boolean): scala.Unit = js.native
    /**
      * Set the world extent for this projection.
      * @param worldExtent World extent
      *     [minlon, minlat, maxlon, maxlat].
      * @api
      */
    def setWorldExtent(worldExtent: openlayersLib.openlayersMod.Extent): scala.Unit = js.native
  }
  
  /**
    * Projection units: `'degrees'`, `'ft'`, `'m'`, `'pixels'`, `'tile-pixels'` or
    * `'us-ft'`.
    */
  /* Rewritten from type alias, can be one of: 
    - openlayersLib.openlayersLibStrings.degrees
    - openlayersLib.openlayersLibStrings.ft
    - openlayersLib.openlayersLibStrings.m
    - openlayersLib.openlayersLibStrings.pixels
    - openlayersLib.openlayersLibStrings.`tile-pixels`
    - openlayersLib.openlayersLibStrings.`us-ft`
  */
  trait Units extends js.Object
  
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
  def addCoordinateTransforms(
    source: openlayersLib.openlayersMod.ProjectionLike,
    destination: openlayersLib.openlayersMod.ProjectionLike,
    forward: js.Function1[
      /* coords */ openlayersLib.openlayersMod.Coordinate, 
      openlayersLib.openlayersMod.Coordinate
    ],
    inverse: js.Function1[
      /* coords */ openlayersLib.openlayersMod.Coordinate, 
      openlayersLib.openlayersMod.Coordinate
    ]
  ): scala.Unit = js.native
  /**
    * Registers transformation functions that don't alter coordinates. Those allow
    * to transform between projections with equal meaning.
    *
    * @param projections Projections.
    * @api
    */
  def addEquivalentProjections(projections: js.Array[Projection]): scala.Unit = js.native
  /**
    * Add a Projection object to the list of supported projections that can be
    * looked up by their code.
    *
    * @param projection Projection instance.
    * @api stable
    */
  def addProjection(projection: Projection): scala.Unit = js.native
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
  def equivalent(projection1: Projection, projection2: Projection): scala.Boolean = js.native
  /**
    * Transforms a coordinate from longitude/latitude to a different projection.
    * @param coordinate Coordinate as longitude and latitude, i.e.
    *     an array with longitude as 1st and latitude as 2nd element.
    * @param opt_projection Target projection. The
    *     default is Web Mercator, i.e. 'EPSG:3857'.
    * @return Coordinate projected to the target projection.
    * @api stable
    */
  def fromLonLat(coordinate: openlayersLib.openlayersMod.Coordinate): openlayersLib.openlayersMod.Coordinate = js.native
  def fromLonLat(
    coordinate: openlayersLib.openlayersMod.Coordinate,
    opt_projection: openlayersLib.openlayersMod.ProjectionLike
  ): openlayersLib.openlayersMod.Coordinate = js.native
  /**
    * Fetches a Projection object for the code specified.
    *
    * @param projectionLike Either a code string which is
    *     a combination of authority and identifier such as "EPSG:4326", or an
    *     existing projection object, or undefined.
    * @return Projection object, or null if not in list.
    * @api stable
    */
  def get(projectionLike: openlayersLib.openlayersMod.ProjectionLike): Projection = js.native
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
  def getPointResolution(projection: Projection, resolution: scala.Double, point: openlayersLib.openlayersMod.Coordinate): scala.Double = js.native
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
  def getTransform(
    source: openlayersLib.openlayersMod.ProjectionLike,
    destination: openlayersLib.openlayersMod.ProjectionLike
  ): openlayersLib.openlayersMod.TransformFunction = js.native
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
  def setProj4(proj4: js.Any): scala.Unit = js.native
  /**
    * Transforms a coordinate to longitude/latitude.
    * @param coordinate Projected coordinate.
    * @param opt_projection Projection of the coordinate.
    *     The default is Web Mercator, i.e. 'EPSG:3857'.
    * @return Coordinate as longitude and latitude, i.e. an array
    *     with longitude as 1st and latitude as 2nd element.
    * @api stable
    */
  def toLonLat(coordinate: openlayersLib.openlayersMod.Coordinate): openlayersLib.openlayersMod.Coordinate = js.native
  def toLonLat(
    coordinate: openlayersLib.openlayersMod.Coordinate,
    opt_projection: openlayersLib.openlayersMod.ProjectionLike
  ): openlayersLib.openlayersMod.Coordinate = js.native
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
  def transform(
    coordinate: openlayersLib.openlayersMod.Coordinate,
    source: openlayersLib.openlayersMod.ProjectionLike,
    destination: openlayersLib.openlayersMod.ProjectionLike
  ): openlayersLib.openlayersMod.Coordinate = js.native
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
  def transformExtent(
    extent: openlayersLib.openlayersMod.Extent,
    source: openlayersLib.openlayersMod.ProjectionLike,
    destination: openlayersLib.openlayersMod.ProjectionLike
  ): openlayersLib.openlayersMod.Extent = js.native
  /**
    * Meters per unit lookup table.
    * @const
    * @api stable
    */
  @js.native
  object METERS_PER_UNIT
    extends /* k */ org.scalablytyped.runtime.StringDictionary[scala.Double]
  
}

