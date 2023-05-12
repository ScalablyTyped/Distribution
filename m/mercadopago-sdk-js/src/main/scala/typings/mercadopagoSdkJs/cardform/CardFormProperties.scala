package typings.mercadopagoSdkJs.cardform

import org.scalablytyped.runtime.StringDictionary
import typings.mercadopagoSdkJs.shared.CustomFonts
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardFormProperties extends StObject {
  
  var customFonts: js.UndefOr[js.Array[CustomFonts]] = js.undefined
  
  var element: js.UndefOr[HTMLElement | HTMLInputElement | HTMLSelectElement | HTMLFormElement] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var listeners: js.UndefOr[CardFormListeners] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[StringDictionary[String]] = js.undefined
}
object CardFormProperties {
  
  inline def apply(id: String): CardFormProperties = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFormProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardFormProperties] (val x: Self) extends AnyVal {
    
    inline def setCustomFonts(value: js.Array[CustomFonts]): Self = StObject.set(x, "customFonts", value.asInstanceOf[js.Any])
    
    inline def setCustomFontsUndefined: Self = StObject.set(x, "customFonts", js.undefined)
    
    inline def setCustomFontsVarargs(value: CustomFonts*): Self = StObject.set(x, "customFonts", js.Array(value*))
    
    inline def setElement(value: HTMLElement | HTMLInputElement | HTMLSelectElement | HTMLFormElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setListeners(value: CardFormListeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setListenersVarargs(value: CardFormListener*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setStyle(value: StringDictionary[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
