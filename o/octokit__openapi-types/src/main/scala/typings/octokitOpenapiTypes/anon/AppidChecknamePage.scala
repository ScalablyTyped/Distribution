package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppidChecknamePage extends StObject {
  
  /**
    * @description Filters check suites by GitHub App `id`.
    * @example 1
    */
  var app_id: js.UndefOr[Double] = js.undefined
  
  var check_name: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
}
object AppidChecknamePage {
  
  inline def apply(): AppidChecknamePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppidChecknamePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppidChecknamePage] (val x: Self) extends AnyVal {
    
    inline def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    inline def setCheck_name(value: String): Self = StObject.set(x, "check_name", value.asInstanceOf[js.Any])
    
    inline def setCheck_nameUndefined: Self = StObject.set(x, "check_name", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
