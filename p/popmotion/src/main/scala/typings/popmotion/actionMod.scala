package typings.popmotion

import typings.popmotion.actionTypesMod.ActionInit
import typings.popmotion.actionTypesMod.ActionProps
import typings.popmotion.actionTypesMod.ColdSubscription
import typings.popmotion.chainableMod.default
import typings.popmotion.observerTypesMod.ObserverCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/action", JSImport.Namespace)
@js.native
object actionMod extends js.Object {
  @js.native
  class Action[Sub /* <: ColdSubscription */] () extends default[Action[ColdSubscription]] {
    def create(props: ActionProps): Action[ColdSubscription] = js.native
    def start(): Sub = js.native
    def start(observerCandidate: ObserverCandidate): Sub = js.native
  }
  
  def default[Sub /* <: ColdSubscription */](init: ActionInit): Action[Sub] = js.native
}

