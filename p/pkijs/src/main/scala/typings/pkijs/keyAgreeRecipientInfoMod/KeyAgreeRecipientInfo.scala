package typings.pkijs.keyAgreeRecipientInfoMod

import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyAgreeRecipientInfo extends js.Object {
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  
  var originator: typings.pkijs.originatorIdentifierOrKeyMod.default = js.native
  
  var recipientCertificate: typings.pkijs.certificateMod.default = js.native
  
  var recipientEncryptedKeys: typings.pkijs.recipientEncryptedKeysMod.default = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
  
  var ukm: js.UndefOr[OctetString] = js.native
  
  var version: Double = js.native
}
object KeyAgreeRecipientInfo {
  
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    originator: typings.pkijs.originatorIdentifierOrKeyMod.default,
    recipientCertificate: typings.pkijs.certificateMod.default,
    recipientEncryptedKeys: typings.pkijs.recipientEncryptedKeysMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): KeyAgreeRecipientInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientEncryptedKeys = recipientEncryptedKeys.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyAgreeRecipientInfo]
  }
  
  @scala.inline
  implicit class KeyAgreeRecipientInfoOps[Self <: KeyAgreeRecipientInfo] (val x: Self) extends AnyVal {
    
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
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyEncryptionAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginator(value: typings.pkijs.originatorIdentifierOrKeyMod.default): Self = this.set("originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientCertificate(value: typings.pkijs.certificateMod.default): Self = this.set("recipientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientEncryptedKeys(value: typings.pkijs.recipientEncryptedKeysMod.default): Self = this.set("recipientEncryptedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUkm(value: OctetString): Self = this.set("ukm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUkm: Self = this.set("ukm", js.undefined)
  }
}
