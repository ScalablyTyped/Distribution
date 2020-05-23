package typings.popmotion

import typings.popmotion.actionMod.Action
import typings.popmotion.actionTypesMod.ColdSubscription
import typings.popmotion.pointerTypesMod.PointerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/input/pointer/mouse", JSImport.Namespace)
@js.native
object mouseMod extends js.Object {
  def default(): Action[ColdSubscription] = js.native
  def default(hasPreventDefault: PointerProps): Action[ColdSubscription] = js.native
}

