package typings.ol

import typings.ol.formatFilterLessThanOrEqualToMod.LessThanOrEqualTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/LessThanOrEqualTo", JSImport.Namespace)
@js.native
object formatFilterLessThanOrEqualToMod extends js.Object {
  @js.native
  class default protected () extends LessThanOrEqualTo {
    def this(propertyName: String, expression: Double) = this()
  }
  
  type LessThanOrEqualTo = typings.ol.formatFilterComparisonBinaryMod.default
}

