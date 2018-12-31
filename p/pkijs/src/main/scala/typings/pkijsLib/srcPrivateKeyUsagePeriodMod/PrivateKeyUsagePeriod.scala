package typings
package pkijsLib.srcPrivateKeyUsagePeriodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyUsagePeriod extends js.Object {
  var notAfter: js.UndefOr[stdLib.Date] = js.undefined
  var notBefore: js.UndefOr[stdLib.Date] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

