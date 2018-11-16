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

