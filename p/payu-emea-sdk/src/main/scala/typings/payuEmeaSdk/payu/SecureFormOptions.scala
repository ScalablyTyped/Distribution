package typings.payuEmeaSdk.payu

import typings.payuEmeaSdk.payuEmeaSdkStrings.cs
import typings.payuEmeaSdk.payuEmeaSdkStrings.en
import typings.payuEmeaSdk.payuEmeaSdkStrings.pl
import typings.payuEmeaSdk.payuEmeaSdkStrings.sk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureFormOptions extends StObject {
  
  var cardIcon: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var lang: js.UndefOr[pl | en | cs | sk] = js.undefined
  
  var placeholder: js.UndefOr[PlaceHolderOptions] = js.undefined
  
  var style: js.UndefOr[StyleOptions] = js.undefined
}
object SecureFormOptions {
  
  inline def apply(): SecureFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureFormOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecureFormOptions] (val x: Self) extends AnyVal {
    
    inline def setCardIcon(value: Boolean): Self = StObject.set(x, "cardIcon", value.asInstanceOf[js.Any])
    
    inline def setCardIconUndefined: Self = StObject.set(x, "cardIcon", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLang(value: pl | en | cs | sk): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setPlaceholder(value: PlaceHolderOptions): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setStyle(value: StyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
