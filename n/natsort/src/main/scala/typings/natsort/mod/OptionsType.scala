package typings.natsort.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsType extends js.Object {
  var desc: js.UndefOr[Boolean] = js.native
  var insensitive: js.UndefOr[Boolean] = js.native
}

object OptionsType {
  @scala.inline
  def apply(): OptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsType]
  }
  @scala.inline
  implicit class OptionsTypeOps[Self <: OptionsType] (val x: Self) extends AnyVal {
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
    def setDesc(value: Boolean): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    @scala.inline
    def setInsensitive(value: Boolean): Self = this.set("insensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsensitive: Self = this.set("insensitive", js.undefined)
  }
  
}

