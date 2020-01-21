package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaselineEnd[K2, D2]
  extends /* propName */ StringDictionary[js.Any] {
  var baselineEnd: String
  var baselineStart: String
  var end: String
  var rowContext: AnonComponentElement[K2]
  var start: String
  var taskContexts: js.Array[AnonColorData[K2, D2]]
  var value: String
}

object AnonBaselineEnd {
  @scala.inline
  def apply[K2, D2](
    baselineEnd: String,
    baselineStart: String,
    end: String,
    rowContext: AnonComponentElement[K2],
    start: String,
    taskContexts: js.Array[AnonColorData[K2, D2]],
    value: String,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonBaselineEnd[K2, D2] = {
    val __obj = js.Dynamic.literal(baselineEnd = baselineEnd.asInstanceOf[js.Any], baselineStart = baselineStart.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taskContexts = taskContexts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonBaselineEnd[K2, D2]]
  }
}

