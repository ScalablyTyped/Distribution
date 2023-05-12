package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomCircleMod {
  
  /**
    * @classdesc
    * Circle geometry.
    *
    * @api
    */
  @JSImport("ol/geom/Circle", JSImport.Default)
  @js.native
  open class default protected () extends Circle {
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
    * Circle geometry.
    *
    * @api
    */
  @js.native
  trait Circle
    extends typings.ol.geomSimpleGeometryMod.default {
    
    /**
      * Return the center of the circle as {@link module:ol/coordinate~Coordinate coordinate}.
      * @return {import("../coordinate.js").Coordinate} Center.
      * @api
      */
    def getCenter(): Coordinate = js.native
    
    /**
      * Return the radius of the circle.
      * @return {number} Radius.
      * @api
      */
    def getRadius(): Double = js.native
    
    /**
      * @private
      * @return {number} Radius squared.
      */
    /* private */ var getRadiusSquared_ : Any = js.native
    
    /**
      * Set the center of the circle as {@link module:ol/coordinate~Coordinate coordinate}.
      * @param {import("../coordinate.js").Coordinate} center Center.
      * @api
      */
    def setCenter(center: Coordinate): Unit = js.native
    
    /**
      * Set the center (as {@link module:ol/coordinate~Coordinate coordinate}) and the radius (as
      * number) of the circle.
      * @param {!import("../coordinate.js").Coordinate} center Center.
      * @param {number} radius Radius.
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      * @api
      */
    def setCenterAndRadius(center: Coordinate, radius: Double): Unit = js.native
    def setCenterAndRadius(center: Coordinate, radius: Double, layout: GeometryLayout): Unit = js.native
    
    def setCoordinates(coordinates: Any, layout: Any): Unit = js.native
    
    /**
      * Set the radius of the circle. The radius is in the units of the projection.
      * @param {number} radius Radius.
      * @api
      */
    def setRadius(radius: Double): Unit = js.native
  }
}
