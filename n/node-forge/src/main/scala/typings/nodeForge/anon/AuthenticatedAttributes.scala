package typings.nodeForge.anon

import typings.nodeForge.mod.pki.Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticatedAttributes extends StObject {
  
  var authenticatedAttributes: js.Array[Type]
  
  var certificate: Certificate | String
  
  var digestAlgorithm: String
  
  var key: String
}
object AuthenticatedAttributes {
  
  @scala.inline
  def apply(
    authenticatedAttributes: js.Array[Type],
    certificate: Certificate | String,
    digestAlgorithm: String,
    key: String
  ): AuthenticatedAttributes = {
    val __obj = js.Dynamic.literal(authenticatedAttributes = authenticatedAttributes.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatedAttributes]
  }
  
  @scala.inline
  implicit class AuthenticatedAttributesMutableBuilder[Self <: AuthenticatedAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticatedAttributes(value: js.Array[Type]): Self = StObject.set(x, "authenticatedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticatedAttributesVarargs(value: Type*): Self = StObject.set(x, "authenticatedAttributes", js.Array(value :_*))
    
    @scala.inline
    def setCertificate(value: Certificate | String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestAlgorithm(value: String): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
