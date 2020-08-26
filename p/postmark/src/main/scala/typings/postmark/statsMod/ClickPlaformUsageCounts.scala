package typings.postmark.statsMod

import typings.postmark.anon.Mobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClickPlaformUsageCounts extends js.Object {
  var Days: js.Array[Mobile] = js.native
  var Desktop: Double = js.native
  var Mobile: Double = js.native
  var Unknown: Double = js.native
}

object ClickPlaformUsageCounts {
  @scala.inline
  def apply(Days: js.Array[Mobile], Desktop: Double, Mobile: Double, Unknown: Double): ClickPlaformUsageCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Desktop = Desktop.asInstanceOf[js.Any], Mobile = Mobile.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickPlaformUsageCounts]
  }
  @scala.inline
  implicit class ClickPlaformUsageCountsOps[Self <: ClickPlaformUsageCounts] (val x: Self) extends AnyVal {
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
    def setDaysVarargs(value: Mobile*): Self = this.set("Days", js.Array(value :_*))
    @scala.inline
    def setDays(value: js.Array[Mobile]): Self = this.set("Days", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesktop(value: Double): Self = this.set("Desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobile(value: Double): Self = this.set("Mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknown(value: Double): Self = this.set("Unknown", value.asInstanceOf[js.Any])
  }
  
}

