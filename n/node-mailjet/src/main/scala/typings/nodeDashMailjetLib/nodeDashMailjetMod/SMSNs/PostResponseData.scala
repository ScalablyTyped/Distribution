package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostResponseData extends js.Object {
  val Cost: ResponseCost
  val CreationTS: scala.Double
  val From: java.lang.String
  val MessageId: java.lang.String
  val SentTS: scala.Double
  val SmsCount: scala.Double
  val Status: ResponseStatus
  val Text: java.lang.String
  val To: java.lang.String
}

object PostResponseData {
  @scala.inline
  def apply(
    Cost: ResponseCost,
    CreationTS: scala.Double,
    From: java.lang.String,
    MessageId: java.lang.String,
    SentTS: scala.Double,
    SmsCount: scala.Double,
    Status: ResponseStatus,
    Text: java.lang.String,
    To: java.lang.String
  ): PostResponseData = {
    val __obj = js.Dynamic.literal(Cost = Cost, CreationTS = CreationTS, From = From, MessageId = MessageId, SentTS = SentTS, SmsCount = SmsCount, Status = Status, Text = Text, To = To)
  
    __obj.asInstanceOf[PostResponseData]
  }
}

