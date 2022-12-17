package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.archived_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.not_archived
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchivedstatePage extends StObject {
  
  /** Filters the project cards that are returned by the card's state. */
  var archived_state: js.UndefOr[all | archived_ | not_archived] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
}
object ArchivedstatePage {
  
  inline def apply(): ArchivedstatePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchivedstatePage]
  }
  
  extension [Self <: ArchivedstatePage](x: Self) {
    
    inline def setArchived_state(value: all | archived_ | not_archived): Self = StObject.set(x, "archived_state", value.asInstanceOf[js.Any])
    
    inline def setArchived_stateUndefined: Self = StObject.set(x, "archived_state", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
