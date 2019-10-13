package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/GreaterThanOrEqualTo", JSImport.Namespace)
@js.native
object formatFilterGreaterThanOrEqualToMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.formatFilterComparisonBinaryMod.default {
    def this(propertyName: String, expression: Double) = this()
  }
  
  type GreaterThanOrEqualTo = typings.ol.formatFilterComparisonBinaryMod.default
}

