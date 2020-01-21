package typings.popmotion.mod

import typings.popmotion.actionMod.Action
import typings.popmotion.pointerTypesMod.PointerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "pointer")
@js.native
object pointer extends js.Object {
  def apply(): Action = js.native
  def apply(hasXYProps: PointerProps): Action = js.native
}

