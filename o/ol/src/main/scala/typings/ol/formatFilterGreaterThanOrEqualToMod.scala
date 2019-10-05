package typings.ol

import typings.ol.formatFilterGreaterThanOrEqualToMod.GreaterThanOrEqualTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/GreaterThanOrEqualTo", JSImport.Namespace)
@js.native
object formatFilterGreaterThanOrEqualToMod extends js.Object {
  @js.native
  class default protected () extends GreaterThanOrEqualTo {
    def this(propertyName: String, expression: Double) = this()
  }
  
  type GreaterThanOrEqualTo = typings.ol.formatFilterComparisonBinaryMod.default
}

