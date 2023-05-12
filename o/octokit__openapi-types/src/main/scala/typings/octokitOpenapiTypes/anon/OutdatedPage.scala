package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutdatedPage extends StObject {
  
  var outdated: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  var since: js.UndefOr[String] = js.undefined
}
object OutdatedPage {
  
  inline def apply(): OutdatedPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutdatedPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutdatedPage] (val x: Self) extends AnyVal {
    
    inline def setOutdated(value: String): Self = StObject.set(x, "outdated", value.asInstanceOf[js.Any])
    
    inline def setOutdatedUndefined: Self = StObject.set(x, "outdated", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
