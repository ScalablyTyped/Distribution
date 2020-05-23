package typings.meteor.global.Tracker

import typings.meteor.anon.OnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Tracker.autorun")
@js.native
object autorun extends js.Object {
  def apply(runFunc: js.Function1[/* computation */ typings.meteor.Tracker.Computation, Unit]): typings.meteor.Tracker.Computation = js.native
  def apply(
    runFunc: js.Function1[/* computation */ typings.meteor.Tracker.Computation, Unit],
    options: OnError
  ): typings.meteor.Tracker.Computation = js.native
}

