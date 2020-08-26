package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/Circle", JSImport.Namespace)
@js.native
object circleMod extends js.Object {
  @js.native
  trait Circle
    extends typings.ol.simpleGeometryMod.default {
    def getCenter(): Coordinate = js.native
    def getRadius(): Double = js.native
    def setCenter(center: Coordinate): Unit = js.native
    def setCenterAndRadius(center: Coordinate, radius: Double): Unit = js.native
    def setCenterAndRadius(center: Coordinate, radius: Double, opt_layout: GeometryLayout): Unit = js.native
    def setRadius(radius: Double): Unit = js.native
  }
  
  @js.native
  class default protected () extends Circle {
    def this(center: Coordinate) = this()
    def this(center: Coordinate, opt_radius: Double) = this()
    def this(center: Coordinate, opt_radius: js.UndefOr[scala.Nothing], opt_layout: GeometryLayout) = this()
    def this(center: Coordinate, opt_radius: Double, opt_layout: GeometryLayout) = this()
  }
  
}

