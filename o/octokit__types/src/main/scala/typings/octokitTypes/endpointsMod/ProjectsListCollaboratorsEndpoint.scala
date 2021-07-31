package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.direct
import typings.octokitTypes.octokitTypesStrings.inertia
import typings.octokitTypes.octokitTypesStrings.outside
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsListCollaboratorsEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  /**
    * Filters the collaborators by their affiliation. Can be one of:
    * \* `outside`: Outside collaborators of a project that are not a member of the project's organization.
    * \* `direct`: Collaborators with permissions to a project, regardless of organization membership status.
    * \* `all`: All collaborators the authenticated user can see.
    */
  var affiliation: js.UndefOr[outside | direct | all] = js.undefined
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  
  var project_id: Double
}
object ProjectsListCollaboratorsEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[inertia], project_id: Double): ProjectsListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListCollaboratorsEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsListCollaboratorsEndpointMutableBuilder[Self <: ProjectsListCollaboratorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffiliation(value: outside | direct | all): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
  }
}
