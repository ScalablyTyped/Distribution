package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewColumnPercentileAggregate extends js.Object {
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var k: scala.Double
  var value: PrimitiveValue
}

object DataViewColumnPercentileAggregate {
  @scala.inline
  def apply(k: scala.Double, value: PrimitiveValue, exclusive: js.UndefOr[scala.Boolean] = js.undefined): DataViewColumnPercentileAggregate = {
    val __obj = js.Dynamic.literal(k = k, value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    __obj.asInstanceOf[DataViewColumnPercentileAggregate]
  }
}

