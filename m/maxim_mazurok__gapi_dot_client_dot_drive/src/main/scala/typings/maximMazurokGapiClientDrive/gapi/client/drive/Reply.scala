package typings.maximMazurokGapiClientDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reply extends js.Object {
  
  /**
    * The action the reply performed to the parent comment. Valid values are:
    * - resolve
    * - reopen
    */
  var action: js.UndefOr[String] = js.native
  
  /** The author of the reply. The author's email address and permission ID will not be populated. */
  var author: js.UndefOr[User] = js.native
  
  /** The plain text content of the reply. This field is used for setting the content, while htmlContent should be displayed. This is required on creates if no action is specified. */
  var content: js.UndefOr[String] = js.native
  
  /** The time at which the reply was created (RFC 3339 date-time). */
  var createdTime: js.UndefOr[String] = js.native
  
  /** Whether the reply has been deleted. A deleted reply has no content. */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /** The content of the reply with HTML formatting. */
  var htmlContent: js.UndefOr[String] = js.native
  
  /** The ID of the reply. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#reply". */
  var kind: js.UndefOr[String] = js.native
  
  /** The last time the reply was modified (RFC 3339 date-time). */
  var modifiedTime: js.UndefOr[String] = js.native
}
object Reply {
  
  @scala.inline
  def apply(): Reply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reply]
  }
  
  @scala.inline
  implicit class ReplyOps[Self <: Reply] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAuthor(value: User): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: String): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setHtmlContent(value: String): Self = this.set("htmlContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlContent: Self = this.set("htmlContent", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setModifiedTime(value: String): Self = this.set("modifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedTime: Self = this.set("modifiedTime", js.undefined)
  }
}
