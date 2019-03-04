package typings
package pkijsLib.srcPBES2ParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PBES2Params extends js.Object {
  var encryptionScheme: pkijsLib.srcAlgorithmIdentifierMod.default
  var keyDerivationFunc: pkijsLib.srcAlgorithmIdentifierMod.default
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PBES2Params {
  @scala.inline
  def apply(
    encryptionScheme: pkijsLib.srcAlgorithmIdentifierMod.default,
    fromSchema: js.Function1[js.Any, scala.Unit],
    keyDerivationFunc: pkijsLib.srcAlgorithmIdentifierMod.default,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): PBES2Params = {
    val __obj = js.Dynamic.literal(encryptionScheme = encryptionScheme, fromSchema = fromSchema, keyDerivationFunc = keyDerivationFunc, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[PBES2Params]
  }
}

