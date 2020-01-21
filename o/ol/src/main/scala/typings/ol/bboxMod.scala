package typings.ol

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/Bbox", JSImport.Namespace)
@js.native
object bboxMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.filterFilterMod.default {
    def this(geometryName: String, extent: Extent) = this()
    def this(geometryName: String, extent: Extent, opt_srsName: String) = this()
  }
  
  type Bbox = typings.ol.filterFilterMod.default
}

