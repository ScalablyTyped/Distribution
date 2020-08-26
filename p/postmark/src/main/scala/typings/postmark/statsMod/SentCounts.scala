package typings.postmark.statsMod

import typings.postmark.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentCounts extends js.Object {
  var Days: js.Array[Date] = js.native
  var Sent: Double = js.native
}

object SentCounts {
  @scala.inline
  def apply(Days: js.Array[Date], Sent: Double): SentCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentCounts]
  }
  @scala.inline
  implicit class SentCountsOps[Self <: SentCounts] (val x: Self) extends AnyVal {
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
    def setDaysVarargs(value: Date*): Self = this.set("Days", js.Array(value :_*))
    @scala.inline
    def setDays(value: js.Array[Date]): Self = this.set("Days", value.asInstanceOf[js.Any])
    @scala.inline
    def setSent(value: Double): Self = this.set("Sent", value.asInstanceOf[js.Any])
  }
  
}

