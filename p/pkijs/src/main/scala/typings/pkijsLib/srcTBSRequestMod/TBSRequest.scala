package typings
package pkijsLib.srcTBSRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TBSRequest extends js.Object {
  var requestExtensions: js.UndefOr[pkijsLib.srcExtensionMod.default] = js.native
  var requestList: js.Array[pkijsLib.srcRequestMod.default] = js.native
  var requestorName: js.UndefOr[pkijsLib.srcGeneralNameMod.default] = js.native
  var tbs: stdLib.ArrayBuffer = js.native
  var version: js.UndefOr[scala.Double] = js.native
  def fromSchema(schema: js.Any): scala.Unit = js.native
  def toJSON(): js.Any = js.native
  /**
    * Convert current object to asn1js object and set correct values
    * 
    * @param {boolean} [encodeFlag]
    * @returns {*}
    */
  def toSchema(): js.Any = js.native
  def toSchema(encodeFlag: scala.Boolean): js.Any = js.native
}

