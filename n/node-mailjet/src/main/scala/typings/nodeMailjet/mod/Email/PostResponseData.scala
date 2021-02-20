package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostResponseData extends StObject {
  
  val Messages: js.Array[PostResponseDataMessage] = js.native
}
object PostResponseData {
  
  @scala.inline
  def apply(Messages: js.Array[PostResponseDataMessage]): PostResponseData = {
    val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponseData]
  }
  
  @scala.inline
  implicit class PostResponseDataMutableBuilder[Self <: PostResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: js.Array[PostResponseDataMessage]): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: PostResponseDataMessage*): Self = StObject.set(x, "Messages", js.Array(value :_*))
  }
}
