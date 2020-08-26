package typings.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// other types
@js.native
trait GetResponseDataData extends js.Object {
  val Cost: ResponseCost = js.native
  val CreationTS: Double = js.native
  val From: String = js.native
  val MessageId: String = js.native
  val SMSCount: Double = js.native
  val SentTS: Double = js.native
  val Status: ResponseStatus = js.native
  val To: String = js.native
}

object GetResponseDataData {
  @scala.inline
  def apply(
    Cost: ResponseCost,
    CreationTS: Double,
    From: String,
    MessageId: String,
    SMSCount: Double,
    SentTS: Double,
    Status: ResponseStatus,
    To: String
  ): GetResponseDataData = {
    val __obj = js.Dynamic.literal(Cost = Cost.asInstanceOf[js.Any], CreationTS = CreationTS.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], SMSCount = SMSCount.asInstanceOf[js.Any], SentTS = SentTS.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseDataData]
  }
  @scala.inline
  implicit class GetResponseDataDataOps[Self <: GetResponseDataData] (val x: Self) extends AnyVal {
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
    def setCost(value: ResponseCost): Self = this.set("Cost", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationTS(value: Double): Self = this.set("CreationTS", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("From", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageId(value: String): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSMSCount(value: Double): Self = this.set("SMSCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSentTS(value: Double): Self = this.set("SentTS", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ResponseStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("To", value.asInstanceOf[js.Any])
  }
  
}

