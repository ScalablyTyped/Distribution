package typings.popmotion.mod

import typings.popmotion.actionMod.Action
import typings.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "schedule")
@js.native
object schedule extends js.Object {
  def apply(scheduler: Action[ColdSubscription], schedulee: Action[ColdSubscription]): Action[ColdSubscription] = js.native
}

