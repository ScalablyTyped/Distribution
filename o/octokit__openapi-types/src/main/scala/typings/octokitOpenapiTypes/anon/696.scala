package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.newest
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.oldest
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.stargazers
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.watchers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `696` extends StObject {
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** @description The sort order. `stargazers` will sort by star count. */
  var sort: js.UndefOr[newest | oldest | stargazers | watchers] = js.undefined
}
object `696` {
  
  inline def apply(): `696` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`696`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `696`] (val x: Self) extends AnyVal {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSort(value: newest | oldest | stargazers | watchers): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
