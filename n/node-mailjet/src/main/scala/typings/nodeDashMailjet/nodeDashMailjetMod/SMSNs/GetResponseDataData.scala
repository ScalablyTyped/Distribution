package typings.nodeDashMailjet.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// other types
trait GetResponseDataData extends js.Object {
  val Cost: ResponseCost
  val CreationTS: Double
  val From: String
  val MessageId: String
  val SMSCount: Double
  val SentTS: Double
  val Status: ResponseStatus
  val To: String
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
    val __obj = js.Dynamic.literal(Cost = Cost, CreationTS = CreationTS, From = From, MessageId = MessageId, SMSCount = SMSCount, SentTS = SentTS, Status = Status, To = To)
  
    __obj.asInstanceOf[GetResponseDataData]
  }
}

