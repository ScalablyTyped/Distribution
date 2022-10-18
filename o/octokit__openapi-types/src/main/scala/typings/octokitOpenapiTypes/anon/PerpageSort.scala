package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.newest
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.oldest
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.stargazers
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.watchers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerpageSort extends StObject {
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** The sort order. `stargazers` will sort by star count. */
  var sort: js.UndefOr[newest | oldest | stargazers | watchers] = js.undefined
}
object PerpageSort {
  
  inline def apply(): PerpageSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerpageSort]
  }
  
  extension [Self <: PerpageSort](x: Self) {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSort(value: newest | oldest | stargazers | watchers): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
