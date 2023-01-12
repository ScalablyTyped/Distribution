package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  /** A change on an assignment. */
  var assignment: js.UndefOr[Assignment] = js.undefined
  
  /** Users who are mentioned in this comment. */
  var mentionedUsers: js.UndefOr[js.Array[User]] = js.undefined
  
  /** A change on a regular posted comment. */
  var post: js.UndefOr[Post] = js.undefined
  
  /** A change on a suggestion. */
  var suggestion: js.UndefOr[Suggestion] = js.undefined
}
object Comment {
  
  inline def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    inline def setAssignment(value: Assignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    inline def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
    
    inline def setMentionedUsers(value: js.Array[User]): Self = StObject.set(x, "mentionedUsers", value.asInstanceOf[js.Any])
    
    inline def setMentionedUsersUndefined: Self = StObject.set(x, "mentionedUsers", js.undefined)
    
    inline def setMentionedUsersVarargs(value: User*): Self = StObject.set(x, "mentionedUsers", js.Array(value*))
    
    inline def setPost(value: Post): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setSuggestion(value: Suggestion): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
  }
}
