package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Restorable extends js.Object {
  def restore(): scala.Unit
}

object Restorable {
  @scala.inline
  def apply(restore: js.Function0[scala.Unit]): Restorable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("restore")(restore)
    __obj.asInstanceOf[Restorable]
  }
}

