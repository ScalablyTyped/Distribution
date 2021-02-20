package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   comment_id :number,   reaction_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
@js.native
trait ReactionsDeleteForCommitCommentEndpoint extends StObject {
  
  var comment_id: Double = js.native
  
  var mediaType: `9` = js.native
  
  var owner: String = js.native
  
  var reaction_id: Double = js.native
  
  var repo: String = js.native
}
object ReactionsDeleteForCommitCommentEndpoint {
  
  @scala.inline
  def apply(comment_id: Double, mediaType: `9`, owner: String, reaction_id: Double, repo: String): ReactionsDeleteForCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteForCommitCommentEndpoint]
  }
  
  @scala.inline
  implicit class ReactionsDeleteForCommitCommentEndpointMutableBuilder[Self <: ReactionsDeleteForCommitCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment_id(value: Double): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `9`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaction_id(value: Double): Self = StObject.set(x, "reaction_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
