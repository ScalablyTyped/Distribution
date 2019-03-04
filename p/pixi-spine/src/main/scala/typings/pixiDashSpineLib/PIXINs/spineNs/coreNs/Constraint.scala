package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends Updatable {
  def getOrder(): scala.Double
}

object Constraint {
  @scala.inline
  def apply(getOrder: js.Function0[scala.Double], update: js.Function0[scala.Unit]): Constraint = {
    val __obj = js.Dynamic.literal(getOrder = getOrder, update = update)
  
    __obj.asInstanceOf[Constraint]
  }
}

