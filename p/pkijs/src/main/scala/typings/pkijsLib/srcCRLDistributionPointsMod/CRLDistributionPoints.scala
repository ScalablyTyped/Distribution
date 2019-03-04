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

object CRLDistributionPoints {
  @scala.inline
  def apply(
    distributionPoints: js.Array[pkijsLib.srcDistributionPointMod.default],
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): CRLDistributionPoints = {
    val __obj = js.Dynamic.literal(distributionPoints = distributionPoints, fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[CRLDistributionPoints]
  }
}

