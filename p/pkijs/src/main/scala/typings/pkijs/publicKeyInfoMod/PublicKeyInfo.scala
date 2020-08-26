package typings.pkijs.publicKeyInfoMod

import typings.asn1js.mod.BitString
import typings.std.CryptoKey
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyInfo extends js.Object {
  var algorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  var parsedKey: js.UndefOr[typings.pkijs.ecpublickeyMod.default | typings.pkijs.rsapublickeyMod.default] = js.native
  var subjectPublicKey: BitString = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def importKey(publicKey: CryptoKey): js.Thenable[Unit] = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PublicKeyInfo {
  @scala.inline
  def apply(
    algorithm: typings.pkijs.algorithmIdentifierMod.default,
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    importKey: CryptoKey => js.Thenable[Unit],
    subjectPublicKey: BitString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PublicKeyInfo = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), importKey = js.Any.fromFunction1(importKey), subjectPublicKey = subjectPublicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PublicKeyInfo]
  }
  @scala.inline
  implicit class PublicKeyInfoOps[Self <: PublicKeyInfo] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromJSON(value: JsonWebKey => Unit): Self = this.set("fromJSON", js.Any.fromFunction1(value))
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setImportKey(value: CryptoKey => js.Thenable[Unit]): Self = this.set("importKey", js.Any.fromFunction1(value))
    @scala.inline
    def setSubjectPublicKey(value: BitString): Self = this.set("subjectPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setParsedKey(value: typings.pkijs.ecpublickeyMod.default | typings.pkijs.rsapublickeyMod.default): Self = this.set("parsedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParsedKey: Self = this.set("parsedKey", js.undefined)
  }
  
}

