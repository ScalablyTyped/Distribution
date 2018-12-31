package typings
package pkijsLib.srcRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var reqCert: pkijsLib.srcCertIDMod.default
  var singleRequestExtensions: js.UndefOr[js.Array[pkijsLib.srcExtensionMod.default]] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

