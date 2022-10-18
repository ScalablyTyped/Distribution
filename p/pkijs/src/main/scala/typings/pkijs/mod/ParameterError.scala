package typings.pkijs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterError
  extends StObject
     with Error {
  
  var field: String
  
  var target: js.UndefOr[String] = js.undefined
}
object ParameterError {
  
  inline def apply(field: String, message: String, name: String): ParameterError = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterError]
  }
  
  extension [Self <: ParameterError](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
