package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/MultiPoint", JSImport.Namespace)
@js.native
object multiPointMod extends js.Object {
  @js.native
  trait MultiPoint
    extends typings.ol.simpleGeometryMod.default {
    def appendPoint(point: typings.ol.pointMod.default): Unit = js.native
    def getPoint(index: Double): typings.ol.pointMod.default = js.native
    def getPoints(): js.Array[typings.ol.pointMod.default] = js.native
  }
  
  @js.native
  class default protected () extends MultiPoint {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
}

