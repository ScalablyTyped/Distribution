package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposMergeEndpoint extends StObject {
  
  /**
    * The name of the base branch that the head will be merged into.
    */
  var base: String = js.native
  
  /**
    * Commit message to use for the merge commit. If omitted, a default message will be used.
    */
  var commit_message: js.UndefOr[String] = js.native
  
  /**
    * The head to merge. This can be a branch name or a commit SHA1.
    */
  var head: String = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposMergeEndpoint {
  
  @scala.inline
  def apply(base: String, head: String, owner: String, repo: String): ReposMergeEndpoint = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposMergeEndpoint]
  }
  
  @scala.inline
  implicit class ReposMergeEndpointMutableBuilder[Self <: ReposMergeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit_message(value: String): Self = StObject.set(x, "commit_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit_messageUndefined: Self = StObject.set(x, "commit_message", js.undefined)
    
    @scala.inline
    def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
