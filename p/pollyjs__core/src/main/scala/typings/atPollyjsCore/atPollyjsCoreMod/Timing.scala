package typings.atPollyjsCore.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/core", "Timing")
@js.native
object Timing extends js.Object {
  def fixed(ms: Double): js.Function0[js.Promise[Unit]] = js.native
  def relative(ratio: Double): js.Function1[/* ms */ Double, js.Promise[Unit]] = js.native
}

