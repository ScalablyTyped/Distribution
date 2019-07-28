package typings.pkijs.srcOCSPRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OCSPRequest extends js.Object {
  var optionalSignature: js.UndefOr[typings.pkijs.srcSignatureMod.default] = js.native
  var tbsRequest: typings.pkijs.srcTBSRequestMod.default = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  /**
    * Convert current object to asn1js object and set correct values
    * 
    * @param {boolean} [encodeFlag]
    * @returns {*}
    */
  def toSchema(): js.Any = js.native
  def toSchema(encodeFlag: Boolean): js.Any = js.native
}

