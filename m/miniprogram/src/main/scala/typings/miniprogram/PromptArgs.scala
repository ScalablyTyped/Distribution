package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptArgs
  extends StObject
     with AsyncCallback[PromptCallbackValue] {
  
  /**
    * Message alignment, supporting enumeration left/center/right, iOS center, android left.
    */
  var align: js.UndefOr[String] = js.undefined
  
  /**
    * OK button text, which is “Cancel” by default.
    */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Text of prompt box, which is “Enter contents here” by default.
    */
  var message: String
  
  /**
    * OK button text, which is “OK” by default.
    */
  var okButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Prompt text for the entry box.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * Title of prompt box.
    */
  var title: js.UndefOr[String] = js.undefined
}
object PromptArgs {
  
  inline def apply(message: String): PromptArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptArgs]
  }
  
  extension [Self <: PromptArgs](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOkButtonText(value: String): Self = StObject.set(x, "okButtonText", value.asInstanceOf[js.Any])
    
    inline def setOkButtonTextUndefined: Self = StObject.set(x, "okButtonText", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
