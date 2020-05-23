package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaselineEnd[K2, D2]
  extends /* key */ StringDictionary[js.Any] {
  var baselineEnd: String
  var baselineStart: String
  var end: String
  var rowContext: ComponentElement[K2]
  var start: String
  var taskContexts: js.Array[ItemData[K2, D2]]
  var value: String
}

object BaselineEnd {
  @scala.inline
  def apply[K2, D2](
    baselineEnd: String,
    baselineStart: String,
    end: String,
    rowContext: ComponentElement[K2],
    start: String,
    taskContexts: js.Array[ItemData[K2, D2]],
    value: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): BaselineEnd[K2, D2] = {
    val __obj = js.Dynamic.literal(baselineEnd = baselineEnd.asInstanceOf[js.Any], baselineStart = baselineStart.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taskContexts = taskContexts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BaselineEnd[K2, D2]]
  }
}

