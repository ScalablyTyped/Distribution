package typings.ol

import typings.ol.formatFilterIntersectsMod.Intersects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/Intersects", JSImport.Namespace)
@js.native
object formatFilterIntersectsMod extends js.Object {
  @js.native
  class default protected () extends Intersects {
    def this(geometryName: String, geometry: typings.ol.geomGeometryMod.default) = this()
    def this(geometryName: String, geometry: typings.ol.geomGeometryMod.default, opt_srsName: String) = this()
  }
  
  type Intersects = typings.ol.formatFilterSpatialMod.default
}

