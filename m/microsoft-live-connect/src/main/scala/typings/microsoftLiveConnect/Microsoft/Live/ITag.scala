package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Tag object contains info about tags that are associated with a photo
  * or a video on SkyDrive. The Live Connect REST API supports reading Tag
  * objects. Use the wl.photos, and wl.skydrive scopes to read Tag objects.
  * Use the wl.contacts_photos and wl.contacts_skydrive scopes to read the
  * Tag objects that are associated with any photos that other users have
  * shared with the user.
  */
@js.native
trait ITag extends js.Object {
  
  /**
    * The time, in ISO 8601 format, at which the tag was created.
    */
  var created_time: String = js.native
  
  /**
    * The Tag object's ID.
    */
  var id: String = js.native
  
  /**
    * The user object for the tagged person.
    */
  var user: IUserInfo = js.native
  
  /**
    * The center of the tag's horizontal position, measured as a
    * floating-point percentage from 0 to 100, from the left edge of the
    * photo. This value is not returned for Video objects.
    */
  var x: Double = js.native
  
  /**
    * The center of the tag's vertical position, measured as a
    * floating-point percentage from 0 to 100, from the top edge of the
    * photo. This value is not returned for Video objects.
    */
  var y: Double = js.native
}
object ITag {
  
  @scala.inline
  def apply(created_time: String, id: String, user: IUserInfo, x: Double, y: Double): ITag = {
    val __obj = js.Dynamic.literal(created_time = created_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITag]
  }
  
  @scala.inline
  implicit class ITagOps[Self <: ITag] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: IUserInfo): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
