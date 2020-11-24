package typings.nodeForge.anon

import typings.nodeForge.mod.pki.Certificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticatedAttributes extends js.Object {
  
  var authenticatedAttributes: js.Array[Type] = js.native
  
  var certificate: Certificate | String = js.native
  
  var digestAlgorithm: String = js.native
  
  var key: String = js.native
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
  implicit class AuthenticatedAttributesOps[Self <: AuthenticatedAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticatedAttributesVarargs(value: Type*): Self = this.set("authenticatedAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAuthenticatedAttributes(value: js.Array[Type]): Self = this.set("authenticatedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificate(value: Certificate | String): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestAlgorithm(value: String): Self = this.set("digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
}
