package typings.openlayers.global.ol

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.geom.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geom {
  
  /**
    * @classdesc
    * Circle geometry.
    *
    * @param center Center.
    * @param opt_radius Radius.
    * @param opt_layout Layout.
    * @api
    */
  @JSGlobal("ol.geom.Circle")
  @js.native
  class Circle protected ()
    extends typings.openlayers.mod.geom.Circle {
    /**
      * @classdesc
      * Circle geometry.
      *
      * @param center Center.
      * @param opt_radius Radius.
      * @param opt_layout Layout.
      * @api
      */
    def this(center: Coordinate_) = this()
    def this(center: Coordinate_, opt_radius: Double) = this()
    def this(center: Coordinate_, opt_radius: Double, opt_layout: GeometryLayout) = this()
    def this(center: Coordinate_, opt_radius: Unit, opt_layout: GeometryLayout) = this()
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
  @JSGlobal("ol.geom.Geometry")
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
  class Geometry ()
    extends typings.openlayers.mod.geom.Geometry
  
  /**
    * @classdesc
    * An array of {@link ol.geom.Geometry} objects.
    *
    * @param opt_geometries Geometries.
    * @api stable
    */
  @JSGlobal("ol.geom.GeometryCollection")
  @js.native
  /**
    * @classdesc
    * An array of {@link ol.geom.Geometry} objects.
    *
    * @param opt_geometries Geometries.
    * @api stable
    */
  class GeometryCollection ()
    extends typings.openlayers.mod.geom.GeometryCollection {
    def this(opt_geometries: js.Array[typings.openlayers.mod.geom.Geometry]) = this()
  }
  
  /**
    * @classdesc
    * Linestring geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @JSGlobal("ol.geom.LineString")
  @js.native
  class LineString protected ()
    extends typings.openlayers.mod.geom.LineString {
    /**
      * @classdesc
      * Linestring geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: js.Array[Coordinate_]) = this()
    def this(coordinates: js.Array[Coordinate_], opt_layout: GeometryLayout) = this()
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
  @JSGlobal("ol.geom.LinearRing")
  @js.native
  class LinearRing protected ()
    extends typings.openlayers.mod.geom.LinearRing {
    /**
      * @classdesc
      * Linear ring geometry. Only used as part of polygon; cannot be rendered
      * on its own.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: js.Array[Coordinate_]) = this()
    def this(coordinates: js.Array[Coordinate_], opt_layout: GeometryLayout) = this()
  }
  
  /**
    * @classdesc
    * Multi-linestring geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @JSGlobal("ol.geom.MultiLineString")
  @js.native
  class MultiLineString protected ()
    extends typings.openlayers.mod.geom.MultiLineString {
    /**
      * @classdesc
      * Multi-linestring geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: js.Array[js.Array[Coordinate_]]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate_]], opt_layout: GeometryLayout) = this()
  }
  
  /**
    * @classdesc
    * Multi-point geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @JSGlobal("ol.geom.MultiPoint")
  @js.native
  class MultiPoint protected ()
    extends typings.openlayers.mod.geom.MultiPoint {
    /**
      * @classdesc
      * Multi-point geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: js.Array[Coordinate_]) = this()
    def this(coordinates: js.Array[Coordinate_], opt_layout: GeometryLayout) = this()
  }
  
  /**
    * @classdesc
    * Multi-polygon geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @JSGlobal("ol.geom.MultiPolygon")
  @js.native
  class MultiPolygon protected ()
    extends typings.openlayers.mod.geom.MultiPolygon {
    /**
      * @classdesc
      * Multi-polygon geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: js.Array[js.Array[js.Array[Coordinate_]]]) = this()
    def this(coordinates: js.Array[js.Array[js.Array[Coordinate_]]], opt_layout: GeometryLayout) = this()
  }
  
  /**
    * @classdesc
    * Point geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @JSGlobal("ol.geom.Point")
  @js.native
  class Point protected ()
    extends typings.openlayers.mod.geom.Point {
    /**
      * @classdesc
      * Point geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: Coordinate_) = this()
    def this(coordinates: Coordinate_, opt_layout: GeometryLayout) = this()
  }
  
  /**
    * @classdesc
    * Polygon geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  @JSGlobal("ol.geom.Polygon")
  @js.native
  class Polygon protected ()
    extends typings.openlayers.mod.geom.Polygon {
    /**
      * @classdesc
      * Polygon geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    def this(coordinates: js.Array[js.Array[Coordinate_]]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate_]], opt_layout: GeometryLayout) = this()
  }
  object Polygon {
    
    @JSGlobal("ol.geom.Polygon")
    @js.native
    val ^ : js.Any = js.native
    
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
    /* static member */
    inline def circular(sphere: typings.openlayers.mod.Sphere, center: Coordinate_, radius: Double): typings.openlayers.mod.geom.Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("circular")(sphere.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.openlayers.mod.geom.Polygon]
    inline def circular(sphere: typings.openlayers.mod.Sphere, center: Coordinate_, radius: Double, opt_n: Double): typings.openlayers.mod.geom.Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("circular")(sphere.asInstanceOf[js.Any], center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], opt_n.asInstanceOf[js.Any])).asInstanceOf[typings.openlayers.mod.geom.Polygon]
    
    /**
      * Create a regular polygon from a circle.
      * @param circle Circle geometry.
      * @param opt_sides Number of sides of the polygon. Default is 32.
      * @param opt_angle Start angle for the first vertex of the polygon in
      *     radians. Default is 0.
      * @return Polygon geometry.
      * @api
      */
    /* static member */
    inline def fromCircle(circle: typings.openlayers.mod.geom.Circle): typings.openlayers.mod.geom.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCircle")(circle.asInstanceOf[js.Any]).asInstanceOf[typings.openlayers.mod.geom.Polygon]
    inline def fromCircle(circle: typings.openlayers.mod.geom.Circle, opt_sides: Double): typings.openlayers.mod.geom.Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCircle")(circle.asInstanceOf[js.Any], opt_sides.asInstanceOf[js.Any])).asInstanceOf[typings.openlayers.mod.geom.Polygon]
    inline def fromCircle(circle: typings.openlayers.mod.geom.Circle, opt_sides: Double, opt_angle: Double): typings.openlayers.mod.geom.Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCircle")(circle.asInstanceOf[js.Any], opt_sides.asInstanceOf[js.Any], opt_angle.asInstanceOf[js.Any])).asInstanceOf[typings.openlayers.mod.geom.Polygon]
    inline def fromCircle(circle: typings.openlayers.mod.geom.Circle, opt_sides: Unit, opt_angle: Double): typings.openlayers.mod.geom.Polygon = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCircle")(circle.asInstanceOf[js.Any], opt_sides.asInstanceOf[js.Any], opt_angle.asInstanceOf[js.Any])).asInstanceOf[typings.openlayers.mod.geom.Polygon]
    
    /**
      * Create a polygon from an extent. The layout used is `XY`.
      * @param extent The extent.
      * @return The polygon.
      * @api
      */
    /* static member */
    inline def fromExtent(extent: Extent_): typings.openlayers.mod.geom.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtent")(extent.asInstanceOf[js.Any]).asInstanceOf[typings.openlayers.mod.geom.Polygon]
  }
  
  /**
    * @classdesc
    * Abstract base class; only used for creating subclasses; do not instantiate
    * in apps, as cannot be rendered.
    *
    * @api stable
    */
  @JSGlobal("ol.geom.SimpleGeometry")
  @js.native
  /**
    * @classdesc
    * Abstract base class; only used for creating subclasses; do not instantiate
    * in apps, as cannot be rendered.
    *
    * @api stable
    */
  class SimpleGeometry ()
    extends typings.openlayers.mod.geom.SimpleGeometry
}
