package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.geom.Circle
import typings.openlayers.openlayersMod.geom.Geometry
import typings.openlayers.openlayersMod.geom.GeometryLayout
import typings.openlayers.openlayersMod.geom.GeometryType
import typings.openlayers.openlayersMod.geom.LineString
import typings.openlayers.openlayersMod.geom.LinearRing
import typings.openlayers.openlayersMod.geom.MultiPoint
import typings.openlayers.openlayersMod.geom.Point
import typings.openlayers.openlayersMod.geom.Polygon
import typings.openlayers.openlayersMod.geom.SimpleGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "geom")
@js.native
object geom extends js.Object {
  /**
    * @classdesc
    * Circle geometry.
    *
    * @param center Center.
    * @param opt_radius Radius.
    * @param opt_layout Layout.
    * @api
    */
  @js.native
  class Circle protected () extends SimpleGeometry {
    /**
      * @classdesc
      * Circle geometry.
      *
      * @param center Center.
      * @param opt_radius Radius.
      * @param opt_layout Layout.
      * @api
      */
    def this(center: Coordinate) = this()
    def this(center: Coordinate, opt_radius: Double) = this()
    def this(center: Coordinate, opt_radius: Double, opt_layout: GeometryLayout) = this()
    /**
      * Return the center of the circle as {@link ol.Coordinate coordinate}.
      * @return Center.
      * @api
      */
    def getCenter(): Coordinate = js.native
    /**
      * Return the radius of the circle.
      * @return Radius.
      * @api
      */
    def getRadius(): Double = js.native
    /**
      * @inheritDoc
      * @api stable
      */
    def intersectsExtent(extent: Extent): Boolean = js.native
    /**
      * Set the center of the circle as {@link ol.Coordinate coordinate}.
      * @param center Center.
      * @api
      */
    def setCenter(center: Coordinate): Unit = js.native
    /**
      * Set the center (as {@link ol.Coordinate coordinate}) and the radius (as
      * number) of the circle.
      * @param center Center.
      * @param radius Radius.
      * @param opt_layout Layout.
      * @api
      */
    def setCenterAndRadius(center: Coordinate, radius: Double): Unit = js.native
    def setCenterAndRadius(center: Coordinate, radius: Double, opt_layout: GeometryLayout): Unit = js.native
    /**
      * Set the radius of the circle. The radius is in the units of the projection.
      * @param radius Radius.
      * @api
      */
    def setRadius(radius: Double): Unit = js.native
  }
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for vector geometries.
    *
    * To get notified of changes to the geometry, register a listener for the
    * generic `change` event on your geometry instance.
    *
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for vector geometries.
    *
    * To get notified of changes to the geometry, register a listener for the
    * generic `change` event on your geometry instance.
    *
    * @api stable
    */
  class Geometry () extends Object {
    /**
      * Return the closest point of the geometry to the passed point as
      * {@link ol.Coordinate coordinate}.
      * @param point Point.
      * @param opt_closestPoint Closest point.
      * @return Closest point.
      * @api stable
      */
    def getClosestPoint(point: Coordinate): Coordinate = js.native
    def getClosestPoint(point: Coordinate, opt_closestPoint: Coordinate): Coordinate = js.native
    /**
      * Get the extent of the geometry.
      * @param opt_extent Extent.
      * @return extent Extent.
      * @api stable
      */
    def getExtent(): Extent = js.native
    def getExtent(opt_extent: Extent): Extent = js.native
    /**
      * Get the type of this geometry.
      * @return Geometry type.
      */
    def getType(): GeometryType = js.native
    /**
      * Returns true if this geometry includes the specified coordinate. If the
      * coordinate is on the boundary of the geometry, returns false.
      * @param coordinate Coordinate.
      * @return Contains coordinate.
      * @api
      */
    def intersectsCoordinate(coordinate: Coordinate): Boolean = js.native
    /**
      * Rotate the geometry around a given coordinate. This modifies the geometry
      * coordinates in place.
      * @param angle Rotation angle in radians.
      * @param anchor The rotation center.
      * @api
      */
    def rotate(angle: Double, anchor: Coordinate): Unit = js.native
    /**
      * Scale the geometry (with an optional origin).  This modifies the geometry
      * coordinates in place.
      * @param sx The scaling factor in the x-direction.
      * @param opt_sy The scaling factor in the y-direction (defaults to
      *     sx).
      * @param opt_anchor The scale origin (defaults to the center
      *     of the geometry extent).
      * @api
      */
    def scale(sx: Double): Unit = js.native
    def scale(sx: Double, opt_sy: Double): Unit = js.native
    def scale(sx: Double, opt_sy: Double, opt_anchor: Coordinate): Unit = js.native
    /**
      * Create a simplified version of this geometry.  For linestrings, this uses
      * the the {@link
      * https://en.wikipedia.org/wiki/Ramer-Douglas-Peucker_algorithm
      * Douglas Peucker} algorithm.  For polygons, a quantization-based
      * simplification is used to preserve topology.
      * @param tolerance The tolerance distance for simplification.
      * @return A new, simplified version of the original
      *     geometry.
      * @api
      */
    def simplify(tolerance: Double): Geometry = js.native
    /**
      * Transform each coordinate of the geometry from one coordinate reference
      * system to another. The geometry is modified in place.
      * For example, a line will be transformed to a line and a circle to a circle.
      * If you do not want the geometry modified in place, first `clone()` it and
      * then use this function on the clone.
      *
      * @param source The current projection.  Can be a
      *     string identifier or a {@link ol.proj.Projection} object.
      * @param destination The desired projection.  Can be a
      *     string identifier or a {@link ol.proj.Projection} object.
      * @return This geometry.  Note that original geometry is
      *     modified in place.
      * @api stable
      */
    def transform(source: ProjectionLike, destination: ProjectionLike): Geometry = js.native
  }
  
