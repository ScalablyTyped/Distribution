package typings.openfin.anon

import typings.openfin.windowOptionMod.ContentNavigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `8` extends js.Object {
  var newVal: js.UndefOr[ContentNavigation] = js.native
  var oldVal: js.UndefOr[ContentNavigation] = js.native
}

object `8` {
  @scala.inline
  def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`]
  }
  @scala.inline
  implicit class `8Ops`[Self <: `8`] (val x: Self) extends AnyVal {
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
    def setNewVal(value: ContentNavigation): Self = this.set("newVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewVal: Self = this.set("newVal", js.undefined)
    @scala.inline
    def setOldVal(value: ContentNavigation): Self = this.set("oldVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldVal: Self = this.set("oldVal", js.undefined)
  }
  
}

