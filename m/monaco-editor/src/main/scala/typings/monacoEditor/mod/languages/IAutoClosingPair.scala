package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAutoClosingPair extends StObject {
  
  var close: String
  
  var open: String
}
object IAutoClosingPair {
  
  inline def apply(close: String, open: String): IAutoClosingPair = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutoClosingPair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAutoClosingPair] (val x: Self) extends AnyVal {
    
    inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
