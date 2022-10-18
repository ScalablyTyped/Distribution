package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomCircleMod.default
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomMod {
  
  @JSImport("ol/geom", "Circle")
  @js.native
  open class Circle protected () extends default {
    def this(center: Coordinate) = this()
    def this(center: Coordinate, opt_radius: Double) = this()
    def this(center: Coordinate, opt_radius: Double, opt_layout: GeometryLayout) = this()
    def this(center: Coordinate, opt_radius: Unit, opt_layout: GeometryLayout) = this()
  }
  
  /* note: abstract class */ @JSImport("ol/geom", "Geometry")
  @js.native
  open class Geometry ()
    extends typings.ol.geomGeometryMod.default
  
  @JSImport("ol/geom", "GeometryCollection")
  @js.native
  open class GeometryCollection ()
    extends typings.ol.geomGeometryCollectionMod.default {
    def this(opt_geometries: js.Array[typings.ol.geomGeometryMod.default]) = this()
  }
  
  @JSImport("ol/geom", "LineString")
  @js.native
  open class LineString protected ()
    extends typings.ol.geomLineStringMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "LinearRing")
  @js.native
  open class LinearRing protected ()
    extends typings.ol.geomLinearRingMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "MultiLineString")
  @js.native
  open class MultiLineString protected ()
    extends typings.ol.geomMultiLineStringMod.default {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
      opt_layout: Unit,
      opt_ends: js.Array[Double]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  @JSImport("ol/geom", "MultiPoint")
  @js.native
  open class MultiPoint protected ()
    extends typings.ol.geomMultiPointMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "MultiPolygon")
  @js.native
  open class MultiPolygon protected ()
    extends typings.ol.geomMultiPolygonMod.default {
    def this(coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
      opt_layout: Unit,
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
      opt_layout: GeometryLayout,
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
  }
  
  @JSImport("ol/geom", "Point")
  @js.native
  open class Point protected ()
    extends typings.ol.geomPointMod.default {
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "Polygon")
  @js.native
  open class Polygon protected ()
    extends typings.ol.geomPolygonMod.default {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: Unit, opt_ends: js.Array[Double]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("ol/geom", "SimpleGeometry")
  @js.native
  open class SimpleGeometry ()
    extends typings.ol.geomSimpleGeometryMod.default
}
