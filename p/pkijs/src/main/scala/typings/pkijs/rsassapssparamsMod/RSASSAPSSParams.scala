package typings.pkijs.rsassapssparamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSASSAPSSParams extends js.Object {
  /**
    * Algorithms of hashing (DEFAULT sha1)
    *
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default
  /**
    * Algorithm of "mask generaion function (MGF)" (DEFAULT mgf1SHA1)
    *
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  var maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default
  /**
    * Salt length (DEFAULT 20)
    *
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  var saltLength: Double
  /**
    * (DEFAULT 1)
    *
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  var trailerField: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RSASSAPSSParams {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
    saltLength: Double,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    trailerField: Double
  ): RSASSAPSSParams = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], maskGenAlgorithm = maskGenAlgorithm.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), trailerField = trailerField.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RSASSAPSSParams]
  }
}

