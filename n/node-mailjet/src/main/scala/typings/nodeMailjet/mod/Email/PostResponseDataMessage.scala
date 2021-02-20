package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostResponseDataMessage extends StObject {
  
  val Bcc: js.Array[PostResponseDataTo] = js.native
  
  val Cc: js.Array[PostResponseDataTo] = js.native
  
  val CustomID: String = js.native
  
  val Status: String = js.native
  
  val To: js.Array[PostResponseDataTo] = js.native
}
object PostResponseDataMessage {
  
  @scala.inline
  def apply(
    Bcc: js.Array[PostResponseDataTo],
    Cc: js.Array[PostResponseDataTo],
    CustomID: String,
    Status: String,
    To: js.Array[PostResponseDataTo]
  ): PostResponseDataMessage = {
    val __obj = js.Dynamic.literal(Bcc = Bcc.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], CustomID = CustomID.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponseDataMessage]
  }
  
  @scala.inline
  implicit class PostResponseDataMessageMutableBuilder[Self <: PostResponseDataMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBcc(value: js.Array[PostResponseDataTo]): Self = StObject.set(x, "Bcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccVarargs(value: PostResponseDataTo*): Self = StObject.set(x, "Bcc", js.Array(value :_*))
    
    @scala.inline
    def setCc(value: js.Array[PostResponseDataTo]): Self = StObject.set(x, "Cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcVarargs(value: PostResponseDataTo*): Self = StObject.set(x, "Cc", js.Array(value :_*))
    
    @scala.inline
    def setCustomID(value: String): Self = StObject.set(x, "CustomID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: js.Array[PostResponseDataTo]): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToVarargs(value: PostResponseDataTo*): Self = StObject.set(x, "To", js.Array(value :_*))
  }
}
