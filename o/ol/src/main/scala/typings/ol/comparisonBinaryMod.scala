package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/ComparisonBinary", JSImport.Namespace)
@js.native
object comparisonBinaryMod extends js.Object {
  @js.native
  abstract class default protected ()
    extends typings.ol.comparisonMod.default {
    def this(tagName: String, propertyName: String, expression: String) = this()
    def this(tagName: String, propertyName: String, expression: Double) = this()
    def this(tagName: String, propertyName: String, expression: String, opt_matchCase: Boolean) = this()
    def this(tagName: String, propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
  }
  
  type ComparisonBinary = typings.ol.comparisonMod.default
}

