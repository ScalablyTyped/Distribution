package typings.postmark.statsMod

import typings.postmark.anon.Desktop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailPlaformUsageCounts extends js.Object {
  var Days: js.Array[Desktop] = js.native
  var Desktop: js.UndefOr[Double] = js.native
  var Mobile: js.UndefOr[Double] = js.native
  var Unknown: js.UndefOr[Double] = js.native
  var WebMail: js.UndefOr[Double] = js.native
}

object EmailPlaformUsageCounts {
  @scala.inline
  def apply(Days: js.Array[Desktop]): EmailPlaformUsageCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailPlaformUsageCounts]
  }
  @scala.inline
  implicit class EmailPlaformUsageCountsOps[Self <: EmailPlaformUsageCounts] (val x: Self) extends AnyVal {
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
    def setDaysVarargs(value: Desktop*): Self = this.set("Days", js.Array(value :_*))
    @scala.inline
    def setDays(value: js.Array[Desktop]): Self = this.set("Days", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesktop(value: Double): Self = this.set("Desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktop: Self = this.set("Desktop", js.undefined)
    @scala.inline
    def setMobile(value: Double): Self = this.set("Mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobile: Self = this.set("Mobile", js.undefined)
    @scala.inline
    def setUnknown(value: Double): Self = this.set("Unknown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknown: Self = this.set("Unknown", js.undefined)
    @scala.inline
    def setWebMail(value: Double): Self = this.set("WebMail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebMail: Self = this.set("WebMail", js.undefined)
  }
  
}