  /**
    * @classdesc
    * An array of {@link ol.geom.Geometry} objects.
    *
    * @param opt_geometries Geometries.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * An array of {@link ol.geom.Geometry} objects.
    *
    * @param opt_geometries Geometries.
    * @api stable
    */
  class GeometryCollection () extends Geometry {
    def this(opt_geometries: js.Array[Geometry]) = this()
    /**
      * @inheritDoc
      * @api stable
      */
    def applyTransform(transformFn: TransformFunction): Unit = js.native
    /**
      * Return the geometries that make up this geometry collection.
      * @return Geometries.
      * @api stable
      */
    def getGeometries(): js.Array[Geometry] = js.native
    /**
      * @inheritDoc
      * @api stable
      */
    def intersectsExtent(extent: Extent): Boolean = js.native
    /**
      * Set the geometries that make up this geometry collection.
      * @param geometries Geometries.
      * @api stable
      */
    def setGeometries(geometries: js.Array[Geometry]): Unit = js.native
    /**
      * Translate the geometry.
      * @param deltaX Delta X.
      * @param deltaY Delta Y.
      * @api
      */
    def translate(deltaX: Double, deltaY: Double): Unit = js.native
  }
  
  /**
    * The coordinate layout for geometries, indicating whether a 3rd or 4th z ('Z')
    * or measure ('M') coordinate is available. Supported values are `'XY'`,
    * `'XYZ'`, `'XYM'`, `'XYZM'`.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.openlayers.openlayersStrings.XY
    - typings.openlayers.openlayersStrings.XYZ
    - typings.openlayers.openlayersStrings.XYM
    - typings.openlayers.openlayersStrings.XYZM
  */
  trait GeometryLayout extends js.Object
  
  /**
    * The geometry type. One of `'Point'`, `'LineString'`, `'LinearRing'`,
    * `'Polygon'`, `'MultiPoint'`, `'MultiLineString'`, `'MultiPolygon'`,
    * `'GeometryCollection'`, `'Circle'`.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.openlayers.openlayersStrings.Point
    - typings.openlayers.openlayersStrings.LineString
    - typings.openlayers.openlayersStrings.LinearRing
    - typings.openlayers.openlayersStrings.Polygon
    - typings.openlayers.openlayersStrings.MultiPoint
    - typings.openlayers.openlayersStrings.MultiLineString
    - typings.openlayers.openlayersStrings.MultiPolygon
    - typings.openlayers.openlayersStrings.GeometryCollection
    - typings.openlayers.openlayersStrings.Circle
  */
  trait GeometryType extends js.Object
  
