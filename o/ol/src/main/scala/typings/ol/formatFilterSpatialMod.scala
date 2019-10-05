package typings.ol

import typings.ol.formatFilterSpatialMod.Spatial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/Spatial", JSImport.Namespace)
@js.native
object formatFilterSpatialMod extends js.Object {
  @js.native
  class default protected () extends Spatial {
    def this(tagName: String, geometryName: String, geometry: typings.ol.geomGeometryMod.default) = this()
    def this(
      tagName: String,
      geometryName: String,
      geometry: typings.ol.geomGeometryMod.default,
      opt_srsName: String
    ) = this()
  }
  
  type Spatial = typings.ol.formatFilterFilterMod.default
}

