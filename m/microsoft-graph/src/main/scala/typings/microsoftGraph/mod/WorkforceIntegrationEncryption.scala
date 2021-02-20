package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkforceIntegrationEncryption extends StObject {
  
  // Possible values are: sharedSecret, unknownFutureValue.
  var protocol: js.UndefOr[NullableOption[WorkforceIntegrationEncryptionProtocol]] = js.native
  
  // Encryption shared secret.
  var secret: js.UndefOr[NullableOption[String]] = js.native
}
object WorkforceIntegrationEncryption {
  
  @scala.inline
  def apply(): WorkforceIntegrationEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkforceIntegrationEncryption]
  }
  
  @scala.inline
  implicit class WorkforceIntegrationEncryptionMutableBuilder[Self <: WorkforceIntegrationEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocol(value: NullableOption[WorkforceIntegrationEncryptionProtocol]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setSecret(value: NullableOption[String]): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretNull: Self = StObject.set(x, "secret", null)
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
