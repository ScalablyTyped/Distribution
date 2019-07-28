package typings.pkijs.srcPBKDF2ParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PBKDF2Params extends js.Object {
  var iterationCount: Double
  var keyLength: Double
  var prf: typings.pkijs.srcAlgorithmIdentifierMod.default
  var salt: js.Any
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PBKDF2Params {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    iterationCount: Double,
    keyLength: Double,
    prf: typings.pkijs.srcAlgorithmIdentifierMod.default,
    salt: js.Any,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PBKDF2Params = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), iterationCount = iterationCount, keyLength = keyLength, prf = prf, salt = salt, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[PBKDF2Params]
  }
}

