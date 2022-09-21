package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiPointMod {
  
  @JSImport("ol/geom/MultiPoint", JSImport.Default)
  @js.native
  open class default protected () extends MultiPoint {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  trait MultiPoint
    extends typings.ol.simpleGeometryMod.default {
    
    /**
      * Append the passed point to this multipoint.
      */
    def appendPoint(point: typings.ol.pointMod.default): Unit = js.native
    
    /**
      * Return the point at the specified index.
      */
    def getPoint(index: Double): typings.ol.pointMod.default = js.native
    
    /**
      * Return the points of this multipoint.
      */
    def getPoints(): js.Array[typings.ol.pointMod.default] = js.native
  }
}
