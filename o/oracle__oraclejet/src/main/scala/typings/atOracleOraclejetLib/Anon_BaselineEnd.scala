package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaselineEnd[K2, D2]
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var baselineEnd: java.lang.String
  var baselineStart: java.lang.String
  var end: java.lang.String
  var rowContext: Anon_ComponentElement[K2]
  var start: java.lang.String
  var taskContexts: js.Array[Anon_ColorData[K2, D2]]
  var value: java.lang.String
}

object Anon_BaselineEnd {
  @scala.inline
  def apply[K2, D2](
    baselineEnd: java.lang.String,
    baselineStart: java.lang.String,
    end: java.lang.String,
    rowContext: Anon_ComponentElement[K2],
    start: java.lang.String,
    taskContexts: js.Array[Anon_ColorData[K2, D2]],
    value: java.lang.String,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_BaselineEnd[K2, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baselineEnd")(baselineEnd)
    __obj.updateDynamic("baselineStart")(baselineStart)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("rowContext")(rowContext)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("taskContexts")(taskContexts)
    __obj.updateDynamic("value")(value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_BaselineEnd[K2, D2]]
  }
}

