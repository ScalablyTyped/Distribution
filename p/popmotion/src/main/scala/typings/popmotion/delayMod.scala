package typings.popmotion

import typings.popmotion.actionMod.Action
import typings.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/compositors/delay", JSImport.Namespace)
@js.native
object delayMod extends js.Object {
  def default(timeToDelay: Double): Action[ColdSubscription] = js.native
}

