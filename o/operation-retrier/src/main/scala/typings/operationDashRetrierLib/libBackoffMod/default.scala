package typings
package operationDashRetrierLib.libBackoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("operation-retrier/lib/backoff", JSImport.Default)
@js.native
class default protected () extends Backoff {
  def this(options: js.Any) = this()
}

/* static members */
@JSImport("operation-retrier/lib/backoff", JSImport.Default)
@js.native
object default extends js.Object {
  def exponential(options: js.Any): operationDashRetrierLib.libBackoffMod.Backoff = js.native
}

