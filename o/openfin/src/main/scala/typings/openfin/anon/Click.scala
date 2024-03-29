package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Click extends StObject {
  
  var click: String
  
  var close: String
  
  var error: String
  
  var message: String
  
  var show: String
}
object Click {
  
  inline def apply(click: String, close: String, error: String, message: String, show: String): Click = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Click]
  }
  
  extension [Self <: Click](x: Self) {
    
    inline def setClick(value: String): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
