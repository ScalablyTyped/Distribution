package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/And", JSImport.Namespace)
@js.native
object andMod extends js.Object {
  @js.native
  abstract class default protected ()
    extends typings.ol.logicalNaryMod.default {
    def this(conditions: typings.ol.filterFilterMod.default*) = this()
  }
  
  type And = typings.ol.logicalNaryMod.default
}

