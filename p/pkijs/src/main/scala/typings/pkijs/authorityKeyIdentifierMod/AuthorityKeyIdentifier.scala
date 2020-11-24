package typings.pkijs.authorityKeyIdentifierMod

import typings.asn1js.mod.Integer
import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorityKeyIdentifier extends js.Object {
  
  var authorityCertIssuer: js.Array[typings.pkijs.accessDescriptionMod.default] = js.native
  
  var authorityCertSerialNumber: Integer = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var keyIdentifier: OctetString = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object AuthorityKeyIdentifier {
  
  @scala.inline
  def apply(
    authorityCertIssuer: js.Array[typings.pkijs.accessDescriptionMod.default],
    authorityCertSerialNumber: Integer,
    fromSchema: js.Any => Unit,
    keyIdentifier: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): AuthorityKeyIdentifier = {
    val __obj = js.Dynamic.literal(authorityCertIssuer = authorityCertIssuer.asInstanceOf[js.Any], authorityCertSerialNumber = authorityCertSerialNumber.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyIdentifier = keyIdentifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[AuthorityKeyIdentifier]
  }
  
  @scala.inline
  implicit class AuthorityKeyIdentifierOps[Self <: AuthorityKeyIdentifier] (val x: Self) extends AnyVal {
    
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
    def setAuthorityCertIssuerVarargs(value: typings.pkijs.accessDescriptionMod.default*): Self = this.set("authorityCertIssuer", js.Array(value :_*))
    
    @scala.inline
    def setAuthorityCertIssuer(value: js.Array[typings.pkijs.accessDescriptionMod.default]): Self = this.set("authorityCertIssuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorityCertSerialNumber(value: Integer): Self = this.set("authorityCertSerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyIdentifier(value: OctetString): Self = this.set("keyIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}
