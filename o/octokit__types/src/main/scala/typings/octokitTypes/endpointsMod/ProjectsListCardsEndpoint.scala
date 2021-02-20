package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`7`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.archived
import typings.octokitTypes.octokitTypesStrings.not_archived
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  column_id :number,   archived_state :'all' | 'archived' | 'not_archived' | undefined,   per_page :number | undefined,   page :number | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsListCardsEndpoint extends StObject {
  
  /**
    * Filters the project cards that are returned by the card's state. Can be one of `all`,`archived`, or `not_archived`.
    */
  var archived_state: js.UndefOr[all | archived | not_archived] = js.native
  
  var column_id: Double = js.native
  
  var mediaType: `7` = js.native
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
}
object ProjectsListCardsEndpoint {
  
  @scala.inline
  def apply(column_id: Double, mediaType: `7`): ProjectsListCardsEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListCardsEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsListCardsEndpointMutableBuilder[Self <: ProjectsListCardsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchived_state(value: all | archived | not_archived): Self = StObject.set(x, "archived_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchived_stateUndefined: Self = StObject.set(x, "archived_state", js.undefined)
    
    @scala.inline
    def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `7`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
