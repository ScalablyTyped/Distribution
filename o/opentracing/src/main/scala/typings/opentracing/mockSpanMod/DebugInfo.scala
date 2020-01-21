package typings.opentracing.mockSpanMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugInfo extends js.Object {
  var millis: js.Tuple3[Double, Double, Double]
  var operation: String
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var uuid: String
}

object DebugInfo {
  @scala.inline
  def apply(
    millis: js.Tuple3[Double, Double, Double],
    operation: String,
    uuid: String,
    tags: StringDictionary[js.Any] = null
  ): DebugInfo = {
    val __obj = js.Dynamic.literal(millis = millis.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInfo]
  }
}

