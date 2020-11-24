package typings.pkijs.privateKeyInfoMod

import typings.asn1js.mod.OctetString
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateKeyInfo extends js.Object {
  
  var attributes: js.UndefOr[js.Array[typings.pkijs.attributeMod.default]] = js.native
  
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var parsedKey: js.UndefOr[typings.pkijs.ecprivatekeyMod.default | typings.pkijs.rsaprivatekeyMod.default] = js.native
  
  var privateKey: OctetString = js.native
  
  var privateKeyAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
  
  var version: Double = js.native
}
object PrivateKeyInfo {
  
  @scala.inline
  def apply(
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    privateKey: OctetString,
    privateKeyAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): PrivateKeyInfo = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), privateKey = privateKey.asInstanceOf[js.Any], privateKeyAlgorithm = privateKeyAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyInfo]
  }
  
  @scala.inline
  implicit class PrivateKeyInfoOps[Self <: PrivateKeyInfo] (val x: Self) extends AnyVal {
    
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
    def setFromJSON(value: JsonWebKey => Unit): Self = this.set("fromJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrivateKey(value: OctetString): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("privateKeyAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: typings.pkijs.attributeMod.default*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[typings.pkijs.attributeMod.default]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setParsedKey(value: typings.pkijs.ecprivatekeyMod.default | typings.pkijs.rsaprivatekeyMod.default): Self = this.set("parsedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParsedKey: Self = this.set("parsedKey", js.undefined)
  }
}
