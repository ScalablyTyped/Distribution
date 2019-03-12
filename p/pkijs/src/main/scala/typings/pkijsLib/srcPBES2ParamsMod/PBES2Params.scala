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
    fromSchema: js.Any => scala.Unit,
    keyDerivationFunc: pkijsLib.srcAlgorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PBES2Params = {
    val __obj = js.Dynamic.literal(encryptionScheme = encryptionScheme, fromSchema = js.Any.fromFunction1(fromSchema), keyDerivationFunc = keyDerivationFunc, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[PBES2Params]
  }
}

