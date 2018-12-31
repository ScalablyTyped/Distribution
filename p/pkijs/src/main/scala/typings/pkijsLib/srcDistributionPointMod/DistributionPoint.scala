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

