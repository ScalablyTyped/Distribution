package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.completed
import typings.octokitTypes.octokitTypesStrings.in_progress
import typings.octokitTypes.octokitTypesStrings.latest
import typings.octokitTypes.octokitTypesStrings.queued
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   check_suite_id :number,   check_name :string | undefined,   status :'queued' | 'in_progress' | 'completed' | undefined,   filter :'latest' | 'all' | undefined,   per_page :number | undefined,   page :number | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksListForSuiteEndpoint extends StObject {
  
  /**
    * Returns check runs with the specified `name`.
    */
  var check_name: js.UndefOr[String] = js.native
  
  var check_suite_id: Double = js.native
  
  /**
    * Filters check runs by their `completed_at` timestamp. Can be one of `latest` (returning the most recent check runs) or `all`.
    */
  var filter: js.UndefOr[latest | all] = js.native
  
  var mediaType: `2` = js.native
  
  var owner: String = js.native
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  
  var repo: String = js.native
  
  /**
    * Returns check runs with the specified `status`. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[queued | in_progress | completed] = js.native
}
object ChecksListForSuiteEndpoint {
  
  @scala.inline
  def apply(check_suite_id: Double, mediaType: `2`, owner: String, repo: String): ChecksListForSuiteEndpoint = {
    val __obj = js.Dynamic.literal(check_suite_id = check_suite_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForSuiteEndpoint]
  }
  
  @scala.inline
  implicit class ChecksListForSuiteEndpointMutableBuilder[Self <: ChecksListForSuiteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheck_name(value: String): Self = StObject.set(x, "check_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck_nameUndefined: Self = StObject.set(x, "check_name", js.undefined)
    
    @scala.inline
    def setCheck_suite_id(value: Double): Self = StObject.set(x, "check_suite_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: latest | all): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMediaType(value: `2`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setStatus(value: queued | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
