package typings.natsHemera.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecoderResult extends StObject {
  
  var error: Error
  
  var value: js.Object
}
object DecoderResult {
  
  inline def apply(error: Error, value: js.Object): DecoderResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoderResult]
  }
  
  extension [Self <: DecoderResult](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
