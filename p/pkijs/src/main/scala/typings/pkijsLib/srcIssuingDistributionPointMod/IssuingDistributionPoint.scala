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

