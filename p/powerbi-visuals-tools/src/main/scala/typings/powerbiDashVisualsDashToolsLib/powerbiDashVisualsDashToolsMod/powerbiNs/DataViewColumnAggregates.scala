package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewColumnAggregates extends js.Object {
  var average: js.UndefOr[PrimitiveValue] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[PrimitiveValue] = js.undefined
  /** Client-computed maximum value for a column. */
  var maxLocal: js.UndefOr[PrimitiveValue] = js.undefined
  var median: js.UndefOr[PrimitiveValue] = js.undefined
  var min: js.UndefOr[PrimitiveValue] = js.undefined
  /** Client-computed maximum value for a column. */
  var minLocal: js.UndefOr[PrimitiveValue] = js.undefined
  var percentiles: js.UndefOr[js.Array[DataViewColumnPercentileAggregate]] = js.undefined
  /** Represents a single value evaluation, similar to a total. */
  var single: js.UndefOr[PrimitiveValue] = js.undefined
  var subtotal: js.UndefOr[PrimitiveValue] = js.undefined
}

