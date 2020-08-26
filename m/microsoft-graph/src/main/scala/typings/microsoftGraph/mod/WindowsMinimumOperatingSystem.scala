package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsMinimumOperatingSystem extends js.Object {
  // Windows version 10.0 or later.
  var v10_0: js.UndefOr[Boolean] = js.native
  // Windows version 8.0 or later.
  var v8_0: js.UndefOr[Boolean] = js.native
  // Windows version 8.1 or later.
  var v8_1: js.UndefOr[Boolean] = js.native
}

object WindowsMinimumOperatingSystem {
  @scala.inline
  def apply(): WindowsMinimumOperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsMinimumOperatingSystem]
  }
  @scala.inline
  implicit class WindowsMinimumOperatingSystemOps[Self <: WindowsMinimumOperatingSystem] (val x: Self) extends AnyVal {
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
    def setV10_0(value: Boolean): Self = this.set("v10_0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV10_0: Self = this.set("v10_0", js.undefined)
    @scala.inline
    def setV8_0(value: Boolean): Self = this.set("v8_0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV8_0: Self = this.set("v8_0", js.undefined)
    @scala.inline
    def setV8_1(value: Boolean): Self = this.set("v8_1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV8_1: Self = this.set("v8_1", js.undefined)
  }
  
}

