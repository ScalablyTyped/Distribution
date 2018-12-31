package typings
package pkijsLib.srcRSASSAPSSParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/RSASSAPSSParams", JSImport.Default)
@js.native
class default () extends RSASSAPSSParams {
  def this(params: js.Any) = this()
  /**
    * Algorithms of hashing (DEFAULT sha1)
    * 
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  /* CompleteClass */
  override var hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default = js.native
  /**
    * Algorithm of "mask generaion function (MGF)" (DEFAULT mgf1SHA1)
    * 
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  /* CompleteClass */
  override var maskGenAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default = js.native
  /**
    * Salt length (DEFAULT 20)
    * 
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  /* CompleteClass */
  override var saltLength: scala.Double = js.native
  /**
    * (DEFAULT 1)
    * 
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  /* CompleteClass */
  override var trailerField: scala.Double = js.native
  /* CompleteClass */
  override def fromSchema(schema: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /* CompleteClass */
  override def toSchema(): js.Any = js.native
}

@JSImport("pkijs/src/RSASSAPSSParams", JSImport.Default)
@js.native
object default extends js.Object {
  def defaultValues(memberName: java.lang.String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

