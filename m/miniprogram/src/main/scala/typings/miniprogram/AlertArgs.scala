package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertArgs
  extends StObject
     with AsyncVoidCallback {
  
  /**
    * Button text, which is OK by default.
    */
  var buttonText: js.UndefOr[String] = js.undefined
  
  /**
    * Contents of the alert box.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the alert box.
    */
  var title: js.UndefOr[String] = js.undefined
}
object AlertArgs {
  
  inline def apply(): AlertArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertArgs]
  }
  
  extension [Self <: AlertArgs](x: Self) {
    
    inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
