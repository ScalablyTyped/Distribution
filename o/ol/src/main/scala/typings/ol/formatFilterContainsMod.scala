package typings.ol

import typings.ol.formatFilterContainsMod.Contains
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/Contains", JSImport.Namespace)
@js.native
object formatFilterContainsMod extends js.Object {
  @js.native
  class default protected () extends Contains {
    def this(geometryName: String, geometry: typings.ol.geomGeometryMod.default) = this()
    def this(geometryName: String, geometry: typings.ol.geomGeometryMod.default, opt_srsName: String) = this()
  }
  
  type Contains = typings.ol.formatFilterSpatialMod.default
}

