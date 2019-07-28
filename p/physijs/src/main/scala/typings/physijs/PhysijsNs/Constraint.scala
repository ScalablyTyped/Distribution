package typings.physijs.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  def getDefinition(): js.Any
}

object Constraint {
  @scala.inline
  def apply(getDefinition: () => js.Any): Constraint = {
    val __obj = js.Dynamic.literal(getDefinition = js.Any.fromFunction0(getDefinition))
  
    __obj.asInstanceOf[Constraint]
  }
}

