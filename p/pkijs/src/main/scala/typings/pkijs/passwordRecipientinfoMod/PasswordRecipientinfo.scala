package typings.pkijs.passwordRecipientinfoMod

import typings.asn1js.mod.OctetString
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordRecipientinfo extends js.Object {
  
  var encryptedKey: OctetString = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var keyDerivationAlgorithm: js.UndefOr[typings.pkijs.algorithmIdentifierMod.default] = js.native
  
  var keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  
  var password: ArrayBuffer = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
  
  var version: Double = js.native
}
object PasswordRecipientinfo {
  
  @scala.inline
  def apply(
    encryptedKey: OctetString,
    fromSchema: js.Any => Unit,
    keyEncryptionAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    password: ArrayBuffer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): PasswordRecipientinfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyEncryptionAlgorithm = keyEncryptionAlgorithm.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRecipientinfo]
  }
  
  @scala.inline
  implicit class PasswordRecipientinfoOps[Self <: PasswordRecipientinfo] (val x: Self) extends AnyVal {
    
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
    def setPassword(value: ArrayBuffer): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyDerivationAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("keyDerivationAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyDerivationAlgorithm: Self = this.set("keyDerivationAlgorithm", js.undefined)
  }
}
