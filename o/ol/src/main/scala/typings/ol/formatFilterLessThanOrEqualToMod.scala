package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/LessThanOrEqualTo", JSImport.Namespace)
@js.native
object formatFilterLessThanOrEqualToMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.formatFilterComparisonBinaryMod.default {
    def this(propertyName: String, expression: Double) = this()
  }
  
  type LessThanOrEqualTo = typings.ol.formatFilterComparisonBinaryMod.default
}

