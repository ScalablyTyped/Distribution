package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/MultiPolygon", JSImport.Namespace)
@js.native
object geomMultiPolygonMod extends js.Object {
  @js.native
  trait MultiPolygon
    extends typings.ol.geomSimpleGeometryMod.default {
    def appendPolygon(polygon: typings.ol.geomPolygonMod.default): Unit = js.native
    def getArea(): Double = js.native
    def getEndss(): js.Array[js.Array[Double]] = js.native
    def getFlatInteriorPoints(): js.Array[Double] = js.native
    def getInteriorPoints(): typings.ol.geomMultiPointMod.default = js.native
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
    def getPolygon(index: Double): typings.ol.geomPolygonMod.default = js.native
    def getPolygons(): js.Array[typings.ol.geomPolygonMod.default] = js.native
  }
  
  @js.native
  class default protected () extends MultiPolygon {
    def this(coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typings.ol.geomPolygonMod.default],
      opt_layout: GeometryLayout,
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
  }
  
}

