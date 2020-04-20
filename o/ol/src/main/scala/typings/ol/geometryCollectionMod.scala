package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/GeometryCollection", JSImport.Namespace)
@js.native
object geometryCollectionMod extends js.Object {
  @js.native
  trait GeometryCollection
    extends typings.ol.geometryMod.default {
    def getGeometries(): js.Array[typings.ol.geometryMod.default] = js.native
    def getGeometriesArray(): js.Array[typings.ol.geometryMod.default] = js.native
    def getGeometriesArrayRecursive(): js.Array[typings.ol.geometryMod.default] = js.native
    def isEmpty(): Boolean = js.native
    def setGeometries(geometries: js.Array[typings.ol.geometryMod.default]): Unit = js.native
    def setGeometriesArray(geometries: js.Array[typings.ol.geometryMod.default]): Unit = js.native
  }
  
  @js.native
  class default () extends GeometryCollection {
    def this(opt_geometries: js.Array[typings.ol.geometryMod.default]) = this()
  }
  
}

