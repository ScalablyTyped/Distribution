package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import typings.ol.geomLinearRingMod.LinearRing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/LinearRing", JSImport.Namespace)
@js.native
object geomLinearRingMod extends js.Object {
  @js.native
  trait LinearRing
    extends typings.ol.geomSimpleGeometryMod.default {
    def getArea(): Double = js.native
  }
  
  @js.native
  class default protected () extends LinearRing {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
}

