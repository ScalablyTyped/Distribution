package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewTreeNodeValue extends js.Object {
  var value: js.UndefOr[PrimitiveValue] = js.undefined
}

object DataViewTreeNodeValue {
  @scala.inline
  def apply(value: PrimitiveValue = null): DataViewTreeNodeValue = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewTreeNodeValue]
  }
}

