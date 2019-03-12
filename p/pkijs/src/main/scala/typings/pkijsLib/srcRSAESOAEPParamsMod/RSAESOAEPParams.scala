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
    fromSchema: js.Any => scala.Unit,
    hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    maskGenAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    pSourceAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RSAESOAEPParams = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm, maskGenAlgorithm = maskGenAlgorithm, pSourceAlgorithm = pSourceAlgorithm, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[RSAESOAEPParams]
  }
}

