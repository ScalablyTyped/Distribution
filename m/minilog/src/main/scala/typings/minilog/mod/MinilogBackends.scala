package typings.minilog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinilogBackends extends js.Object {
  var array: js.Any
  var browser: js.Any
  var console: Console
  var jQuery: js.Any
  var localstorage: js.Any
}

object MinilogBackends {
  @scala.inline
  def apply(array: js.Any, browser: js.Any, console: Console, jQuery: js.Any, localstorage: js.Any): MinilogBackends = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], console = console.asInstanceOf[js.Any], jQuery = jQuery.asInstanceOf[js.Any], localstorage = localstorage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MinilogBackends]
  }
}

