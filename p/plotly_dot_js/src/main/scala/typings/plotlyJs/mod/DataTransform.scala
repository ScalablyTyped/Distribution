package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.aggregate
import typings.plotlyJs.plotlyJsStrings.ascending
import typings.plotlyJs.plotlyJsStrings.descending
import typings.plotlyJs.plotlyJsStrings.filter
import typings.plotlyJs.plotlyJsStrings.groupby
import typings.plotlyJs.plotlyJsStrings.sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Transform> */
trait DataTransform extends js.Object {
  var aggregations: js.UndefOr[js.Array[TransformAggregation]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var groups: js.UndefOr[String | (js.Array[Double | String])] = js.undefined
  var nameformat: js.UndefOr[String] = js.undefined
  var operation: js.UndefOr[String] = js.undefined
  var order: js.UndefOr[ascending | descending] = js.undefined
  var preservegaps: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[js.Array[TransformStyle]] = js.undefined
  var target: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
  var `type`: js.UndefOr[aggregate | filter | groupby | sort] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DataTransform {
  @scala.inline
  def apply(
    aggregations: js.Array[TransformAggregation] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    groups: String | (js.Array[Double | String]) = null,
    nameformat: String = null,
    operation: String = null,
    order: ascending | descending = null,
    preservegaps: js.UndefOr[Boolean] = js.undefined,
    styles: js.Array[TransformStyle] = null,
    target: Double | String | (js.Array[Double | String]) = null,
    `type`: aggregate | filter | groupby | sort = null,
    value: js.Any = null
  ): DataTransform = {
    val __obj = js.Dynamic.literal()
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (nameformat != null) __obj.updateDynamic("nameformat")(nameformat.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(preservegaps)) __obj.updateDynamic("preservegaps")(preservegaps.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransform]
  }
}

