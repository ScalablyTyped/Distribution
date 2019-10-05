package typings.ol

import typings.ol.formatFilterEqualToMod.EqualTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/EqualTo", JSImport.Namespace)
@js.native
object formatFilterEqualToMod extends js.Object {
  @js.native
  class default protected () extends EqualTo {
    def this(propertyName: String, expression: String) = this()
    def this(propertyName: String, expression: Double) = this()
    def this(propertyName: String, expression: String, opt_matchCase: Boolean) = this()
    def this(propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
  }
  
  type EqualTo = typings.ol.formatFilterComparisonBinaryMod.default
}

