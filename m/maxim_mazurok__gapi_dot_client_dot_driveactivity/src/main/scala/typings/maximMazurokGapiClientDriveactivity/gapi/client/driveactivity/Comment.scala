package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends js.Object {
  
  /** A change on an assignment. */
  var assignment: js.UndefOr[Assignment] = js.native
  
  /** Users who are mentioned in this comment. */
  var mentionedUsers: js.UndefOr[js.Array[User]] = js.native
  
  /** A change on a regular posted comment. */
  var post: js.UndefOr[Post] = js.native
  
  /** A change on a suggestion. */
  var suggestion: js.UndefOr[Suggestion] = js.native
}
object Comment {
  
  @scala.inline
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    
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
    def setAssignment(value: Assignment): Self = this.set("assignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignment: Self = this.set("assignment", js.undefined)
    
    @scala.inline
    def setMentionedUsersVarargs(value: User*): Self = this.set("mentionedUsers", js.Array(value :_*))
    
    @scala.inline
    def setMentionedUsers(value: js.Array[User]): Self = this.set("mentionedUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMentionedUsers: Self = this.set("mentionedUsers", js.undefined)
    
    @scala.inline
    def setPost(value: Post): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setSuggestion(value: Suggestion): Self = this.set("suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestion: Self = this.set("suggestion", js.undefined)
  }
}
