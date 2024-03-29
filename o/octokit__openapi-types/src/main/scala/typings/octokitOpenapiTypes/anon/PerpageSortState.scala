package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completeness
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.due_on
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerpageSortState extends StObject {
  
  /** @description The direction of the sort. Either `asc` or `desc`. */
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** @description What to sort results by. Either `due_on` or `completeness`. */
  var sort: js.UndefOr[due_on | completeness] = js.undefined
  
  /** @description The state of the milestone. Either `open`, `closed`, or `all`. */
  var state: js.UndefOr[open | closed | all] = js.undefined
}
object PerpageSortState {
  
  inline def apply(): PerpageSortState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerpageSortState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerpageSortState] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSort(value: due_on | completeness): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setState(value: open | closed | all): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
