package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomCircleMod.default
import typings.ol.geomGeometryMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomMod {
  
  /**
    * @classdesc
    * Circle geometry.
    *
    * @api
    */
  @JSImport("ol/geom", "Circle")
  @js.native
  open class Circle protected () extends default {
    /**
      * @param {!import("../coordinate.js").Coordinate} center Center.
      *     For internal use, flat coordinates in combination with `layout` and no
      *     `radius` are also accepted.
      * @param {number} [radius] Radius.
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      */
    def this(center: Coordinate) = this()
    def this(center: Coordinate, radius: Double) = this()
    def this(center: Coordinate, radius: Double, layout: GeometryLayout) = this()
    def this(center: Coordinate, radius: Unit, layout: GeometryLayout) = this()
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
    * @abstract
    * @api
    */
  @JSImport("ol/geom", "Geometry")
  @js.native
  open class Geometry ()
    extends typings.ol.geomGeometryMod.default
  
  /**
    * @classdesc
    * An array of {@link module:ol/geom/Geometry~Geometry} objects.
    *
    * @api
    */
  @JSImport("ol/geom", "GeometryCollection")
  @js.native
  /**
    * @param {Array<Geometry>} [geometries] Geometries.
    */
  open class GeometryCollection ()
    extends typings.ol.geomGeometryCollectionMod.default {
    def this(geometries: js.Array[typings.ol.geomGeometryMod.default]) = this()
  }
  
  /**
    * @classdesc
    * Linestring geometry.
    *
    * @api
    */
  @JSImport("ol/geom", "LineString")
  @js.native
  open class LineString protected ()
    extends typings.ol.geomLineStringMod.default {
    /**
      * @param {Array<import("../coordinate.js").Coordinate>|Array<number>} coordinates Coordinates.
      *     For internal use, flat coordinates in combination with `layout` are also accepted.
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      */
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], layout: GeometryLayout) = this()
  }
  
  /**
    * @classdesc
    * Linear ring geometry. Only used as part of polygon; cannot be rendered
    * on its own.
    *
    * @api
    */
  @JSImport("ol/geom", "LinearRing")
  @js.native
  open class LinearRing protected ()
    extends typings.ol.geomLinearRingMod.default {
    /**
      * @param {Array<import("../coordinate.js").Coordinate>|Array<number>} coordinates Coordinates.
      *     For internal use, flat coordinates in combination with `layout` are also accepted.
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      */
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], layout: GeometryLayout) = this()
  }
  
  /**
    * @classdesc
    * Multi-linestring geometry.
    *
    * @api
    */
  @JSImport("ol/geom", "MultiLineString")
  @js.native
  open class MultiLineString protected ()
    extends typings.ol.geomMultiLineStringMod.default {
    /**
      * @param {Array<Array<import("../coordinate.js").Coordinate>|LineString>|Array<number>} coordinates
      *     Coordinates or LineString geometries. (For internal use, flat coordinates in
      *     combination with `layout` and `ends` are also accepted.)
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      * @param {Array<number>} [ends] Flat coordinate ends for internal use.
      */
    def this(coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
      layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
      layout: Unit,
      ends: js.Array[Double]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
      layout: GeometryLayout,
      ends: js.Array[Double]
    ) = this()
  }
  
  /**
    * @classdesc
    * Multi-point geometry.
    *
    * @api
    */
  @JSImport("ol/geom", "MultiPoint")
  @js.native
  open class MultiPoint protected ()
    extends typings.ol.geomMultiPointMod.default {
    /**
      * @param {Array<import("../coordinate.js").Coordinate>|Array<number>} coordinates Coordinates.
      *     For internal use, flat coordinates in combination with `layout` are also accepted.
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      */
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], layout: GeometryLayout) = this()
  }
  
  /**
    * @classdesc
    * Multi-polygon geometry.
    *
    * @api
    */
  @JSImport("ol/geom", "MultiPolygon")
  @js.native
  open class MultiPolygon protected ()
    extends typings.ol.geomMultiPolygonMod.default {
    /**
      * @param {Array<Array<Array<import("../coordinate.js").Coordinate>>|Polygon>|Array<number>} coordinates Coordinates.
      *     For internal use, flat coordinates in combination with `layout` and `endss` are also accepted.
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      * @param {Array<Array<number>>} [endss] Array of ends for internal use with flat coordinates.
      */
    def this(coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
      layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
      layout: Unit,
      endss: js.Array[js.Array[Double]]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
      layout: GeometryLayout,
      endss: js.Array[js.Array[Double]]
    ) = this()
  }
  
  /**
    * @classdesc
    * Point geometry.
    *
    * @api
    */
  @JSImport("ol/geom", "Point")
  @js.native
  open class Point protected ()
    extends typings.ol.geomPointMod.default {
    /**
      * @param {import("../coordinate.js").Coordinate} coordinates Coordinates.
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      */
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, layout: GeometryLayout) = this()
  }
  
  /**
    * @classdesc
    * Polygon geometry.
    *
    * @api
    */
  @JSImport("ol/geom", "Polygon")
  @js.native
  open class Polygon protected ()
    extends typings.ol.geomPolygonMod.default {
    /**
      * @param {!Array<Array<import("../coordinate.js").Coordinate>>|!Array<number>} coordinates
      *     Array of linear rings that define the polygon. The first linear ring of the
      *     array defines the outer-boundary or surface of the polygon. Each subsequent
      *     linear ring defines a hole in the surface of the polygon. A linear ring is
      *     an array of vertices' coordinates where the first coordinate and the last are
      *     equivalent. (For internal use, flat coordinates in combination with
      *     `layout` and `ends` are also accepted.)
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      * @param {Array<number>} [ends] Ends (for internal use with flat coordinates).
      */
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], layout: GeometryLayout) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], layout: Unit, ends: js.Array[Double]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      layout: GeometryLayout,
      ends: js.Array[Double]
    ) = this()
  }
  
  /**
    * @classdesc
    * Abstract base class; only used for creating subclasses; do not instantiate
    * in apps, as cannot be rendered.
    *
    * @abstract
    * @api
    */
  @JSImport("ol/geom", "SimpleGeometry")
  @js.native
  open class SimpleGeometry ()
    extends typings.ol.geomSimpleGeometryMod.default
}
