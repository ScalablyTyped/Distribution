package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageSummary extends js.Object {
  var messageDetail: js.UndefOr[String] = js.native
  var messageSummary: js.UndefOr[String] = js.native
}

object MessageSummary {
  @scala.inline
  def apply(): MessageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSummary]
  }
  @scala.inline
  implicit class MessageSummaryOps[Self <: MessageSummary] (val x: Self) extends AnyVal {
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
    def setMessageDetail(value: String): Self = this.set("messageDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageDetail: Self = this.set("messageDetail", js.undefined)
    @scala.inline
    def setMessageSummary(value: String): Self = this.set("messageSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageSummary: Self = this.set("messageSummary", js.undefined)
  }
  
}

