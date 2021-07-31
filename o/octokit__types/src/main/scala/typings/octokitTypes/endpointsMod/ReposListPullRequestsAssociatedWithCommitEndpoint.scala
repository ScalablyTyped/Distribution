package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.groot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposListPullRequestsAssociatedWithCommitEndpoint
  extends StObject
     with RequiredPreview[groot] {
  
  var commit_sha: String
  
  var owner: String
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  
  var repo: String
}
object ReposListPullRequestsAssociatedWithCommitEndpoint {
  
  @scala.inline
  def apply(commit_sha: String, mediaType: `0`[groot], owner: String, repo: String): ReposListPullRequestsAssociatedWithCommitEndpoint = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitEndpoint]
  }
  
  @scala.inline
  implicit class ReposListPullRequestsAssociatedWithCommitEndpointMutableBuilder[Self <: ReposListPullRequestsAssociatedWithCommitEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit_sha(value: String): Self = StObject.set(x, "commit_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
