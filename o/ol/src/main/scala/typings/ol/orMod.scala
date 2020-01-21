package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/Or", JSImport.Namespace)
@js.native
object orMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.logicalNaryMod.default {
    def this(conditions: typings.ol.filterFilterMod.default*) = this()
  }
  
  type Or = typings.ol.logicalNaryMod.default
}

