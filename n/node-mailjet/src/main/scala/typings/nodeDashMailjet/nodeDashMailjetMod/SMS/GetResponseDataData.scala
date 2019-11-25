package typings.nodeDashMailjet.nodeDashMailjetMod.SMS

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
    val __obj = js.Dynamic.literal(Cost = Cost.asInstanceOf[js.Any], CreationTS = CreationTS.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], SMSCount = SMSCount.asInstanceOf[js.Any], SentTS = SentTS.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetResponseDataData]
  }
}

