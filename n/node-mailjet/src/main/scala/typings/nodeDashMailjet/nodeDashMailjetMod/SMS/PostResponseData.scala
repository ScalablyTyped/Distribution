package typings.nodeDashMailjet.nodeDashMailjetMod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostResponseData extends js.Object {
  val Cost: ResponseCost
  val CreationTS: Double
  val From: String
  val MessageId: String
  val SentTS: Double
  val SmsCount: Double
  val Status: ResponseStatus
  val Text: String
  val To: String
}

object PostResponseData {
  @scala.inline
  def apply(
    Cost: ResponseCost,
    CreationTS: Double,
    From: String,
    MessageId: String,
    SentTS: Double,
    SmsCount: Double,
    Status: ResponseStatus,
    Text: String,
    To: String
  ): PostResponseData = {
    val __obj = js.Dynamic.literal(Cost = Cost.asInstanceOf[js.Any], CreationTS = CreationTS.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], SentTS = SentTS.asInstanceOf[js.Any], SmsCount = SmsCount.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostResponseData]
  }
}

