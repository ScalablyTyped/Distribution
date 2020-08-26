package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidMinimumOperatingSystem extends js.Object {
  // Version 4.0 or later.
  var v4_0: js.UndefOr[Boolean] = js.native
  // Version 4.0.3 or later.
  var v4_0_3: js.UndefOr[Boolean] = js.native
  // Version 4.1 or later.
  var v4_1: js.UndefOr[Boolean] = js.native
  // Version 4.2 or later.
  var v4_2: js.UndefOr[Boolean] = js.native
  // Version 4.3 or later.
  var v4_3: js.UndefOr[Boolean] = js.native
  // Version 4.4 or later.
  var v4_4: js.UndefOr[Boolean] = js.native
  // Version 5.0 or later.
  var v5_0: js.UndefOr[Boolean] = js.native
  // Version 5.1 or later.
  var v5_1: js.UndefOr[Boolean] = js.native
}

object AndroidMinimumOperatingSystem {
  @scala.inline
  def apply(): AndroidMinimumOperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidMinimumOperatingSystem]
  }
  @scala.inline
  implicit class AndroidMinimumOperatingSystemOps[Self <: AndroidMinimumOperatingSystem] (val x: Self) extends AnyVal {
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
    def setV4_0(value: Boolean): Self = this.set("v4_0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV4_0: Self = this.set("v4_0", js.undefined)
    @scala.inline
    def setV4_0_3(value: Boolean): Self = this.set("v4_0_3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV4_0_3: Self = this.set("v4_0_3", js.undefined)
    @scala.inline
    def setV4_1(value: Boolean): Self = this.set("v4_1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV4_1: Self = this.set("v4_1", js.undefined)
    @scala.inline
    def setV4_2(value: Boolean): Self = this.set("v4_2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV4_2: Self = this.set("v4_2", js.undefined)
    @scala.inline
    def setV4_3(value: Boolean): Self = this.set("v4_3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV4_3: Self = this.set("v4_3", js.undefined)
    @scala.inline
    def setV4_4(value: Boolean): Self = this.set("v4_4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV4_4: Self = this.set("v4_4", js.undefined)
    @scala.inline
    def setV5_0(value: Boolean): Self = this.set("v5_0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV5_0: Self = this.set("v5_0", js.undefined)
    @scala.inline
    def setV5_1(value: Boolean): Self = this.set("v5_1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV5_1: Self = this.set("v5_1", js.undefined)
  }
  
}

