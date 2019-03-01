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
    fromSchema: js.Function1[js.Any, scala.Unit],
    indirectCRL: scala.Boolean,
    onlyContainsAttributeCerts: scala.Boolean,
    onlyContainsUserCerts: scala.Boolean,
    onlySomeReasons: scala.Double,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    distributionPoint: js.Array[pkijsLib.srcGeneralNameMod.default] | pkijsLib.srcRelativeDistinguishedNamesMod.default = null
  ): IssuingDistributionPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("indirectCRL")(indirectCRL)
    __obj.updateDynamic("onlyContainsAttributeCerts")(onlyContainsAttributeCerts)
    __obj.updateDynamic("onlyContainsUserCerts")(onlyContainsUserCerts)
    __obj.updateDynamic("onlySomeReasons")(onlySomeReasons)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    if (distributionPoint != null) __obj.updateDynamic("distributionPoint")(distributionPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuingDistributionPoint]
  }
}

