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

object PrivateKeyUsagePeriod {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    notAfter: stdLib.Date = null,
    notBefore: stdLib.Date = null
  ): PrivateKeyUsagePeriod = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter)
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore)
    __obj.asInstanceOf[PrivateKeyUsagePeriod]
  }
}

