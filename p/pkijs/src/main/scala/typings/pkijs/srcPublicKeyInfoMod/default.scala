package typings.pkijs.srcPublicKeyInfoMod

import typings.asn1js.asn1jsMod.BitString
import typings.std.CryptoKey
import typings.std.JsonWebKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/PublicKeyInfo", JSImport.Default)
@js.native
class default () extends PublicKeyInfo {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var algorithm: typings.pkijs.srcAlgorithmIdentifierMod.default = js.native
  /* CompleteClass */
  override var subjectPublicKey: BitString = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  /* CompleteClass */
  override def fromJSON(json: JsonWebKey): Unit = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): Unit = js.native
  /* CompleteClass */
  override def importKey(publicKey: CryptoKey): js.Thenable[Unit] = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("pkijs/src/PublicKeyInfo", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

