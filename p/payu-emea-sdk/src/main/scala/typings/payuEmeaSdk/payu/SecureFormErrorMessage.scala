package typings.payuEmeaSdk.payu

import typings.payuEmeaSdk.anon.Error
import typings.payuEmeaSdk.payuEmeaSdkStrings.technical
import typings.payuEmeaSdk.payuEmeaSdkStrings.validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureFormErrorMessage extends StObject {
  
  var code: SecureFormErrorCode
  
  var message: String
  
  var parameters: js.UndefOr[Error] = js.undefined
  
  var source: js.UndefOr[secureFormType] = js.undefined
  
  var `type`: validation | technical
}
object SecureFormErrorMessage {
  
  inline def apply(code: SecureFormErrorCode, message: String, `type`: validation | technical): SecureFormErrorMessage = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureFormErrorMessage]
  }
  
  extension [Self <: SecureFormErrorMessage](x: Self) {
    
    inline def setCode(value: SecureFormErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Error): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setSource(value: secureFormType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: validation | technical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
