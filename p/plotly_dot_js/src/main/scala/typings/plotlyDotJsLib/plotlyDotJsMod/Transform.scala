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

