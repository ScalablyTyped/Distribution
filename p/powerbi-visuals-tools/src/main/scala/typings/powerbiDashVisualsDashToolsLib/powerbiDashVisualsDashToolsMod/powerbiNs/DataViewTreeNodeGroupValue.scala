package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewTreeNodeGroupValue extends DataViewTreeNodeValue {
  var count: js.UndefOr[PrimitiveValue] = js.undefined
}

object DataViewTreeNodeGroupValue {
  @scala.inline
  def apply(count: PrimitiveValue = null, value: PrimitiveValue = null): DataViewTreeNodeGroupValue = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewTreeNodeGroupValue]
  }
}

