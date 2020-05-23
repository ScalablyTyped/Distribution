package typings.node.childProcessMod

import typings.node.NodeJS.Signals
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnSyncReturns[T] extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var output: js.Array[String]
  var pid: Double
  var signal: Signals | Null
  var status: Double | Null
  var stderr: T
  var stdout: T
}

object SpawnSyncReturns {
  @scala.inline
  def apply[T](
    output: js.Array[String],
    pid: Double,
    stderr: T,
    stdout: T,
    error: Error = null,
    signal: Signals = null,
    status: Double = null.asInstanceOf[Double]
  ): SpawnSyncReturns[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnSyncReturns[T]]
  }
}

