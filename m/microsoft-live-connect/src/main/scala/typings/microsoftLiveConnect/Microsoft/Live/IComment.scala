package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Comment object contains info about comments that are associated with
  * a photo, audio, or video on SkyDrive. The Live Connect REST API supports
  * reading Comment objects. Use the wl.photos scope to read Comment objects.
  * Use the wl.contacts_photos scope to read the Comment objects that are
  * associated with any albums, photos, and videos that other users have
  * shared with the user.
  */
trait IComment extends StObject {
  
  /**
    * The time, in ISO 8601 format, at which the comment was created.
    */
  var created_time: String
  
  /**
    * Info about the user who created the comment.
    */
  var from: IUserInfo
  
  /**
    * The Comment object's id.
    */
  var id: String
  
  /**
    * The text of the comment. The maximum length of a comment is 10,000
    * characters.
    */
  var message: String
}
object IComment {
  
  @scala.inline
  def apply(created_time: String, from: IUserInfo, id: String, message: String): IComment = {
    val __obj = js.Dynamic.literal(created_time = created_time.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComment]
  }
  
  @scala.inline
  implicit class ICommentMutableBuilder[Self <: IComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_time(value: String): Self = StObject.set(x, "created_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: IUserInfo): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
