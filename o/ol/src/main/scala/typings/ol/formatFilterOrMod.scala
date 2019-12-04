package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/Or", JSImport.Namespace)
@js.native
object formatFilterOrMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.formatFilterLogicalNaryMod.default {
    def this(conditions: typings.ol.formatFilterFilterMod.default*) = this()
  }
  
  type Or = typings.ol.formatFilterLogicalNaryMod.default
}

