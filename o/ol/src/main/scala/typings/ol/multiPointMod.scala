package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/geom/MultiPoint", JSImport.Namespace)
@js.native
object multiPointMod extends js.Object {
  
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
  
  @js.native
  class default protected () extends MultiPoint {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
}
