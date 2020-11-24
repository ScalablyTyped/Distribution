package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/geom/Circle", JSImport.Namespace)
@js.native
object circleMod extends js.Object {
  
  @js.native
  trait Circle
    extends typings.ol.simpleGeometryMod.default {
    
    /**
      * Return the center of the circle as {@link module:ol/coordinate~Coordinate coordinate}.
      */
    def getCenter(): Coordinate = js.native
    
    /**
      * Return the radius of the circle.
      */
    def getRadius(): Double = js.native
    
    /**
      * Set the center of the circle as {@link module:ol/coordinate~Coordinate coordinate}.
      */
    def setCenter(center: Coordinate): Unit = js.native
    
    /**
      * Set the center (as {@link module:ol/coordinate~Coordinate coordinate}) and the radius (as
      * number) of the circle.
      */
    def setCenterAndRadius(center: Coordinate, radius: Double): Unit = js.native
    def setCenterAndRadius(center: Coordinate, radius: Double, opt_layout: GeometryLayout): Unit = js.native
    
    /**
      * Set the radius of the circle. The radius is in the units of the projection.
      */
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
