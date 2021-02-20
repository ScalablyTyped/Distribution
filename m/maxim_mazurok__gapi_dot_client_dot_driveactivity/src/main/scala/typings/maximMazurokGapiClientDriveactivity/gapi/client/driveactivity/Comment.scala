package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends StObject {
  
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
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignment(value: Assignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
    
    @scala.inline
    def setMentionedUsers(value: js.Array[User]): Self = StObject.set(x, "mentionedUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionedUsersUndefined: Self = StObject.set(x, "mentionedUsers", js.undefined)
    
    @scala.inline
    def setMentionedUsersVarargs(value: User*): Self = StObject.set(x, "mentionedUsers", js.Array(value :_*))
    
    @scala.inline
    def setPost(value: Post): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setSuggestion(value: Suggestion): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
  }
}
