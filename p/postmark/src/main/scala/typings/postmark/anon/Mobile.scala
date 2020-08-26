package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mobile extends js.Object {
  var Date: String = js.native
  var Desktop: Double = js.native
  var Mobile: Double = js.native
  var Unknown: Double = js.native
}

object Mobile {
  @scala.inline
  def apply(Date: String, Desktop: Double, Mobile: Double, Unknown: Double): Mobile = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Desktop = Desktop.asInstanceOf[js.Any], Mobile = Mobile.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mobile]
  }
  @scala.inline
  implicit class MobileOps[Self <: Mobile] (val x: Self) extends AnyVal {
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
    def setDate(value: String): Self = this.set("Date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesktop(value: Double): Self = this.set("Desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobile(value: Double): Self = this.set("Mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknown(value: Double): Self = this.set("Unknown", value.asInstanceOf[js.Any])
  }
  
}

