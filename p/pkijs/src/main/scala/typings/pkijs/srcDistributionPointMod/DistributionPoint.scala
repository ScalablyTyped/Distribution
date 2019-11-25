package typings.pkijs.srcDistributionPointMod

import typings.asn1js.asn1jsMod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionPoint extends js.Object {
  var cRLIssuer: js.UndefOr[js.Array[typings.pkijs.srcGeneralNameMod.default]] = js.undefined
  var distributionPoint: js.UndefOr[js.Array[typings.pkijs.srcGeneralNameMod.default]] = js.undefined
  var reasons: js.UndefOr[BitString] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object DistributionPoint {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    cRLIssuer: js.Array[typings.pkijs.srcGeneralNameMod.default] = null,
    distributionPoint: js.Array[typings.pkijs.srcGeneralNameMod.default] = null,
    reasons: BitString = null
  ): DistributionPoint = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (cRLIssuer != null) __obj.updateDynamic("cRLIssuer")(cRLIssuer.asInstanceOf[js.Any])
    if (distributionPoint != null) __obj.updateDynamic("distributionPoint")(distributionPoint.asInstanceOf[js.Any])
    if (reasons != null) __obj.updateDynamic("reasons")(reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionPoint]
  }
}

