package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsStrings.aggregate
import typings.plotlyDotJs.plotlyDotJsStrings.ascending
import typings.plotlyDotJs.plotlyDotJsStrings.descending
import typings.plotlyDotJs.plotlyDotJsStrings.filter
import typings.plotlyDotJs.plotlyDotJsStrings.groupby
import typings.plotlyDotJs.plotlyDotJsStrings.sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var aggregations: js.Array[TransformAggregation]
  var enabled: Boolean
  var groups: String | (js.Array[Double | String])
  var nameformat: String
  var operation: String
  var order: ascending | descending
  var preservegaps: Boolean
  var styles: js.Array[TransformStyle]
  var target: Double | String | (js.Array[Double | String])
  var `type`: aggregate | filter | groupby | sort
  var value: js.Any
}

object Transform {
  @scala.inline
  def apply(
    aggregations: js.Array[TransformAggregation],
    enabled: Boolean,
    groups: String | (js.Array[Double | String]),
    nameformat: String,
    operation: String,
    order: ascending | descending,
    preservegaps: Boolean,
    styles: js.Array[TransformStyle],
    target: Double | String | (js.Array[Double | String]),
    `type`: aggregate | filter | groupby | sort,
    value: js.Any
  ): Transform = {
    val __obj = js.Dynamic.literal(aggregations = aggregations.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], nameformat = nameformat.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preservegaps = preservegaps.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
}

