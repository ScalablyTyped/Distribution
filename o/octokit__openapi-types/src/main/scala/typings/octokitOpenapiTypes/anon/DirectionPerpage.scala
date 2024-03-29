package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.draft
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.published
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.triage
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionPerpage extends StObject {
  
  var after: js.UndefOr[String] = js.undefined
  
  var before: js.UndefOr[String] = js.undefined
  
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  /** @description Number of advisories to return per page. */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** @description The property to sort the results by. */
  var sort: js.UndefOr[created_ | updated | published] = js.undefined
  
  /** @description Filter by state of the repository advisories. Only advisories of this state will be returned. */
  var state: js.UndefOr[triage | draft | published | closed] = js.undefined
}
object DirectionPerpage {
  
  inline def apply(): DirectionPerpage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionPerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionPerpage] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSort(value: created_ | updated | published): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setState(value: triage | draft | published | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
