package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Comment object contains info about comments that are associated with
  * a photo, audio, or video on SkyDrive. The Live Connect REST API supports
  * reading Comment objects. Use the wl.photos scope to read Comment objects.
  * Use the wl.contacts_photos scope to read the Comment objects that are
  * associated with any albums, photos, and videos that other users have
  * shared with the user.
  */
@js.native
trait IComment extends js.Object {
  
  /**
    * The time, in ISO 8601 format, at which the comment was created.
    */
  var created_time: String = js.native
  
  /**
    * Info about the user who created the comment.
    */
  var from: IUserInfo = js.native
  
  /**
    * The Comment object's id.
    */
  var id: String = js.native
  
  /**
    * The text of the comment. The maximum length of a comment is 10,000
    * characters.
    */
  var message: String = js.native
}
object IComment {
  
  @scala.inline
  def apply(created_time: String, from: IUserInfo, id: String, message: String): IComment = {
    val __obj = js.Dynamic.literal(created_time = created_time.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComment]
  }
  
  @scala.inline
  implicit class ICommentOps[Self <: IComment] (val x: Self) extends AnyVal {
    
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
    def setCreated_time(value: String): Self = this.set("created_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: IUserInfo): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
