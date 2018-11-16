package typings
package pkijsLib.srcSingleResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SingleResponse extends js.Object {
  var certID: pkijsLib.srcCertIDMod.default
  var certStatus: js.Any
  var nextUpdate: js.UndefOr[stdLib.Date] = js.undefined
  var singleExtensions: js.Array[pkijsLib.srcExtensionMod.default]
  var thisUpdate: stdLib.Date
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

