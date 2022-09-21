package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetClipboardArgs
  extends StObject
     with AsyncVoidCallback {
  
  var text: String
}
object SetClipboardArgs {
  
  inline def apply(text: String): SetClipboardArgs = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetClipboardArgs]
  }
  
  extension [Self <: SetClipboardArgs](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
