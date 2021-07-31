package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearRingMod {
  
  @JSImport("ol/geom/LinearRing", JSImport.Default)
  @js.native
  class default protected () extends LinearRing {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  trait LinearRing
    extends typings.ol.simpleGeometryMod.default {
    
    /**
      * Return the area of the linear ring on projected plane.
      */
    def getArea(): Double = js.native
  }
}
