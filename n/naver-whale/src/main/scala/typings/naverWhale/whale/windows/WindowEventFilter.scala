package typings.naverWhale.whale.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowEventFilter extends js.Object {
  /**
    * Conditions that the window's type being created must satisfy. By default it will satisfy ['app', 'normal', 'panel', 'popup'], with 'app' and 'panel' window types limited to the extension's own windows.
    * Each one of: "normal", "popup", "panel", "app", or "devtools"
    */
  var windowTypes: js.Array[String] = js.native
}

object WindowEventFilter {
  @scala.inline
  def apply(windowTypes: js.Array[String]): WindowEventFilter = {
    val __obj = js.Dynamic.literal(windowTypes = windowTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventFilter]
  }
  @scala.inline
  implicit class WindowEventFilterOps[Self <: WindowEventFilter] (val x: Self) extends AnyVal {
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
    def setWindowTypesVarargs(value: String*): Self = this.set("windowTypes", js.Array(value :_*))
    @scala.inline
    def setWindowTypes(value: js.Array[String]): Self = this.set("windowTypes", value.asInstanceOf[js.Any])
  }
  
}

