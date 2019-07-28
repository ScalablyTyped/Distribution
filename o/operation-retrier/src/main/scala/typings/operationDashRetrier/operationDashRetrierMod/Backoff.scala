package typings.operationDashRetrier.operationDashRetrierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("operation-retrier", "Backoff")
@js.native
class Backoff protected ()
  extends typings.operationDashRetrier.libBackoffMod.Backoff {
  def this(options: js.Any) = this()
}

/* static members */
@JSImport("operation-retrier", "Backoff")
@js.native
object Backoff extends js.Object {
  def exponential(options: js.Any): typings.operationDashRetrier.libBackoffMod.Backoff = js.native
}

