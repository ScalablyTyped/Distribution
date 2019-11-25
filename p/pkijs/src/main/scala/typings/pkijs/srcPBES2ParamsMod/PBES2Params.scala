package typings.pkijs.srcPBES2ParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PBES2Params extends js.Object {
  var encryptionScheme: typings.pkijs.srcAlgorithmIdentifierMod.default
  var keyDerivationFunc: typings.pkijs.srcAlgorithmIdentifierMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PBES2Params {
  @scala.inline
  def apply(
    encryptionScheme: typings.pkijs.srcAlgorithmIdentifierMod.default,
    fromSchema: js.Any => Unit,
    keyDerivationFunc: typings.pkijs.srcAlgorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PBES2Params = {
    val __obj = js.Dynamic.literal(encryptionScheme = encryptionScheme.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyDerivationFunc = keyDerivationFunc.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[PBES2Params]
  }
}

