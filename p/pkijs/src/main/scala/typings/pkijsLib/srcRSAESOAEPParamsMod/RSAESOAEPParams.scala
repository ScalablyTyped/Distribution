package typings
package pkijsLib.srcRSAESOAEPParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAESOAEPParams extends js.Object {
  var hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var maskGenAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var pSourceAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RSAESOAEPParams {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    maskGenAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    pSourceAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): RSAESOAEPParams = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, hashAlgorithm = hashAlgorithm, maskGenAlgorithm = maskGenAlgorithm, pSourceAlgorithm = pSourceAlgorithm, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[RSAESOAEPParams]
  }
}

