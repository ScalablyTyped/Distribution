package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewTreeNodeMeasureValue
  extends DataViewTreeNodeValue
     with DataViewColumnAggregates {
  var highlight: js.UndefOr[PrimitiveValue] = js.undefined
}

object DataViewTreeNodeMeasureValue {
  @scala.inline
  def apply(
    average: PrimitiveValue = null,
    count: scala.Int | scala.Double = null,
    highlight: PrimitiveValue = null,
    max: PrimitiveValue = null,
    maxLocal: PrimitiveValue = null,
    median: PrimitiveValue = null,
    min: PrimitiveValue = null,
    minLocal: PrimitiveValue = null,
    percentiles: js.Array[DataViewColumnPercentileAggregate] = null,
    single: PrimitiveValue = null,
    subtotal: PrimitiveValue = null,
    value: PrimitiveValue = null
  ): DataViewTreeNodeMeasureValue = {
    val __obj = js.Dynamic.literal()
    if (average != null) __obj.updateDynamic("average")(average.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLocal != null) __obj.updateDynamic("maxLocal")(maxLocal.asInstanceOf[js.Any])
    if (median != null) __obj.updateDynamic("median")(median.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLocal != null) __obj.updateDynamic("minLocal")(minLocal.asInstanceOf[js.Any])
    if (percentiles != null) __obj.updateDynamic("percentiles")(percentiles)
    if (single != null) __obj.updateDynamic("single")(single.asInstanceOf[js.Any])
    if (subtotal != null) __obj.updateDynamic("subtotal")(subtotal.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewTreeNodeMeasureValue]
  }
}

