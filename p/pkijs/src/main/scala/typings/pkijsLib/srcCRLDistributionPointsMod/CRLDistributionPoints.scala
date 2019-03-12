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
    fromSchema: js.Any => scala.Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): CRLDistributionPoints = {
    val __obj = js.Dynamic.literal(distributionPoints = distributionPoints, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[CRLDistributionPoints]
  }
}

