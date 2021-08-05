package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignJwtResponse extends StObject {
  
  /** Deprecated. [Migrate to Service Account Credentials API](https://cloud.google.com/iam/help/credentials/migrate-api). The id of the key used to sign the JWT. */
  var keyId: js.UndefOr[String] = js.undefined
  
  /** Deprecated. [Migrate to Service Account Credentials API](https://cloud.google.com/iam/help/credentials/migrate-api). The signed JWT. */
  var signedJwt: js.UndefOr[String] = js.undefined
}
object SignJwtResponse {
  
  inline def apply(): SignJwtResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignJwtResponse]
  }
  
  extension [Self <: SignJwtResponse](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setSignedJwt(value: String): Self = StObject.set(x, "signedJwt", value.asInstanceOf[js.Any])
    
    inline def setSignedJwtUndefined: Self = StObject.set(x, "signedJwt", js.undefined)
  }
}
