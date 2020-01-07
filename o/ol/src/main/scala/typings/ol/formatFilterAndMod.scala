package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/And", JSImport.Namespace)
@js.native
object formatFilterAndMod extends js.Object {
  @js.native
  abstract class default protected ()
    extends typings.ol.formatFilterLogicalNaryMod.default {
    def this(conditions: typings.ol.formatFilterFilterMod.default*) = this()
  }
  
  type And = typings.ol.formatFilterLogicalNaryMod.default
}

