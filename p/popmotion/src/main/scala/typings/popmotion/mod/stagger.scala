package typings.popmotion.mod

import typings.popmotion.actionMod.Action
import typings.popmotion.staggerMod.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "stagger")
@js.native
object stagger extends js.Object {
  def apply(actions: js.Array[Action], interval: Interval): Action = js.native
}

