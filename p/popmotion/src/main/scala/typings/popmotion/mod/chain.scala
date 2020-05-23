package typings.popmotion.mod

import typings.popmotion.actionMod.Action
import typings.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "chain")
@js.native
object chain extends js.Object {
  def apply(actions: Action[ColdSubscription]*): Action[ColdSubscription] = js.native
}

