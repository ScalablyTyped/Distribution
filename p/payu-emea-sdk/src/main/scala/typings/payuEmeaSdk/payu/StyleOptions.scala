package typings.payuEmeaSdk.payu

import typings.payuEmeaSdk.anon.FontColor
import typings.payuEmeaSdk.anon.FontWeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleOptions extends StObject {
  
  var basic: js.UndefOr[FontColor] = js.undefined
  
  var disabled: js.UndefOr[FontWeight] = js.undefined
  
  var focus: js.UndefOr[FontWeight] = js.undefined
  
  var invalid: js.UndefOr[FontWeight] = js.undefined
  
  var placeholder: js.UndefOr[FontWeight] = js.undefined
}
object StyleOptions {
  
  inline def apply(): StyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOptions]
  }
  
  extension [Self <: StyleOptions](x: Self) {
    
    inline def setBasic(value: FontColor): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
    
    inline def setDisabled(value: FontWeight): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFocus(value: FontWeight): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setInvalid(value: FontWeight): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setPlaceholder(value: FontWeight): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
