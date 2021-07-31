package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignJwtRequest extends StObject {
  
  /**
    * Required. Deprecated. [Migrate to Service Account Credentials API](https://cloud.google.com/iam/help/credentials/migrate-api). The JWT payload to sign. Must be a serialized JSON
    * object that contains a JWT Claims Set. For example: `{"sub": "user@example.com", "iat": 313435}` If the JWT Claims Set contains an expiration time (`exp`) claim, it must be an
    * integer timestamp that is not in the past and no more than 1 hour in the future. If the JWT Claims Set does not contain an expiration time (`exp`) claim, this claim is added
    * automatically, with a timestamp that is 1 hour in the future.
    */
  var payload: js.UndefOr[String] = js.undefined
}
object SignJwtRequest {
  
  @scala.inline
  def apply(): SignJwtRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignJwtRequest]
  }
  
  @scala.inline
  implicit class SignJwtRequestMutableBuilder[Self <: SignJwtRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
