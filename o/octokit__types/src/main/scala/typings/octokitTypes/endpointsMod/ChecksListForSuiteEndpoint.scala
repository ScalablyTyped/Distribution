package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.antiope
import typings.octokitTypes.octokitTypesStrings.completed
import typings.octokitTypes.octokitTypesStrings.in_progress
import typings.octokitTypes.octokitTypesStrings.latest
import typings.octokitTypes.octokitTypesStrings.queued
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksListForSuiteEndpoint
  extends StObject
     with RequiredPreview[antiope] {
  
  /**
    * Returns check runs with the specified `name`.
    */
  var check_name: js.UndefOr[String] = js.undefined
  
  var check_suite_id: Double
  
  /**
    * Filters check runs by their `completed_at` timestamp. Can be one of `latest` (returning the most recent check runs) or `all`.
    */
  var filter: js.UndefOr[latest | all] = js.undefined
  
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
  
  /**
    * Returns check runs with the specified `status`. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[queued | in_progress | completed] = js.undefined
}
object ChecksListForSuiteEndpoint {
  
  @scala.inline
  def apply(check_suite_id: Double, mediaType: `0`[antiope], owner: String, repo: String): ChecksListForSuiteEndpoint = {
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
