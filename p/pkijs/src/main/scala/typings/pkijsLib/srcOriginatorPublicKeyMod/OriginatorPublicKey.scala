package typings
package pkijsLib.srcOriginatorPublicKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginatorPublicKey extends js.Object {
  var algorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var publicKey: asn1jsLib.asn1jsMod.BitString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OriginatorPublicKey {
  @scala.inline
  def apply(
    algorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    fromSchema: js.Any => scala.Unit,
    publicKey: asn1jsLib.asn1jsMod.BitString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OriginatorPublicKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, fromSchema = js.Any.fromFunction1(fromSchema), publicKey = publicKey, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[OriginatorPublicKey]
  }
}

