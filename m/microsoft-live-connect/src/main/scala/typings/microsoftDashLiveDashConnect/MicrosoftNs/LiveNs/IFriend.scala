package typings.microsoftDashLiveDashConnect.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Friend object contains info about a user's friends. A Friend object
  * represents a user's contact whose is_friend value is set to true. The
  * Live Connect REST API supports reading Friend objects.
  */
trait IFriend extends js.Object {
  /**
    * The friend's ID.
    */
  var id: String
  /**
    * The friend's full name, formatted for locale.
    */
  var name: String
}

object IFriend {
  @scala.inline
  def apply(id: String, name: String): IFriend = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[IFriend]
  }
}

