package typings.momentMini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentBuiltinFormat extends js.Object {
  var __momentBuiltinFormatBrand: js.Any = js.native
}

object MomentBuiltinFormat {
  @scala.inline
  def apply(__momentBuiltinFormatBrand: js.Any): MomentBuiltinFormat = {
    val __obj = js.Dynamic.literal(__momentBuiltinFormatBrand = __momentBuiltinFormatBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentBuiltinFormat]
  }
  @scala.inline
  implicit class MomentBuiltinFormatOps[Self <: MomentBuiltinFormat] (val x: Self) extends AnyVal {
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
    def set__momentBuiltinFormatBrand(value: js.Any): Self = this.set("__momentBuiltinFormatBrand", value.asInstanceOf[js.Any])
  }
  
}

