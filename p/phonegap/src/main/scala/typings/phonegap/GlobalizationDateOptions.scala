package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalizationDateOptions extends js.Object {
  var formatLength: js.UndefOr[String] = js.native
  var selector: js.UndefOr[String] = js.native
}

object GlobalizationDateOptions {
  @scala.inline
  def apply(): GlobalizationDateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalizationDateOptions]
  }
  @scala.inline
  implicit class GlobalizationDateOptionsOps[Self <: GlobalizationDateOptions] (val x: Self) extends AnyVal {
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
    def setFormatLength(value: String): Self = this.set("formatLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatLength: Self = this.set("formatLength", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

