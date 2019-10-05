package typings.ol

import typings.ol.formatFilterGreaterThanMod.GreaterThan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/GreaterThan", JSImport.Namespace)
@js.native
object formatFilterGreaterThanMod extends js.Object {
  @js.native
  class default protected () extends GreaterThan {
    def this(propertyName: String, expression: Double) = this()
  }
  
  type GreaterThan = typings.ol.formatFilterComparisonBinaryMod.default
}

