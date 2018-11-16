package typings
package pkijsLib.srcCRLDistributionPointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CRLDistributionPoints extends js.Object {
  var distributionPoints: js.Array[pkijsLib.srcDistributionPointMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

