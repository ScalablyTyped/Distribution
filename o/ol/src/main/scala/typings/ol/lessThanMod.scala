package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/LessThan", JSImport.Namespace)
@js.native
object lessThanMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.comparisonBinaryMod.default {
    def this(propertyName: String, expression: Double) = this()
  }
  
  type LessThan = typings.ol.comparisonBinaryMod.default
}

