package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.antiope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksListAnnotationsEndpoint
  extends StObject
     with RequiredPreview[antiope] {
  
  var check_run_id: Double
  
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
object ChecksListAnnotationsEndpoint {
  
  @scala.inline
  def apply(check_run_id: Double, mediaType: `0`[antiope], owner: String, repo: String): ChecksListAnnotationsEndpoint = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListAnnotationsEndpoint]
  }
  
  @scala.inline
  implicit class ChecksListAnnotationsEndpointMutableBuilder[Self <: ChecksListAnnotationsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheck_run_id(value: Double): Self = StObject.set(x, "check_run_id", value.asInstanceOf[js.Any])
    
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
