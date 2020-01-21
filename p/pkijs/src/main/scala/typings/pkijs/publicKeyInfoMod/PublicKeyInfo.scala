package typings.pkijs.publicKeyInfoMod

import typings.asn1js.mod.BitString
import typings.std.CryptoKey
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyInfo extends js.Object {
  var algorithm: typings.pkijs.algorithmIdentifierMod.default
  var parsedKey: js.UndefOr[typings.pkijs.ecpublickeyMod.default | typings.pkijs.rsapublickeyMod.default] = js.undefined
  var subjectPublicKey: BitString
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit
  def fromSchema(schema: js.Any): Unit
  def importKey(publicKey: CryptoKey): js.Thenable[Unit]
  def toJSON(): js.Any
  def toSchema(): js.Any
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
    toSchema: () => js.Any,
    parsedKey: typings.pkijs.ecpublickeyMod.default | typings.pkijs.rsapublickeyMod.default = null
  ): PublicKeyInfo = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), importKey = js.Any.fromFunction1(importKey), subjectPublicKey = subjectPublicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (parsedKey != null) __obj.updateDynamic("parsedKey")(parsedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInfo]
  }
}

