package typings.popmotion

import typings.popmotion.actionMod.Action
import typings.popmotion.actionTypesMod.ColdSubscription
import typings.popmotion.pointerTypesMod.PointerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/input/pointer", JSImport.Namespace)
@js.native
object pointerMod extends js.Object {
  def default(): Action[ColdSubscription] = js.native
  def default(hasXYProps: PointerProps): Action[ColdSubscription] = js.native
}

