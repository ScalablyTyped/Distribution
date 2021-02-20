package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.merge
import typings.octokitTypes.octokitTypesStrings.rebase
import typings.octokitTypes.octokitTypesStrings.squash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullsMergeEndpoint extends StObject {
  
  /**
    * Extra detail to append to automatic commit message.
    */
  var commit_message: js.UndefOr[String] = js.native
  
  /**
    * Title for the automatic commit message.
    */
  var commit_title: js.UndefOr[String] = js.native
  
  /**
    * Merge method to use. Possible values are `merge`, `squash` or `rebase`. Default is `merge`.
    */
  var merge_method: js.UndefOr[merge | squash | rebase] = js.native
  
  var owner: String = js.native
  
  var pull_number: Double = js.native
  
  var repo: String = js.native
  
  /**
    * SHA that pull request head must match to allow merge.
    */
  var sha: js.UndefOr[String] = js.native
}
object PullsMergeEndpoint {
  
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String): PullsMergeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsMergeEndpoint]
  }
  
  @scala.inline
  implicit class PullsMergeEndpointMutableBuilder[Self <: PullsMergeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit_message(value: String): Self = StObject.set(x, "commit_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit_messageUndefined: Self = StObject.set(x, "commit_message", js.undefined)
    
    @scala.inline
    def setCommit_title(value: String): Self = StObject.set(x, "commit_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit_titleUndefined: Self = StObject.set(x, "commit_title", js.undefined)
    
    @scala.inline
    def setMerge_method(value: merge | squash | rebase): Self = StObject.set(x, "merge_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge_methodUndefined: Self = StObject.set(x, "merge_method", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_number(value: Double): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
  }
}
