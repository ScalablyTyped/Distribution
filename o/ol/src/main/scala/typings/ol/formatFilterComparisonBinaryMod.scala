package typings.ol

import typings.ol.formatFilterComparisonBinaryMod.ComparisonBinary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/ComparisonBinary", JSImport.Namespace)
@js.native
object formatFilterComparisonBinaryMod extends js.Object {
  @js.native
  class default protected () extends ComparisonBinary {
    def this(tagName: String, propertyName: String, expression: String) = this()
    def this(tagName: String, propertyName: String, expression: Double) = this()
    def this(tagName: String, propertyName: String, expression: String, opt_matchCase: Boolean) = this()
    def this(tagName: String, propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
  }
  
  type ComparisonBinary = typings.ol.formatFilterComparisonMod.default
}

