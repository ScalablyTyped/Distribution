package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Friend object contains info about a user's friends. A Friend object
  * represents a user's contact whose is_friend value is set to true. The
  * Live Connect REST API supports reading Friend objects.
  */
@js.native
trait IFriend extends js.Object {
  /**
    * The friend's ID.
    */
  var id: String = js.native
  /**
    * The friend's full name, formatted for locale.
    */
  var name: String = js.native
}

object IFriend {
  @scala.inline
  def apply(id: String, name: String): IFriend = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFriend]
  }
  @scala.inline
  implicit class IFriendOps[Self <: IFriend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

