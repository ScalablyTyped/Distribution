package typings.pkijs.srcResponseDataMod

import typings.std.ArrayBuffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseData extends js.Object {
  var producedAt: Date = js.native
  var responderID: js.Any = js.native
  var responseExtensions: js.Array[typings.pkijs.srcExtensionMod.default] = js.native
  var responses: js.Array[typings.pkijs.srcSingleResponseMod.default] = js.native
  var tds: ArrayBuffer = js.native
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

