package typings
package pkijsLib.srcIssuingDistributionPointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuingDistributionPoint extends js.Object {
  var distributionPoint: js.UndefOr[
    js.Array[pkijsLib.srcGeneralNameMod.default] | pkijsLib.srcRelativeDistinguishedNamesMod.default
  ] = js.undefined
  var indirectCRL: scala.Boolean
  var onlyContainsAttributeCerts: scala.Boolean
  var onlyContainsUserCerts: scala.Boolean
  var onlySomeReasons: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object IssuingDistributionPoint {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    indirectCRL: scala.Boolean,
    onlyContainsAttributeCerts: scala.Boolean,
    onlyContainsUserCerts: scala.Boolean,
    onlySomeReasons: scala.Double,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    distributionPoint: js.Array[pkijsLib.srcGeneralNameMod.default] | pkijsLib.srcRelativeDistinguishedNamesMod.default = null
  ): IssuingDistributionPoint = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), indirectCRL = indirectCRL, onlyContainsAttributeCerts = onlyContainsAttributeCerts, onlyContainsUserCerts = onlyContainsUserCerts, onlySomeReasons = onlySomeReasons, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (distributionPoint != null) __obj.updateDynamic("distributionPoint")(distributionPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuingDistributionPoint]
  }
}

