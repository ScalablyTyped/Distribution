package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.active
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deleted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `613` extends StObject {
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** @description The state of the package, either active or deleted. */
  var state: js.UndefOr[active | deleted_] = js.undefined
}
object `613` {
  
  inline def apply(): `613` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`613`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `613`] (val x: Self) extends AnyVal {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setState(value: active | deleted_): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
