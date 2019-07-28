package typings.popmotion.libActionMod

import typings.popmotion.libActionTypesMod.ActionProps
import typings.popmotion.libActionTypesMod.ColdSubscription
import typings.popmotion.libChainableMod.default
import typings.popmotion.libObserverTypesMod.ObserverCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/action", "Action")
@js.native
class Action () extends default[Action] {
  def create(props: ActionProps): Action = js.native
  def start(): ColdSubscription = js.native
  def start(observerCandidate: ObserverCandidate): ColdSubscription = js.native
}

