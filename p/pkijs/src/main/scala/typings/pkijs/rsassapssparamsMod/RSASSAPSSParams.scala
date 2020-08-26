package typings.pkijs.rsassapssparamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSASSAPSSParams extends js.Object {
  /**
    * Algorithms of hashing (DEFAULT sha1)
    *
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  var hashAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  /**
    * Algorithm of "mask generaion function (MGF)" (DEFAULT mgf1SHA1)
    *
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  var maskGenAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
  /**
    * Salt length (DEFAULT 20)
    *
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  var saltLength: Double = js.native
  /**
    * (DEFAULT 1)
    *
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  var trailerField: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
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
  @scala.inline
  implicit class RSASSAPSSParamsOps[Self <: RSASSAPSSParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setHashAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("hashAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaskGenAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = this.set("maskGenAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaltLength(value: Double): Self = this.set("saltLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setTrailerField(value: Double): Self = this.set("trailerField", value.asInstanceOf[js.Any])
  }
  
}

