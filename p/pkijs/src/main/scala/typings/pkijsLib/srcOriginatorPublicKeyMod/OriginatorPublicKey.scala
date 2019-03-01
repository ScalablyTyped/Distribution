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
    fromSchema: js.Function1[js.Any, scala.Unit],
    publicKey: asn1jsLib.asn1jsMod.BitString,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): OriginatorPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algorithm")(algorithm)
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[OriginatorPublicKey]
  }
}

