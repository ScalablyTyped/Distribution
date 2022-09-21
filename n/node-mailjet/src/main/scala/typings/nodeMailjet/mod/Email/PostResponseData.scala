package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponseData extends StObject {
  
  val Messages: js.Array[PostResponseDataMessage]
}
object PostResponseData {
  
  inline def apply(Messages: js.Array[PostResponseDataMessage]): PostResponseData = {
    val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponseData]
  }
  
  extension [Self <: PostResponseData](x: Self) {
    
    inline def setMessages(value: js.Array[PostResponseDataMessage]): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: PostResponseDataMessage*): Self = StObject.set(x, "Messages", js.Array(value*))
  }
}
