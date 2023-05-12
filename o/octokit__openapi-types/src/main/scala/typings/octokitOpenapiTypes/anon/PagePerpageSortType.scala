package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.full_name
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.member_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.owner_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pushed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagePerpageSortType extends StObject {
  
  /** @description The order to sort by. Default: `asc` when using `full_name`, otherwise `desc`. */
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** @description The property to sort the results by. */
  var sort: js.UndefOr[created_ | updated | pushed | full_name] = js.undefined
  
  /** @description Limit results to repositories of the specified type. */
  var `type`: js.UndefOr[all | owner_ | member_] = js.undefined
}
object PagePerpageSortType {
  
  inline def apply(): PagePerpageSortType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagePerpageSortType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PagePerpageSortType] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSort(value: created_ | updated | pushed | full_name): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setType(value: all | owner_ | member_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
