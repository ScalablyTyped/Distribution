package typings.natsHemera.mod

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncoderResult extends StObject {
  
  var error: Error
  
  var value: String | Buffer
}
object EncoderResult {
  
  inline def apply(error: Error, value: String | Buffer): EncoderResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncoderResult]
  }
  
  extension [Self <: EncoderResult](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
