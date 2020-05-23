package typings.physijs.Physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointConstraint extends Constraint

object PointConstraint {
  @scala.inline
  def apply(getDefinition: () => js.Any): PointConstraint = {
    val __obj = js.Dynamic.literal(getDefinition = js.Any.fromFunction0(getDefinition))
    __obj.asInstanceOf[PointConstraint]
  }
}

