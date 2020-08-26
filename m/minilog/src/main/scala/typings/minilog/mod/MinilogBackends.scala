package typings.minilog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinilogBackends extends js.Object {
  var array: js.Any = js.native
  var browser: js.Any = js.native
  var console: Console = js.native
  var jQuery: js.Any = js.native
  var localstorage: js.Any = js.native
}

object MinilogBackends {
  @scala.inline
  def apply(array: js.Any, browser: js.Any, console: Console, jQuery: js.Any, localstorage: js.Any): MinilogBackends = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], console = console.asInstanceOf[js.Any], jQuery = jQuery.asInstanceOf[js.Any], localstorage = localstorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinilogBackends]
  }
  @scala.inline
  implicit class MinilogBackendsOps[Self <: MinilogBackends] (val x: Self) extends AnyVal {
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
    def setArray(value: js.Any): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowser(value: js.Any): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsole(value: Console): Self = this.set("console", value.asInstanceOf[js.Any])
    @scala.inline
    def setJQuery(value: js.Any): Self = this.set("jQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalstorage(value: js.Any): Self = this.set("localstorage", value.asInstanceOf[js.Any])
  }
  
}

