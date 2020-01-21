package typings.popmotion

import typings.popmotion.actionMod.Action
import typings.popmotion.pointerTypesMod.PointerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/input/multitouch", JSImport.Namespace)
@js.native
object multitouchMod extends js.Object {
  def default(): Action = js.native
  def default(hasPreventDefaultScaleRotate: PointerProps): Action = js.native
  def getIsTouchDevice(): Boolean = js.native
}

