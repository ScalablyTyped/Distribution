package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new comment.
  */
trait INewComment extends js.Object {
  /**
    * The text of the comment. The maximum length of a comment is 10,000
    * characters.
    */
  var message: java.lang.String
}

object INewComment {
  @scala.inline
  def apply(message: java.lang.String): INewComment = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[INewComment]
  }
}

