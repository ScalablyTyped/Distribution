package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1` extends js.Object {
  var newVal: js.UndefOr[js.Any] = js.native
  var oldVal: js.UndefOr[js.Any] = js.native
}

object `1` {
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
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
    def setNewVal(value: js.Any): Self = this.set("newVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewVal: Self = this.set("newVal", js.undefined)
    @scala.inline
    def setOldVal(value: js.Any): Self = this.set("oldVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldVal: Self = this.set("oldVal", js.undefined)
  }
  
}

