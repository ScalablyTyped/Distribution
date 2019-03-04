package typings
package pkijsLib.srcRSASSAPSSParamsMod

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
  var hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  /**
    * Algorithm of "mask generaion function (MGF)" (DEFAULT mgf1SHA1)
    * 
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  var maskGenAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  /**
    * Salt length (DEFAULT 20)
    * 
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  var saltLength: scala.Double
  /**
    * (DEFAULT 1)
    * 
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  var trailerField: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RSASSAPSSParams {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    maskGenAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    saltLength: scala.Double,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    trailerField: scala.Double
  ): RSASSAPSSParams = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, hashAlgorithm = hashAlgorithm, maskGenAlgorithm = maskGenAlgorithm, saltLength = saltLength, toJSON = toJSON, toSchema = toSchema, trailerField = trailerField)
  
    __obj.asInstanceOf[RSASSAPSSParams]
  }
}

