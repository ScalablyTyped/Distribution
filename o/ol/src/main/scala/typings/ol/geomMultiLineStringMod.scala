package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import typings.ol.geomMultiLineStringMod.MultiLineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/MultiLineString", JSImport.Namespace)
@js.native
object geomMultiLineStringMod extends js.Object {
  @js.native
  trait MultiLineString
    extends typings.ol.geomSimpleGeometryMod.default {
    def appendLineString(lineString: typings.ol.geomLineStringMod.default): Unit = js.native
    def getCoordinateAtM(m: Double): Coordinate = js.native
    def getCoordinateAtM(m: Double, opt_extrapolate: Boolean): Coordinate = js.native
    def getCoordinateAtM(m: Double, opt_extrapolate: Boolean, opt_interpolate: Boolean): Coordinate = js.native
    def getEnds(): js.Array[Double] = js.native
    def getFlatMidpoints(): js.Array[Double] = js.native
    def getLineString(index: Double): typings.ol.geomLineStringMod.default = js.native
    def getLineStrings(): js.Array[typings.ol.geomLineStringMod.default] = js.native
  }
  
  @js.native
  class default protected () extends MultiLineString {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
}

