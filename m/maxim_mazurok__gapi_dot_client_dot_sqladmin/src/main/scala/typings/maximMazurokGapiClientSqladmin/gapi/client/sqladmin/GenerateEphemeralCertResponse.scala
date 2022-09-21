package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateEphemeralCertResponse extends StObject {
  
  /** Generated cert */
  var ephemeralCert: js.UndefOr[SslCert] = js.undefined
}
object GenerateEphemeralCertResponse {
  
  inline def apply(): GenerateEphemeralCertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateEphemeralCertResponse]
  }
  
  extension [Self <: GenerateEphemeralCertResponse](x: Self) {
    
    inline def setEphemeralCert(value: SslCert): Self = StObject.set(x, "ephemeralCert", value.asInstanceOf[js.Any])
    
    inline def setEphemeralCertUndefined: Self = StObject.set(x, "ephemeralCert", js.undefined)
  }
}
