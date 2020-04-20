package typings.pkijs.pbes2paramsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PBES2Params extends js.Object {
  var encryptionScheme: typings.pkijs.algorithmIdentifierMod.default
  var keyDerivationFunc: typings.pkijs.algorithmIdentifierMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PBES2Params {
  @scala.inline
  def apply(
    encryptionScheme: typings.pkijs.algorithmIdentifierMod.default,
    fromSchema: js.Any => Unit,
    keyDerivationFunc: typings.pkijs.algorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PBES2Params = {
    val __obj = js.Dynamic.literal(encryptionScheme = encryptionScheme.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), keyDerivationFunc = keyDerivationFunc.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PBES2Params]
  }
}

