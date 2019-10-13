package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/LessThan", JSImport.Namespace)
@js.native
object formatFilterLessThanMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.formatFilterComparisonBinaryMod.default {
    def this(propertyName: String, expression: Double) = this()
  }
  
  type LessThan = typings.ol.formatFilterComparisonBinaryMod.default
}

