package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a new comment.
  */
trait INewComment extends StObject {
  
  /**
    * The text of the comment. The maximum length of a comment is 10,000
    * characters.
    */
  var message: String
}
object INewComment {
  
  inline def apply(message: String): INewComment = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewComment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INewComment] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
