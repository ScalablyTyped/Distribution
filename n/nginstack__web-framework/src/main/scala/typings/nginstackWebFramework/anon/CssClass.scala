package typings.nginstackWebFramework.anon

import typings.nginstackWebFramework.libHtmlFormatImageTagMod.Mail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssClass extends StObject {
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var mailObject: js.UndefOr[Mail] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
}
object CssClass {
  
  inline def apply(): CssClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssClass]
  }
  
  extension [Self <: CssClass](x: Self) {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMailObject(value: Mail): Self = StObject.set(x, "mailObject", value.asInstanceOf[js.Any])
    
    inline def setMailObjectUndefined: Self = StObject.set(x, "mailObject", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
