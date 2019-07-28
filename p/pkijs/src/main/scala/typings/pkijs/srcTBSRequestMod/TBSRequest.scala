package typings.pkijs.srcTBSRequestMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TBSRequest extends js.Object {
  var requestExtensions: js.UndefOr[typings.pkijs.srcExtensionMod.default] = js.native
  var requestList: js.Array[typings.pkijs.srcRequestMod.default] = js.native
  var requestorName: js.UndefOr[typings.pkijs.srcGeneralNameMod.default] = js.native
  var tbs: ArrayBuffer = js.native
  var version: js.UndefOr[Double] = js.native
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

