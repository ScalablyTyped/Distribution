package typings.pkijs.signerInfoMod

import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignerInfo extends js.Object {
  
  var digestAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var sid: js.Any = js.native
  
  var signature: OctetString = js.native
  
  var signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  
  var signedAttrs: js.UndefOr[typings.pkijs.signedAndUnsignedAttributesMod.default] = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
  
  var unsignedAttrs: js.UndefOr[typings.pkijs.signedAndUnsignedAttributesMod.default] = js.native
  
  var version: Double = js.native
}
object SignerInfo {
  
  @scala.inline
  def apply(
    digestAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    fromSchema: js.Any => Unit,
    sid: js.Any,
    signature: OctetString,
    signatureAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): SignerInfo = {
    val __obj = js.Dynamic.literal(digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), sid = sid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerInfo]
  }
  
  @scala.inline
  implicit class SignerInfoOps[Self <: SignerInfo] (val x: Self) extends AnyVal {
    
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
    def setDigestAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSid(value: js.Any): Self = this.set("sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: OctetString): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedAttrs(value: typings.pkijs.signedAndUnsignedAttributesMod.default): Self = this.set("signedAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedAttrs: Self = this.set("signedAttrs", js.undefined)
    
    @scala.inline
    def setUnsignedAttrs(value: typings.pkijs.signedAndUnsignedAttributesMod.default): Self = this.set("unsignedAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsignedAttrs: Self = this.set("unsignedAttrs", js.undefined)
  }
}
