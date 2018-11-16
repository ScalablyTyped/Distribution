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

