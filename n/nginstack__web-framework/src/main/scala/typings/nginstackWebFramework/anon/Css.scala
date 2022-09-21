package typings.nginstackWebFramework.anon

import typings.nginstackWebFramework.headerMod.Mail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Css extends StObject {
  
  var colspan: js.UndefOr[Double] = js.undefined
  
  var css: js.UndefOr[String] = js.undefined
  
  var enterpriseLogo: js.UndefOr[Double] = js.undefined
  
  var filters: js.UndefOr[js.Array[Group]] = js.undefined
  
  var layoutId: js.UndefOr[Double] = js.undefined
  
  var mailObject: js.UndefOr[Mail] = js.undefined
}
object Css {
  
  inline def apply(): Css = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Css]
  }
  
  extension [Self <: Css](x: Self) {
    
    inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
    
    inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setEnterpriseLogo(value: Double): Self = StObject.set(x, "enterpriseLogo", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseLogoUndefined: Self = StObject.set(x, "enterpriseLogo", js.undefined)
    
    inline def setFilters(value: js.Array[Group]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Group*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setLayoutId(value: Double): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
    
    inline def setLayoutIdUndefined: Self = StObject.set(x, "layoutId", js.undefined)
    
    inline def setMailObject(value: Mail): Self = StObject.set(x, "mailObject", value.asInstanceOf[js.Any])
    
    inline def setMailObjectUndefined: Self = StObject.set(x, "mailObject", js.undefined)
  }
}
