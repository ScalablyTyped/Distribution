package typings
package pkijsLib.srcPBKDF2ParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PBKDF2Params extends js.Object {
  var iterationCount: scala.Double
  var keyLength: scala.Double
  var prf: pkijsLib.srcAlgorithmIdentifierMod.default
  var salt: js.Any
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PBKDF2Params {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    iterationCount: scala.Double,
    keyLength: scala.Double,
    prf: pkijsLib.srcAlgorithmIdentifierMod.default,
    salt: js.Any,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): PBKDF2Params = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("iterationCount")(iterationCount)
    __obj.updateDynamic("keyLength")(keyLength)
    __obj.updateDynamic("prf")(prf)
    __obj.updateDynamic("salt")(salt)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.asInstanceOf[PBKDF2Params]
  }
}

