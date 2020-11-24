package typings.pkijs.keyTransRecipientInfoMod

import typings.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyTransRecipientInfo extends js.Object {
  
  var encryptedKey: OctetString = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  
  /**
    * For some reasons we need to store recipient's certificate here
    *
    * @type {Certificate}
    * @memberOf KeyTransRecipientInfo
    */
  var recipientCertificate: typings.pkijs.certificateMod.default = js.native
  
  var rid: typings.pkijs.recipientIdentifierMod.default = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
  
  var version: Double = js.native
}
object KeyTransRecipientInfo {
  
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Unit,
    keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    recipientCertificate: typings.pkijs.certificateMod.default,
    rid: typings.pkijs.recipientIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): KeyTransRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], recipientCertificate = recipientCertificate.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyTransRecipientInfo]
  }
  
  @scala.inline
  implicit class KeyTransRecipientInfoOps[Self <: KeyTransRecipientInfo] (val x: Self) extends AnyVal {
    
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
    def setEncryptedKey(value: OctetString): Self = this.set("encryptedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyEncryptionAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientCertificate(value: typings.pkijs.certificateMod.default): Self = this.set("recipientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRid(value: typings.pkijs.recipientIdentifierMod.default): Self = this.set("rid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
