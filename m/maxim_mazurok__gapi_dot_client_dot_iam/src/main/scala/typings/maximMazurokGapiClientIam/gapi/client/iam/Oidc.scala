package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oidc extends StObject {
  
  /**
    * Acceptable values for the `aud` field (audience) in the OIDC token. Token exchange requests are rejected if the token audience does not match one of the configured values. Each
    * audience may be at most 256 characters. A maximum of 10 audiences may be configured. If this list is empty, the OIDC token audience must be equal to the full canonical resource name
    * of the WorkloadIdentityPoolProvider, with or without the HTTPS prefix. For example: ``` //iam.googleapis.com/projects//locations//workloadIdentityPools//providers/
    * https://iam.googleapis.com/projects//locations//workloadIdentityPools//providers/ ```
    */
  var allowedAudiences: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The OIDC issuer URL. Must be an HTTPS endpoint. */
  var issuerUri: js.UndefOr[String] = js.undefined
}
object Oidc {
  
  inline def apply(): Oidc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Oidc]
  }
  
  extension [Self <: Oidc](x: Self) {
    
    inline def setAllowedAudiences(value: js.Array[String]): Self = StObject.set(x, "allowedAudiences", value.asInstanceOf[js.Any])
    
    inline def setAllowedAudiencesUndefined: Self = StObject.set(x, "allowedAudiences", js.undefined)
    
    inline def setAllowedAudiencesVarargs(value: String*): Self = StObject.set(x, "allowedAudiences", js.Array(value*))
    
    inline def setIssuerUri(value: String): Self = StObject.set(x, "issuerUri", value.asInstanceOf[js.Any])
    
    inline def setIssuerUriUndefined: Self = StObject.set(x, "issuerUri", js.undefined)
  }
}
