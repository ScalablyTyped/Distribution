package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerpageRepositoryid extends StObject {
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** ID of the Repository to filter on */
  var repository_id: js.UndefOr[Double] = js.undefined
}
object PerpageRepositoryid {
  
  inline def apply(): PerpageRepositoryid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerpageRepositoryid]
  }
  
  extension [Self <: PerpageRepositoryid](x: Self) {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setRepository_idUndefined: Self = StObject.set(x, "repository_id", js.undefined)
  }
}
