package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslCertsCreateEphemeralRequest extends StObject {
  
  /** PEM encoded public key to include in the signed certificate. */
  var public_key: js.UndefOr[String] = js.undefined
}
object SslCertsCreateEphemeralRequest {
  
  @scala.inline
  def apply(): SslCertsCreateEphemeralRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertsCreateEphemeralRequest]
  }
  
  @scala.inline
  implicit class SslCertsCreateEphemeralRequestMutableBuilder[Self <: SslCertsCreateEphemeralRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
  }
}
