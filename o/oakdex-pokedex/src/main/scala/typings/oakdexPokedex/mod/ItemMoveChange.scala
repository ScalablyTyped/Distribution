package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemMoveChange extends js.Object {
  var change_by: js.UndefOr[Double] = js.native
  var change_by_max: js.UndefOr[Double] = js.native
  var change_by_percent: js.UndefOr[Double] = js.native
  var field: String = js.native
}

object ItemMoveChange {
  @scala.inline
  def apply(field: String): ItemMoveChange = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMoveChange]
  }
  @scala.inline
  implicit class ItemMoveChangeOps[Self <: ItemMoveChange] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setChange_by(value: Double): Self = this.set("change_by", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChange_by: Self = this.set("change_by", js.undefined)
    @scala.inline
    def setChange_by_max(value: Double): Self = this.set("change_by_max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChange_by_max: Self = this.set("change_by_max", js.undefined)
    @scala.inline
    def setChange_by_percent(value: Double): Self = this.set("change_by_percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChange_by_percent: Self = this.set("change_by_percent", js.undefined)
  }
  
}

