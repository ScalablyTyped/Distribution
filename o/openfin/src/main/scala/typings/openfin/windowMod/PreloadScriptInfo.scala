package typings.openfin.windowMod

import typings.openfin.openfinStrings.`load-failed`
import typings.openfin.openfinStrings.failed
import typings.openfin.openfinStrings.succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreloadScriptInfo extends js.Object {
  var state: `load-failed` | failed | succeeded = js.native
}

object PreloadScriptInfo {
  @scala.inline
  def apply(state: `load-failed` | failed | succeeded): PreloadScriptInfo = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadScriptInfo]
  }
  @scala.inline
  implicit class PreloadScriptInfoOps[Self <: PreloadScriptInfo] (val x: Self) extends AnyVal {
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
    def setState(value: `load-failed` | failed | succeeded): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

