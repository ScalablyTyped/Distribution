package typings.ol

import typings.ol.formatFilterWithinMod.Within
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/Within", JSImport.Namespace)
@js.native
object formatFilterWithinMod extends js.Object {
  @js.native
  class default protected () extends Within {
    def this(geometryName: String, geometry: typings.ol.geomGeometryMod.default) = this()
    def this(geometryName: String, geometry: typings.ol.geomGeometryMod.default, opt_srsName: String) = this()
  }
  
  type Within = typings.ol.formatFilterSpatialMod.default
}

