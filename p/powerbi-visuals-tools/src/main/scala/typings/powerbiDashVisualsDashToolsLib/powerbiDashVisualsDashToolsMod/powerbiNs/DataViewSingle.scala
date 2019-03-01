package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewSingle extends js.Object {
  var value: PrimitiveValue
}

object DataViewSingle {
  @scala.inline
  def apply(value: PrimitiveValue): DataViewSingle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewSingle]
  }
}

