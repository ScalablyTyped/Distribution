package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.inertia
import typings.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsListForUserEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the state of the projects to return. Can be either `open`, `closed`, or `all`.
    */
  var state: js.UndefOr[open | closed | all] = js.undefined
  
  var username: String
}
object ProjectsListForUserEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[inertia], username: String): ProjectsListForUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListForUserEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsListForUserEndpointMutableBuilder[Self <: ProjectsListForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setState(value: open | closed | all): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
