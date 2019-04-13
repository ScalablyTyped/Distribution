package typings
package atPollyjsCoreLib.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/core", "Timing")
@js.native
object Timing extends js.Object {
  def fixed(ms: scala.Double): js.Function0[js.Promise[scala.Unit]] = js.native
  def relative(ratio: scala.Double): js.Function1[/* ms */ scala.Double, js.Promise[scala.Unit]] = js.native
}

