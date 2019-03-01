package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Comment object contains info about comments that are associated with
  * a photo, audio, or video on SkyDrive. The Live Connect REST API supports
  * reading Comment objects. Use the wl.photos scope to read Comment objects.
  * Use the wl.contacts_photos scope to read the Comment objects that are
  * associated with any albums, photos, and videos that other users have
  * shared with the user.
  */
trait IComment extends js.Object {
  /**
    * The time, in ISO 8601 format, at which the comment was created.
    */
  var created_time: java.lang.String
  /**
    * Info about the user who created the comment.
    */
  var from: IUserInfo
  /**
    * The Comment object's id.
    */
  var id: java.lang.String
  /**
    * The text of the comment. The maximum length of a comment is 10,000
    * characters.
    */
  var message: java.lang.String
}

object IComment {
  @scala.inline
  def apply(created_time: java.lang.String, from: IUserInfo, id: java.lang.String, message: java.lang.String): IComment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("created_time")(created_time)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[IComment]
  }
}

