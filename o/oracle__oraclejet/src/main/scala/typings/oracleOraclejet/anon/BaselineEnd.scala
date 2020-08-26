package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaselineEnd[K2, D2]
  extends /* key */ StringDictionary[js.Any] {
  var baselineEnd: String = js.native
  var baselineStart: String = js.native
  var end: String = js.native
  var rowContext: ComponentElement[K2] = js.native
  var start: String = js.native
  var taskContexts: js.Array[ItemData[K2, D2]] = js.native
  var value: String = js.native
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
    value: String
  ): BaselineEnd[K2, D2] = {
    val __obj = js.Dynamic.literal(baselineEnd = baselineEnd.asInstanceOf[js.Any], baselineStart = baselineStart.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taskContexts = taskContexts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaselineEnd[K2, D2]]
  }
  @scala.inline
  implicit class BaselineEndOps[Self <: BaselineEnd[_, _], K2, D2] (val x: Self with (BaselineEnd[K2, D2])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaselineEnd(value: String): Self = this.set("baselineEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaselineStart(value: String): Self = this.set("baselineStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowContext(value: ComponentElement[K2]): Self = this.set("rowContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskContextsVarargs(value: (ItemData[K2, D2])*): Self = this.set("taskContexts", js.Array(value :_*))
    @scala.inline
    def setTaskContexts(value: js.Array[ItemData[K2, D2]]): Self = this.set("taskContexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

