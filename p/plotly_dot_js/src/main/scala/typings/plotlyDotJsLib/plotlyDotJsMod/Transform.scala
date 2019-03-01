package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var aggregations: js.Array[TransformAggregation]
  var enabled: scala.Boolean
  var groups: java.lang.String | js.Array[scala.Double] | js.Array[java.lang.String]
  var nameformat: java.lang.String
  var operation: java.lang.String
  var order: plotlyDotJsLib.plotlyDotJsLibStrings.ascending | plotlyDotJsLib.plotlyDotJsLibStrings.descending
  var preservegaps: scala.Boolean
  var styles: js.Array[TransformStyle]
  var target: scala.Double | java.lang.String | js.Array[scala.Double] | js.Array[java.lang.String]
  var `type`: plotlyDotJsLib.plotlyDotJsLibStrings.aggregate | plotlyDotJsLib.plotlyDotJsLibStrings.filter | plotlyDotJsLib.plotlyDotJsLibStrings.groupby | plotlyDotJsLib.plotlyDotJsLibStrings.sort
  var value: js.Any
}

object Transform {
  @scala.inline
  def apply(
    aggregations: js.Array[TransformAggregation],
    enabled: scala.Boolean,
    groups: java.lang.String | js.Array[scala.Double] | js.Array[java.lang.String],
    nameformat: java.lang.String,
    operation: java.lang.String,
    order: plotlyDotJsLib.plotlyDotJsLibStrings.ascending | plotlyDotJsLib.plotlyDotJsLibStrings.descending,
    preservegaps: scala.Boolean,
    styles: js.Array[TransformStyle],
    target: scala.Double | java.lang.String | js.Array[scala.Double] | js.Array[java.lang.String],
    `type`: plotlyDotJsLib.plotlyDotJsLibStrings.aggregate | plotlyDotJsLib.plotlyDotJsLibStrings.filter | plotlyDotJsLib.plotlyDotJsLibStrings.groupby | plotlyDotJsLib.plotlyDotJsLibStrings.sort,
    value: js.Any
  ): Transform = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("aggregations")(aggregations)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    __obj.updateDynamic("nameformat")(nameformat)
    __obj.updateDynamic("operation")(operation)
    __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.updateDynamic("preservegaps")(preservegaps)
    __obj.updateDynamic("styles")(styles)
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Transform]
  }
}

