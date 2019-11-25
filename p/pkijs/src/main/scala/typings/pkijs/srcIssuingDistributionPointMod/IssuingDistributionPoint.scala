package typings.pkijs.srcIssuingDistributionPointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuingDistributionPoint extends js.Object {
  var distributionPoint: js.UndefOr[
    js.Array[typings.pkijs.srcGeneralNameMod.default] | typings.pkijs.srcRelativeDistinguishedNamesMod.default
  ] = js.undefined
  var indirectCRL: Boolean
  var onlyContainsAttributeCerts: Boolean
  var onlyContainsUserCerts: Boolean
  var onlySomeReasons: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object IssuingDistributionPoint {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    indirectCRL: Boolean,
    onlyContainsAttributeCerts: Boolean,
    onlyContainsUserCerts: Boolean,
    onlySomeReasons: Double,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    distributionPoint: js.Array[typings.pkijs.srcGeneralNameMod.default] | typings.pkijs.srcRelativeDistinguishedNamesMod.default = null
  ): IssuingDistributionPoint = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), indirectCRL = indirectCRL.asInstanceOf[js.Any], onlyContainsAttributeCerts = onlyContainsAttributeCerts.asInstanceOf[js.Any], onlyContainsUserCerts = onlyContainsUserCerts.asInstanceOf[js.Any], onlySomeReasons = onlySomeReasons.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (distributionPoint != null) __obj.updateDynamic("distributionPoint")(distributionPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuingDistributionPoint]
  }
}

