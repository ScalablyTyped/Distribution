package typings.popmotion

import typings.popmotion.actionMod.Action
import typings.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/compositors/stagger", JSImport.Namespace)
@js.native
object staggerMod extends js.Object {
  def default(actions: js.Array[Action[ColdSubscription]], interval: Interval): Action[ColdSubscription] = js.native
  type Interval = Double | IntervalCalc
  type IntervalCalc = js.Function1[/* i */ Double, Double]
}

