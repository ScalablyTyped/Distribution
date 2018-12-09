package typings
package pkijsLib.srcPublicKeyInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/PublicKeyInfo", JSImport.Default)
@js.native
class default () extends PublicKeyInfo {
  def this(params: js.Any) = this()
  /* CompleteClass */
  override var algorithm: pkijsLib.srcAlgorithmIdentifierMod.default = js.native
  /* CompleteClass */
  override var subjectPublicKey: asn1jsLib.asn1jsMod.BitString = js.native
  /**
           * Convert JSON value into current object
           * @param {JsonWebKey} json
           */
  /* CompleteClass */
  override def fromJSON(json: stdLib.JsonWebKey): scala.Unit = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def importKey(publicKey: stdLib.CryptoKey): js.Thenable[scala.Unit] = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

@JSImport("pkijs/src/PublicKeyInfo", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

