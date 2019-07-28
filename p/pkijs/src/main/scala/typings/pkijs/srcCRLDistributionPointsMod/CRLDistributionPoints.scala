package typings.pkijs.srcCRLDistributionPointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CRLDistributionPoints extends js.Object {
  var distributionPoints: js.Array[typings.pkijs.srcDistributionPointMod.default]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CRLDistributionPoints {
  @scala.inline
  def apply(
    distributionPoints: js.Array[typings.pkijs.srcDistributionPointMod.default],
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): CRLDistributionPoints = {
    val __obj = js.Dynamic.literal(distributionPoints = distributionPoints, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[CRLDistributionPoints]
  }
}

