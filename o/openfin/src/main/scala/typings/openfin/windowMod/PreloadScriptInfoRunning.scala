package typings.openfin.windowMod

import typings.openfin.openfinStrings.`load-failed`
import typings.openfin.openfinStrings.`load-started`
import typings.openfin.openfinStrings.`load-succeeded`
import typings.openfin.openfinStrings.failed
import typings.openfin.openfinStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreloadScriptInfoRunning extends js.Object {
  var state: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded = js.native
}

object PreloadScriptInfoRunning {
  @scala.inline
  def apply(state: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded): PreloadScriptInfoRunning = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadScriptInfoRunning]
  }
  @scala.inline
  implicit class PreloadScriptInfoRunningOps[Self <: PreloadScriptInfoRunning] (val x: Self) extends AnyVal {
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
    def setState(value: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

