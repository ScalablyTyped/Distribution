package typings.ol

import typings.ol.circleMod.default
import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomMod {
  
  @JSImport("ol/geom", "Circle")
  @js.native
  class Circle protected () extends default {
    def this(center: Coordinate) = this()
    def this(center: Coordinate, opt_radius: Double) = this()
    def this(center: Coordinate, opt_radius: Double, opt_layout: GeometryLayout) = this()
    def this(center: Coordinate, opt_radius: Unit, opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "Geometry")
  @js.native
  abstract class Geometry ()
    extends typings.ol.geometryMod.default
  
  @JSImport("ol/geom", "GeometryCollection")
  @js.native
  class GeometryCollection ()
    extends typings.ol.geometryCollectionMod.default {
    def this(opt_geometries: js.Array[typings.ol.geometryMod.default]) = this()
  }
  
  @JSImport("ol/geom", "LineString")
  @js.native
  class LineString protected ()
    extends typings.ol.lineStringMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "LinearRing")
  @js.native
  class LinearRing protected ()
    extends typings.ol.linearRingMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "MultiLineString")
  @js.native
  class MultiLineString protected ()
    extends typings.ol.multiLineStringMod.default {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.lineStringMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.lineStringMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.lineStringMod.default],
      opt_layout: Unit,
      opt_ends: js.Array[Double]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.lineStringMod.default],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  @JSImport("ol/geom", "MultiPoint")
  @js.native
  class MultiPoint protected ()
    extends typings.ol.multiPointMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "MultiPolygon")
  @js.native
  class MultiPolygon protected ()
    extends typings.ol.multiPolygonMod.default {
    def this(coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.polygonMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.polygonMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.polygonMod.default],
      opt_layout: Unit,
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.polygonMod.default],
      opt_layout: GeometryLayout,
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
  }
  
  @JSImport("ol/geom", "Point")
  @js.native
  class Point protected ()
    extends typings.ol.pointMod.default {
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "Polygon")
  @js.native
  class Polygon protected ()
    extends typings.ol.polygonMod.default {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: Unit, opt_ends: js.Array[Double]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  @JSImport("ol/geom", "SimpleGeometry")
  @js.native
  abstract class SimpleGeometry ()
    extends typings.ol.simpleGeometryMod.default
}
