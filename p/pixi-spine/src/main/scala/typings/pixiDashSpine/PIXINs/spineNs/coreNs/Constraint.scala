package typings.pixiDashSpine.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends Updatable {
  def getOrder(): Double
}

object Constraint {
  @scala.inline
  def apply(getOrder: () => Double, update: () => Unit): Constraint = {
    val __obj = js.Dynamic.literal(getOrder = js.Any.fromFunction0(getOrder), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[Constraint]
  }
}

