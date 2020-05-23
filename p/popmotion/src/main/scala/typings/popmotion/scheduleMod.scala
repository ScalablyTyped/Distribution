package typings.popmotion

import typings.popmotion.actionMod.Action
import typings.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/compositors/schedule", JSImport.Namespace)
@js.native
object scheduleMod extends js.Object {
  def default(scheduler: Action[ColdSubscription], schedulee: Action[ColdSubscription]): Action[ColdSubscription] = js.native
}

