package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/Point", JSImport.Namespace)
@js.native
object geomPointMod extends js.Object {
  @js.native
  trait Point
    extends typings.ol.geomSimpleGeometryMod.default
  
  @js.native
  class default protected () extends Point {
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
  }
  
}

