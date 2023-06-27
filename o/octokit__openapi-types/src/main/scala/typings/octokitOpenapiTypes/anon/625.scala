package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `625` extends StObject {
  
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
}
object `625` {
  
  inline def apply(): `625` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`625`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `625`] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
