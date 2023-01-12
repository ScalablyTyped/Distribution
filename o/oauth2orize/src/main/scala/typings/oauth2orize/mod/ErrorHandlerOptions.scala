package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorHandlerOptions extends StObject {
  
  var mode: js.UndefOr[String] = js.undefined
}
object ErrorHandlerOptions {
  
  inline def apply(): ErrorHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorHandlerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorHandlerOptions] (val x: Self) extends AnyVal {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
