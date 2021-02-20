package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignJwtResponse extends StObject {
  
  /** Deprecated. [Migrate to Service Account Credentials API](https://cloud.google.com/iam/help/credentials/migrate-api). The id of the key used to sign the JWT. */
  var keyId: js.UndefOr[String] = js.native
  
  /** Deprecated. [Migrate to Service Account Credentials API](https://cloud.google.com/iam/help/credentials/migrate-api). The signed JWT. */
  var signedJwt: js.UndefOr[String] = js.native
}
object SignJwtResponse {
  
  @scala.inline
  def apply(): SignJwtResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignJwtResponse]
  }
  
  @scala.inline
  implicit class SignJwtResponseMutableBuilder[Self <: SignJwtResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    @scala.inline
    def setSignedJwt(value: String): Self = StObject.set(x, "signedJwt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedJwtUndefined: Self = StObject.set(x, "signedJwt", js.undefined)
  }
}
