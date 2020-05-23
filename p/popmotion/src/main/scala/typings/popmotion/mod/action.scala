package typings.popmotion.mod

import typings.popmotion.actionMod.Action
import typings.popmotion.actionTypesMod.ActionInit
import typings.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "action")
@js.native
object action extends js.Object {
  def apply[Sub /* <: ColdSubscription */](init: ActionInit): Action[Sub] = js.native
}

