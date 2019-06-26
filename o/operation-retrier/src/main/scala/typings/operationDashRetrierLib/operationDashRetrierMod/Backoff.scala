package typings
package operationDashRetrierLib.operationDashRetrierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("operation-retrier", "Backoff")
@js.native
class Backoff protected ()
  extends operationDashRetrierLib.libBackoffMod.Backoff {
  def this(options: js.Any) = this()
}

/* static members */
@JSImport("operation-retrier", "Backoff")
@js.native
object Backoff extends js.Object {
  def exponential(options: js.Any): operationDashRetrierLib.libBackoffMod.Backoff = js.native
}

