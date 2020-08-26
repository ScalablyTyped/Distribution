package typings.nuclearJs.mod

import typings.nuclearJs.anon.LogAppState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactorConfig extends js.Object {
  /** If true it will log the entire app state for every dispatch. */
  var debug: js.UndefOr[Boolean] = js.native
  /** Additional options for customizing Reactor behavior. */
  var options: js.UndefOr[LogAppState] = js.native
}

object ReactorConfig {
  @scala.inline
  def apply(): ReactorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactorConfig]
  }
  @scala.inline
  implicit class ReactorConfigOps[Self <: ReactorConfig] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setOptions(value: LogAppState): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

