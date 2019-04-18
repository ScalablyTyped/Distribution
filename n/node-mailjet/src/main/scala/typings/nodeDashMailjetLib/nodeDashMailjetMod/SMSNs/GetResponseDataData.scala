package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// other types
trait GetResponseDataData extends js.Object {
  val Cost: ResponseCost
  val CreationTS: scala.Double
  val From: java.lang.String
  val MessageId: java.lang.String
  val SMSCount: scala.Double
  val SentTS: scala.Double
  val Status: ResponseStatus
  val To: java.lang.String
}

object GetResponseDataData {
  @scala.inline
  def apply(
    Cost: ResponseCost,
    CreationTS: scala.Double,
    From: java.lang.String,
    MessageId: java.lang.String,
    SMSCount: scala.Double,
    SentTS: scala.Double,
    Status: ResponseStatus,
    To: java.lang.String
  ): GetResponseDataData = {
    val __obj = js.Dynamic.literal(Cost = Cost, CreationTS = CreationTS, From = From, MessageId = MessageId, SMSCount = SMSCount, SentTS = SentTS, Status = Status, To = To)
  
    __obj.asInstanceOf[GetResponseDataData]
  }
}

