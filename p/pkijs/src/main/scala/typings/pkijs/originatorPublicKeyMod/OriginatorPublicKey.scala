package typings.pkijs.originatorPublicKeyMod

import typings.asn1js.mod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginatorPublicKey extends js.Object {
  var algorithm: typings.pkijs.algorithmIdentifierMod.default
  var publicKey: BitString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OriginatorPublicKey {
  @scala.inline
  def apply(
    algorithm: typings.pkijs.algorithmIdentifierMod.default,
    fromSchema: js.Any => Unit,
    publicKey: BitString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OriginatorPublicKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), publicKey = publicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[OriginatorPublicKey]
  }
}

