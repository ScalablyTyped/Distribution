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
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    notAfter: stdLib.Date = null,
    notBefore: stdLib.Date = null
  ): PrivateKeyUsagePeriod = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema)
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter)
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore)
    __obj.asInstanceOf[PrivateKeyUsagePeriod]
  }
}

