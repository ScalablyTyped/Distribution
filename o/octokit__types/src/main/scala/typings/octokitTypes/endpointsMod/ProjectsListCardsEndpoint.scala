package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.archived
import typings.octokitTypes.octokitTypesStrings.inertia
import typings.octokitTypes.octokitTypesStrings.not_archived
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsListCardsEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  /**
    * Filters the project cards that are returned by the card's state. Can be one of `all`,`archived`, or `not_archived`.
    */
  var archived_state: js.UndefOr[all | archived | not_archived] = js.undefined
  
  var column_id: Double
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
}
object ProjectsListCardsEndpoint {
  
  inline def apply(column_id: Double, mediaType: `0`[inertia]): ProjectsListCardsEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListCardsEndpoint]
  }
  
  extension [Self <: ProjectsListCardsEndpoint](x: Self) {
    
    inline def setArchived_state(value: all | archived | not_archived): Self = StObject.set(x, "archived_state", value.asInstanceOf[js.Any])
    
    inline def setArchived_stateUndefined: Self = StObject.set(x, "archived_state", js.undefined)
    
    inline def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
