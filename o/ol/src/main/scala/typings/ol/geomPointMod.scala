package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomPointMod {
  
  /**
    * @classdesc
    * Point geometry.
    *
    * @api
    */
  @JSImport("ol/geom/Point", JSImport.Default)
  @js.native
  open class default protected () extends Point {
    /**
      * @param {import("../coordinate.js").Coordinate} coordinates Coordinates.
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      */
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, layout: GeometryLayout) = this()
  }
  
  /**
    * @classdesc
    * Point geometry.
    *
    * @api
    */
  @js.native
  trait Point
    extends typings.ol.geomSimpleGeometryMod.default
}
