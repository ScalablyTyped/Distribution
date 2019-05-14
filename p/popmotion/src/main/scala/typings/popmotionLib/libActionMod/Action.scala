package typings
package popmotionLib.libActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/action", "Action")
@js.native
class Action ()
  extends popmotionLib.libChainableMod.default[Action] {
  def create(props: popmotionLib.libActionTypesMod.ActionProps): Action = js.native
  def start(): popmotionLib.libActionTypesMod.ColdSubscription = js.native
  def start(observerCandidate: popmotionLib.libObserverTypesMod.ObserverCandidate): popmotionLib.libActionTypesMod.ColdSubscription = js.native
}

