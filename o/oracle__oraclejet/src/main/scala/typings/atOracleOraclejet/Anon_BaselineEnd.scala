package typings.atOracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaselineEnd[K2, D2]
  extends /* propName */ StringDictionary[js.Any] {
  var baselineEnd: String
  var baselineStart: String
  var end: String
  var rowContext: Anon_ComponentElement[K2]
  var start: String
  var taskContexts: js.Array[Anon_ColorData[K2, D2]]
  var value: String
}

object Anon_BaselineEnd {
  @scala.inline
  def apply[K2, D2](
    baselineEnd: String,
    baselineStart: String,
    end: String,
    rowContext: Anon_ComponentElement[K2],
    start: String,
    taskContexts: js.Array[Anon_ColorData[K2, D2]],
    value: String,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Anon_BaselineEnd[K2, D2] = {
    val __obj = js.Dynamic.literal(baselineEnd = baselineEnd, baselineStart = baselineStart, end = end, rowContext = rowContext, start = start, taskContexts = taskContexts, value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_BaselineEnd[K2, D2]]
  }
}

