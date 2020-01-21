package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/NotEqualTo", JSImport.Namespace)
@js.native
object notEqualToMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.ol.comparisonBinaryMod.default {
    def this(propertyName: String, expression: String) = this()
    def this(propertyName: String, expression: Double) = this()
    def this(propertyName: String, expression: String, opt_matchCase: Boolean) = this()
    def this(propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
  }
  
  type NotEqualTo = typings.ol.comparisonBinaryMod.default
}

