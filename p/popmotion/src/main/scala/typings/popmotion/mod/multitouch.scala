package typings.popmotion.mod

import typings.popmotion.actionMod.Action
import typings.popmotion.pointerTypesMod.PointerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "multitouch")
@js.native
object multitouch extends js.Object {
  def apply(): Action = js.native
  def apply(hasPreventDefaultScaleRotate: PointerProps): Action = js.native
}

