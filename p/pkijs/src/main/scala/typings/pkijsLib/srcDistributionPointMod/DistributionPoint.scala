package typings
package pkijsLib.srcDistributionPointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionPoint extends js.Object {
  var cRLIssuer: js.UndefOr[js.Array[pkijsLib.srcGeneralNameMod.default]] = js.undefined
  var distributionPoint: js.UndefOr[js.Array[pkijsLib.srcGeneralNameMod.default]] = js.undefined
  var reasons: js.UndefOr[asn1jsLib.asn1jsMod.BitString] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object DistributionPoint {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    cRLIssuer: js.Array[pkijsLib.srcGeneralNameMod.default] = null,
    distributionPoint: js.Array[pkijsLib.srcGeneralNameMod.default] = null,
    reasons: asn1jsLib.asn1jsMod.BitString = null
  ): DistributionPoint = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (cRLIssuer != null) __obj.updateDynamic("cRLIssuer")(cRLIssuer)
    if (distributionPoint != null) __obj.updateDynamic("distributionPoint")(distributionPoint)
    if (reasons != null) __obj.updateDynamic("reasons")(reasons)
    __obj.asInstanceOf[DistributionPoint]
  }
}

