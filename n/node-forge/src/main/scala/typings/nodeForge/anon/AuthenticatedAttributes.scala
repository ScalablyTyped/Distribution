package typings.nodeForge.anon

import typings.nodeForge.mod.pki.Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticatedAttributes extends StObject {
  
  var authenticatedAttributes: js.UndefOr[js.Array[Type]] = js.undefined
  
  var certificate: Certificate | String
  
  var digestAlgorithm: String
  
  var key: typings.nodeForge.mod.pki.rsa.PrivateKey | String
}
object AuthenticatedAttributes {
  
  inline def apply(
    certificate: Certificate | String,
    digestAlgorithm: String,
    key: typings.nodeForge.mod.pki.rsa.PrivateKey | String
  ): AuthenticatedAttributes = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatedAttributes]
  }
  
  extension [Self <: AuthenticatedAttributes](x: Self) {
    
    inline def setAuthenticatedAttributes(value: js.Array[Type]): Self = StObject.set(x, "authenticatedAttributes", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatedAttributesUndefined: Self = StObject.set(x, "authenticatedAttributes", js.undefined)
    
    inline def setAuthenticatedAttributesVarargs(value: Type*): Self = StObject.set(x, "authenticatedAttributes", js.Array(value*))
    
    inline def setCertificate(value: Certificate | String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithm(value: String): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKey(value: typings.nodeForge.mod.pki.rsa.PrivateKey | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
