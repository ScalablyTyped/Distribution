package typings.ol

import typings.ol.circleMod.default
import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", JSImport.Namespace)
@js.native
object geomMod extends js.Object {
  @js.native
  class Circle protected () extends default {
    def this(center: Coordinate) = this()
    def this(center: Coordinate, opt_radius: Double) = this()
    def this(center: Coordinate, opt_radius: js.UndefOr[scala.Nothing], opt_layout: GeometryLayout) = this()
    def this(center: Coordinate, opt_radius: Double, opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  abstract class Geometry ()
    extends typings.ol.geometryMod.default
  
  @js.native
  class GeometryCollection ()
    extends typings.ol.geometryCollectionMod.default {
    def this(opt_geometries: js.Array[typings.ol.geometryMod.default]) = this()
  }
  
  @js.native
  class LineString protected ()
    extends typings.ol.lineStringMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  class LinearRing protected ()
    extends typings.ol.linearRingMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
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
      opt_layout: js.UndefOr[scala.Nothing],
      opt_ends: js.Array[Double]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.lineStringMod.default],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  @js.native
  class MultiPoint protected ()
    extends typings.ol.multiPointMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
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
      opt_layout: js.UndefOr[scala.Nothing],
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.polygonMod.default],
      opt_layout: GeometryLayout,
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
  }
  
  @js.native
  class Point protected ()
    extends typings.ol.pointMod.default {
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  class Polygon protected ()
    extends typings.ol.polygonMod.default {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: js.UndefOr[scala.Nothing],
      opt_ends: js.Array[Double]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
}

