package typings.popmotion.mod

import typings.popmotion.actionMod.Action
import typings.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "delay")
@js.native
object delay extends js.Object {
  def apply(timeToDelay: Double): Action[ColdSubscription] = js.native
}

