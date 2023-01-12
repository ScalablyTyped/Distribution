package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkforceIntegrationEncryption extends StObject {
  
  // Possible values are: sharedSecret, unknownFutureValue.
  var protocol: js.UndefOr[NullableOption[WorkforceIntegrationEncryptionProtocol]] = js.undefined
  
  // Encryption shared secret.
  var secret: js.UndefOr[NullableOption[String]] = js.undefined
}
object WorkforceIntegrationEncryption {
  
  inline def apply(): WorkforceIntegrationEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkforceIntegrationEncryption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkforceIntegrationEncryption] (val x: Self) extends AnyVal {
    
    inline def setProtocol(value: NullableOption[WorkforceIntegrationEncryptionProtocol]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSecret(value: NullableOption[String]): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretNull: Self = StObject.set(x, "secret", null)
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
