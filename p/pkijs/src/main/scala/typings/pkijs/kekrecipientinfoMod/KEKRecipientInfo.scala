package typings.pkijs.kekrecipientinfoMod

import typings.asn1js.mod.OctetString
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KEKRecipientInfo extends js.Object {
  
  var encryptedKey: OctetString = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var kekid: typings.pkijs.kekidentifierMod.default = js.native
  
  var keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  
  var preDefinedKEK: ArrayBuffer = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
  
  var version: Double = js.native
}
object KEKRecipientInfo {
  
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Unit,
    kekid: typings.pkijs.kekidentifierMod.default,
    keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    preDefinedKEK: ArrayBuffer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): KEKRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), kekid = kekid.asInstanceOf[js.Any], keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], preDefinedKEK = preDefinedKEK.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KEKRecipientInfo]
  }
  
  @scala.inline
  implicit class KEKRecipientInfoOps[Self <: KEKRecipientInfo] (val x: Self) extends AnyVal {
    
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
    def setKekid(value: typings.pkijs.kekidentifierMod.default): Self = this.set("kekid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyEncryptionAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreDefinedKEK(value: ArrayBuffer): Self = this.set("preDefinedKEK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