  /**
    * @classdesc
    * Linestring geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @js.native
  class LineString protected () extends SimpleGeometry {
    /**
      * @classdesc
      * Linestring geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: js.Array[Coordinate]) = this()
    def this(coordinates: js.Array[Coordinate], opt_layout: GeometryLayout) = this()
    /**
      * Append the passed coordinate to the coordinates of the linestring.
      * @param coordinate Coordinate.
      * @api stable
      */
    def appendCoordinate(coordinate: Coordinate): Unit = js.native
    /**
      * Iterate over each segment, calling the provided callback.
      * If the callback returns a truthy value the function returns that
      * value immediately. Otherwise the function returns `false`.
      *
      * @param callback Function
      *     called for each segment.
      * @param opt_this The object to be used as the value of 'this'
      *     within callback.
      * @return Value.
      * @template T,S
      * @api
      */
    def forEachSegment[T, S](callback: js.ThisFunction2[/* this */ S, /* start */ Coordinate, /* end */ Coordinate, T]): T | Boolean = js.native
    def forEachSegment[T, S](
      callback: js.ThisFunction2[/* this */ S, /* start */ Coordinate, /* end */ Coordinate, T],
      opt_this: S
    ): T | Boolean = js.native
    /**
      * Return the coordinate at the provided fraction along the linestring.
      * The `fraction` is a number between 0 and 1, where 0 is the start of the
      * linestring and 1 is the end.
      * @param fraction Fraction.
      * @param opt_dest Optional coordinate whose values will
      *     be modified. If not provided, a new coordinate will be returned.
      * @return Coordinate of the interpolated point.
      * @api
      */
    def getCoordinateAt(fraction: Double): Coordinate = js.native
    def getCoordinateAt(fraction: Double, opt_dest: Coordinate): Coordinate = js.native
    /**
      * Returns the coordinate at `m` using linear interpolation, or `null` if no
      * such coordinate exists.
      *
      * `opt_extrapolate` controls extrapolation beyond the range of Ms in the
      * MultiLineString. If `opt_extrapolate` is `true` then Ms less than the first
      * M will return the first coordinate and Ms greater than the last M will
      * return the last coordinate.
      *
      * @param m M.
      * @param opt_extrapolate Extrapolate. Default is `false`.
      * @return Coordinate.
      * @api stable
      */
    def getCoordinateAtM(m: Double): Coordinate = js.native
    def getCoordinateAtM(m: Double, opt_extrapolate: Boolean): Coordinate = js.native
    /**
      * Return the coordinates of the linestring.
      * @return Coordinates.
      * @api stable
      */
    def getCoordinates(): js.Array[Coordinate] = js.native
    /**
      * Return the length of the linestring on projected plane.
      * @return Length (on projected plane).
      * @api stable
      */
    def getLength(): Double = js.native
    /**
      * @inheritDoc
      * @api stable
      */
    def intersectsExtent(extent: Extent): Boolean = js.native
    /**
      * Set the coordinates of the linestring.
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def setCoordinates(coordinates: js.Array[Coordinate]): Unit = js.native
    def setCoordinates(coordinates: js.Array[Coordinate], opt_layout: GeometryLayout): Unit = js.native
  }
  
  /**
    * @classdesc
    * Linear ring geometry. Only used as part of polygon; cannot be rendered
    * on its own.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @js.native
  class LinearRing protected () extends SimpleGeometry {
    /**
      * @classdesc
      * Linear ring geometry. Only used as part of polygon; cannot be rendered
      * on its own.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: js.Array[Coordinate]) = this()
    def this(coordinates: js.Array[Coordinate], opt_layout: GeometryLayout) = this()
    /**
      * Return the area of the linear ring on projected plane.
      * @return Area (on projected plane).
      * @api stable
      */
    def getArea(): Double = js.native
    /**
      * Return the coordinates of the linear ring.
      * @return Coordinates.
      * @api stable
      */
    def getCoordinates(): js.Array[Coordinate] = js.native
    /**
      * Set the coordinates of the linear ring.
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def setCoordinates(coordinates: js.Array[Coordinate]): Unit = js.native
    def setCoordinates(coordinates: js.Array[Coordinate], opt_layout: GeometryLayout): Unit = js.native
  }
  
  /**
    * @classdesc
    * Multi-linestring geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @js.native
  class MultiLineString protected () extends SimpleGeometry {
    /**
      * @classdesc
      * Multi-linestring geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: js.Array[js.Array[Coordinate]]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate]], opt_layout: GeometryLayout) = this()
    /**
      * Append the passed linestring to the multilinestring.
      * @param lineString LineString.
      * @api stable
      */
    def appendLineString(lineString: LineString): Unit = js.native
    /**
      * Returns the coordinate at `m` using linear interpolation, or `null` if no
      * such coordinate exists.
      *
      * `opt_extrapolate` controls extrapolation beyond the range of Ms in the
      * MultiLineString. If `opt_extrapolate` is `true` then Ms less than the first
      * M will return the first coordinate and Ms greater than the last M will
      * return the last coordinate.
      *
      * `opt_interpolate` controls interpolation between consecutive LineStrings
      * within the MultiLineString. If `opt_interpolate` is `true` the coordinates
      * will be linearly interpolated between the last coordinate of one LineString
      * and the first coordinate of the next LineString.  If `opt_interpolate` is
      * `false` then the function will return `null` for Ms falling between
      * LineStrings.
      *
      * @param m M.
      * @param opt_extrapolate Extrapolate. Default is `false`.
      * @param opt_interpolate Interpolate. Default is `false`.
      * @return Coordinate.
      * @api stable
      */
    def getCoordinateAtM(m: Double): Coordinate = js.native
    def getCoordinateAtM(m: Double, opt_extrapolate: Boolean): Coordinate = js.native
    def getCoordinateAtM(m: Double, opt_extrapolate: Boolean, opt_interpolate: Boolean): Coordinate = js.native
    /**
      * Return the coordinates of the multilinestring.
      * @return Coordinates.
      * @api stable
      */
    def getCoordinates(): js.Array[js.Array[Coordinate]] = js.native
    /**
      * Return the linestring at the specified index.
      * @param index Index.
      * @return LineString.
      * @api stable
      */
    def getLineString(index: Double): LineString = js.native
    /**
      * Return the linestrings of this multilinestring.
      * @return LineStrings.
      * @api stable
      */
    def getLineStrings(): js.Array[LineString] = js.native
    /**
      * @inheritDoc
      * @api stable
      */
    def intersectsExtent(extent: Extent): Boolean = js.native
    /**
      * Set the coordinates of the multilinestring.
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def setCoordinates(coordinates: js.Array[js.Array[Coordinate]]): Unit = js.native
    def setCoordinates(coordinates: js.Array[js.Array[Coordinate]], opt_layout: GeometryLayout): Unit = js.native
  }
  
  /**
    * @classdesc
    * Multi-point geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @js.native
  class MultiPoint protected () extends SimpleGeometry {
    /**
      * @classdesc
      * Multi-point geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: js.Array[Coordinate]) = this()
    def this(coordinates: js.Array[Coordinate], opt_layout: GeometryLayout) = this()
    /**
      * Append the passed point to this multipoint.
      * @param point Point.
      * @api stable
      */
    def appendPoint(point: Point): Unit = js.native
    /**
      * Return the coordinates of the multipoint.
      * @return Coordinates.
      * @api stable
      */
    def getCoordinates(): js.Array[Coordinate] = js.native
    /**
      * Return the point at the specified index.
      * @param index Index.
      * @return Point.
      * @api stable
      */
    def getPoint(index: Double): Point = js.native
    /**
      * Return the points of this multipoint.
      * @return Points.
      * @api stable
      */
    def getPoints(): js.Array[Point] = js.native
    /**
      * @inheritDoc
      * @api stable
      */
    def intersectsExtent(extent: Extent): Boolean = js.native
    /**
      * Set the coordinates of the multipoint.
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def setCoordinates(coordinates: js.Array[Coordinate]): Unit = js.native
    def setCoordinates(coordinates: js.Array[Coordinate], opt_layout: GeometryLayout): Unit = js.native
  }
  
  /**
    * @classdesc
    * Multi-polygon geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @js.native
  class MultiPolygon protected () extends SimpleGeometry {
    /**
      * @classdesc
      * Multi-polygon geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: js.Array[js.Array[js.Array[Coordinate]]]) = this()
    def this(coordinates: js.Array[js.Array[js.Array[Coordinate]]], opt_layout: GeometryLayout) = this()
    /**
      * Append the passed polygon to this multipolygon.
      * @param polygon Polygon.
      * @api stable
      */
    def appendPolygon(polygon: Polygon): Unit = js.native
    /**
      * Return the area of the multipolygon on projected plane.
      * @return Area (on projected plane).
      * @api stable
      */
    def getArea(): Double = js.native
    /**
      * Get the coordinate array for this geometry.  This array has the structure
      * of a GeoJSON coordinate array for multi-polygons.
      *
      * @param opt_right Orient coordinates according to the right-hand
      *     rule (counter-clockwise for exterior and clockwise for interior rings).
      *     If `false`, coordinates will be oriented according to the left-hand rule
      *     (clockwise for exterior and counter-clockwise for interior rings).
      *     By default, coordinate orientation will depend on how the geometry was
      *     constructed.
      * @return Coordinates.
      * @api stable
      */
    def getCoordinates(): js.Array[js.Array[js.Array[Coordinate]]] = js.native
    def getCoordinates(opt_right: Boolean): js.Array[js.Array[js.Array[Coordinate]]] = js.native
    /**
      * Return the interior points as {@link MultiPoint multipoint}.
      * @return Interior points.
      * @api stable
      */
    def getInteriorPoints(): MultiPoint = js.native
    /**
      * Return the polygon at the specified index.
      * @param index Index.
      * @return Polygon.
      * @api stable
      */
    def getPolygon(index: Double): Polygon = js.native
    /**
      * Return the polygons of this multipolygon.
      * @return Polygons.
      * @api stable
      */
    def getPolygons(): js.Array[Polygon] = js.native
    /**
      * @inheritDoc
      * @api stable
      */
    def intersectsExtent(extent: Extent): Boolean = js.native
    /**
      * Set the coordinates of the multipolygon.
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def setCoordinates(coordinates: js.Array[js.Array[js.Array[Coordinate]]]): Unit = js.native
    def setCoordinates(coordinates: js.Array[js.Array[js.Array[Coordinate]]], opt_layout: GeometryLayout): Unit = js.native
  }
  
  /**
    * @classdesc
    * Point geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @js.native
  class Point protected () extends SimpleGeometry {
    /**
      * @classdesc
      * Point geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
    /**
      * Return the coordinate of the point.
      * @return Coordinates.
      * @api stable
      */
    def getCoordinates(): Coordinate = js.native
    /**
      * @inheritDoc
      * @api stable
      */
    def intersectsExtent(extent: Extent): Boolean = js.native
    /**
      * Set the coordinate of the point.
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def setCoordinates(coordinates: Coordinate): Unit = js.native
    def setCoordinates(coordinates: Coordinate, opt_layout: GeometryLayout): Unit = js.native
  }
  
  /**
    * @classdesc
    * Polygon geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @js.native
  class Polygon protected () extends SimpleGeometry {
    /**
      * @classdesc
      * Polygon geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: js.Array[js.Array[Coordinate]]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate]], opt_layout: GeometryLayout) = this()
    /**
      * Append the passed linear ring to this polygon.
      * @param linearRing Linear ring.
      * @api stable
      */
    def appendLinearRing(linearRing: LinearRing): Unit = js.native
    /**
      * Return the area of the polygon on projected plane.
      * @return Area (on projected plane).
      * @api stable
      */
    def getArea(): Double = js.native
    /**
      * Get the coordinate array for this geometry.  This array has the structure
      * of a GeoJSON coordinate array for polygons.
      *
      * @param opt_right Orient coordinates according to the right-hand
      *     rule (counter-clockwise for exterior and clockwise for interior rings).
      *     If `false`, coordinates will be oriented according to the left-hand rule
      *     (clockwise for exterior and counter-clockwise for interior rings).
      *     By default, coordinate orientation will depend on how the geometry was
      *     constructed.
      * @return Coordinates.
      * @api stable
      */
    def getCoordinates(): js.Array[js.Array[Coordinate]] = js.native
    def getCoordinates(opt_right: Boolean): js.Array[js.Array[Coordinate]] = js.native
    /**
      * Return an interior point of the polygon.
      * @return Interior point.
      * @api stable
      */
    def getInteriorPoint(): Point = js.native
    /**
      * Return the Nth linear ring of the polygon geometry. Return `null` if the
      * given index is out of range.
      * The exterior linear ring is available at index `0` and the interior rings
      * at index `1` and beyond.
      *
      * @param index Index.
      * @return Linear ring.
      * @api stable
      */
    def getLinearRing(index: Double): LinearRing = js.native
    /**
      * Return the number of rings of the polygon,  this includes the exterior
      * ring and any interior rings.
      *
      * @return Number of rings.
      * @api
      */
    def getLinearRingCount(): Double = js.native
    /**
      * Return the linear rings of the polygon.
      * @return Linear rings.
      * @api stable
      */
    def getLinearRings(): js.Array[LinearRing] = js.native
    /**
      * @inheritDoc
      * @api stable
      */
    def intersectsExtent(extent: Extent): Boolean = js.native
    /**
      * Set the coordinates of the polygon.
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def setCoordinates(coordinates: js.Array[js.Array[Coordinate]]): Unit = js.native
    def setCoordinates(coordinates: js.Array[js.Array[Coordinate]], opt_layout: GeometryLayout): Unit = js.native
  }
  
  /**
    * @classdesc
    * Abstract base class; only used for creating subclasses; do not instantiate
    * in apps, as cannot be rendered.
    *
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Abstract base class; only used for creating subclasses; do not instantiate
    * in apps, as cannot be rendered.
    *
    * @api stable
    */
  class SimpleGeometry () extends Geometry {
    /**
      * @inheritDoc
      * @api stable
      */
    def applyTransform(transformFn: TransformFunction): Unit = js.native
    /**
      * Return the first coordinate of the geometry.
      * @return First coordinate.
      * @api stable
      */
    def getFirstCoordinate(): Coordinate = js.native
    /**
      * Return the last coordinate of the geometry.
      * @return Last point.
      * @api stable
      */
    def getLastCoordinate(): Coordinate = js.native
    /**
      * Return the {@link GeometryLayout layout} of the geometry.
      * @return Layout.
      * @api stable
      */
    def getLayout(): GeometryLayout = js.native
    /**
      * @inheritDoc
      * @api stable
      */
    def translate(deltaX: Double, deltaY: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Polygon extends js.Object {
    /**
      * Create an approximation of a circle on the surface of a sphere.
      * @param sphere The sphere.
      * @param center Center (`[lon, lat]` in degrees).
      * @param radius The great-circle distance from the center to
      *     the polygon vertices.
      * @param opt_n Optional number of vertices for the resulting
      *     polygon. Default is `32`.
      * @return The "circular" polygon.
      * @api stable
      */
    def circular(sphere: Sphere, center: Coordinate, radius: Double): Polygon = js.native
    def circular(sphere: Sphere, center: Coordinate, radius: Double, opt_n: Double): Polygon = js.native
    /**
      * Create a regular polygon from a circle.
      * @param circle Circle geometry.
      * @param opt_sides Number of sides of the polygon. Default is 32.
      * @param opt_angle Start angle for the first vertex of the polygon in
      *     radians. Default is 0.
      * @return Polygon geometry.
      * @api
      */
    def fromCircle(circle: Circle): Polygon = js.native
    def fromCircle(circle: Circle, opt_sides: Double): Polygon = js.native
    def fromCircle(circle: Circle, opt_sides: Double, opt_angle: Double): Polygon = js.native
    /**
      * Create a polygon from an extent. The layout used is `XY`.
      * @param extent The extent.
      * @return The polygon.
      * @api
      */
    def fromExtent(extent: Extent): Polygon = js.native
  }
  
}

