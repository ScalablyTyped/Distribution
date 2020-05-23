package typings.popmotion

import typings.popmotion.actionMod.Action
import typings.popmotion.actionTypesMod.ColdSubscription
import typings.popmotion.decayTypesMod.DecayProps
import typings.popmotion.vectorMod.ActionFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/animations/decay", JSImport.Namespace)
@js.native
object decayMod extends js.Object {
  val default: ActionFactory = js.native
  def decaySole(): Action[ColdSubscription] = js.native
  def decaySole(props: DecayProps): Action[ColdSubscription] = js.native
}

