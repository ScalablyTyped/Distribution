package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  def getDefinition(): js.Any
}

object Constraint {
  @scala.inline
  def apply(getDefinition: js.Function0[js.Any]): Constraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDefinition")(getDefinition)
    __obj.asInstanceOf[Constraint]
  }
}

