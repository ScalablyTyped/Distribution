package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllBefore extends StObject {
  
  var all: js.UndefOr[Boolean] = js.undefined
  
  var before: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var participating: js.UndefOr[Boolean] = js.undefined
  
  /** @description The number of results per page (max 50). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  var since: js.UndefOr[String] = js.undefined
}
object AllBefore {
  
  inline def apply(): AllBefore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllBefore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllBefore] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setParticipating(value: Boolean): Self = StObject.set(x, "participating", value.asInstanceOf[js.Any])
    
    inline def setParticipatingUndefined: Self = StObject.set(x, "participating", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
