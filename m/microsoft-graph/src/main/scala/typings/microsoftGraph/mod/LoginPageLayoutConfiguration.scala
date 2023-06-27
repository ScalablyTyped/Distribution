package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginPageLayoutConfiguration extends StObject {
  
  var isFooterShown: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isHeaderShown: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var layoutTemplateType: js.UndefOr[NullableOption[LayoutTemplateType]] = js.undefined
}
object LoginPageLayoutConfiguration {
  
  inline def apply(): LoginPageLayoutConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginPageLayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginPageLayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setIsFooterShown(value: NullableOption[Boolean]): Self = StObject.set(x, "isFooterShown", value.asInstanceOf[js.Any])
    
    inline def setIsFooterShownNull: Self = StObject.set(x, "isFooterShown", null)
    
    inline def setIsFooterShownUndefined: Self = StObject.set(x, "isFooterShown", js.undefined)
    
    inline def setIsHeaderShown(value: NullableOption[Boolean]): Self = StObject.set(x, "isHeaderShown", value.asInstanceOf[js.Any])
    
    inline def setIsHeaderShownNull: Self = StObject.set(x, "isHeaderShown", null)
    
    inline def setIsHeaderShownUndefined: Self = StObject.set(x, "isHeaderShown", js.undefined)
    
    inline def setLayoutTemplateType(value: NullableOption[LayoutTemplateType]): Self = StObject.set(x, "layoutTemplateType", value.asInstanceOf[js.Any])
    
    inline def setLayoutTemplateTypeNull: Self = StObject.set(x, "layoutTemplateType", null)
    
    inline def setLayoutTemplateTypeUndefined: Self = StObject.set(x, "layoutTemplateType", js.undefined)
  }
}
