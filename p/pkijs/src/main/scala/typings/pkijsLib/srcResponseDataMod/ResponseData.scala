package typings
package pkijsLib.srcResponseDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseData extends js.Object {
  var producedAt: stdLib.Date = js.native
  var responderID: js.Any = js.native
  var responseExtensions: js.Array[pkijsLib.srcExtensionMod.default] = js.native
  var responses: js.Array[pkijsLib.srcSingleResponseMod.default] = js.native
  var tds: stdLib.ArrayBuffer = js.native
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

