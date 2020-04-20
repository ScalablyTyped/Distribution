package typings.pkijs.rsaesoaepparamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAESOAEPParams extends js.Object {
  var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default
  var maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default
  var pSourceAlgorithm: typings.pkijs.algorithmIdentifierMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RSAESOAEPParams {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    pSourceAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): RSAESOAEPParams = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], maskGenAlgorithm = maskGenAlgorithm.asInstanceOf[js.Any], pSourceAlgorithm = pSourceAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[RSAESOAEPParams]
  }
}

