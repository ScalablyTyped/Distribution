package typings.popmotion.mod

import typings.popmotion.actionMod.Action
import typings.popmotion.actionTypesMod.ColdSubscription
import typings.popmotion.pointerTypesMod.PointerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "pointer")
@js.native
object pointer extends js.Object {
  def apply(): Action[ColdSubscription] = js.native
  def apply(hasXYProps: PointerProps): Action[ColdSubscription] = js.native
}

