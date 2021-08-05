package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponseData extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: PostResponseData](x: Self) {
    
    inline def setCost(value: ResponseCost): Self = StObject.set(x, "Cost", value.asInstanceOf[js.Any])
    
    inline def setCreationTS(value: Double): Self = StObject.set(x, "CreationTS", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setSentTS(value: Double): Self = StObject.set(x, "SentTS", value.asInstanceOf[js.Any])
    
    inline def setSmsCount(value: Double): Self = StObject.set(x, "SmsCount", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ResponseStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
