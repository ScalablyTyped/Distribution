package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostResponseDataTo extends StObject {
  
  val Email: String = js.native
  
  val MessageHref: String = js.native
  
  val MessageID: Double = js.native
  
  val MessageUUID: String = js.native
}
object PostResponseDataTo {
  
  @scala.inline
  def apply(Email: String, MessageHref: String, MessageID: Double, MessageUUID: String): PostResponseDataTo = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], MessageHref = MessageHref.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageUUID = MessageUUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponseDataTo]
  }
  
  @scala.inline
  implicit class PostResponseDataToMutableBuilder[Self <: PostResponseDataTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageHref(value: String): Self = StObject.set(x, "MessageHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageID(value: Double): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUUID(value: String): Self = StObject.set(x, "MessageUUID", value.asInstanceOf[js.Any])
  }
}
