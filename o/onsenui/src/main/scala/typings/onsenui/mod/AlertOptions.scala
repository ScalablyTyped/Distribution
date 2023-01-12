package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
  
  var buttonLabel: js.UndefOr[String] = js.undefined
  
  var buttonLabels: js.UndefOr[js.Array[String]] = js.undefined
  
  var callback: js.UndefOr[Any] = js.undefined
  
  var cancelable: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var messageHTML: js.UndefOr[String] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var primaryButtonIndex: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object AlertOptions {
  
  inline def apply(): AlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
    
    inline def setButtonLabelUndefined: Self = StObject.set(x, "buttonLabel", js.undefined)
    
    inline def setButtonLabels(value: js.Array[String]): Self = StObject.set(x, "buttonLabels", value.asInstanceOf[js.Any])
    
    inline def setButtonLabelsUndefined: Self = StObject.set(x, "buttonLabels", js.undefined)
    
    inline def setButtonLabelsVarargs(value: String*): Self = StObject.set(x, "buttonLabels", js.Array(value*))
    
    inline def setCallback(value: Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageHTML(value: String): Self = StObject.set(x, "messageHTML", value.asInstanceOf[js.Any])
    
    inline def setMessageHTMLUndefined: Self = StObject.set(x, "messageHTML", js.undefined)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setPrimaryButtonIndex(value: Double): Self = StObject.set(x, "primaryButtonIndex", value.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonIndexUndefined: Self = StObject.set(x, "primaryButtonIndex", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
