package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomPointMod {
  
  @JSImport("ol/geom/Point", JSImport.Default)
  @js.native
  open class default protected () extends Point {
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  trait Point
    extends typings.ol.geomSimpleGeometryMod.default
}
