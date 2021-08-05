package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmArgs
  extends StObject
     with AsyncCallback[Unit] {
  
  /**
    * OK button text, which is “Cancel” by default.
    */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * OK button text, which is “OK” by default.
    */
  var confirmButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Content of the confirm box.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the confirm box.
    */
  var title: js.UndefOr[String] = js.undefined
}
object ConfirmArgs {
  
  inline def apply(): ConfirmArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmArgs]
  }
  
  extension [Self <: ConfirmArgs](x: Self) {
    
    inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    inline def setConfirmButtonText(value: String): Self = StObject.set(x, "confirmButtonText", value.asInstanceOf[js.Any])
    
    inline def setConfirmButtonTextUndefined: Self = StObject.set(x, "confirmButtonText", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
