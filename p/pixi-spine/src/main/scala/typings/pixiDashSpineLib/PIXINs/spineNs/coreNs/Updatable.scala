package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Updatable extends js.Object {
  def update(): scala.Unit
}

object Updatable {
  @scala.inline
  def apply(update: js.Function0[scala.Unit]): Updatable = {
    val __obj = js.Dynamic.literal(update = update)
  
    __obj.asInstanceOf[Updatable]
  }
}

