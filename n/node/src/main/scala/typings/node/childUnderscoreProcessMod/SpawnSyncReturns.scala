package typings.node.childUnderscoreProcessMod

import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnSyncReturns[T] extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var output: js.Array[java.lang.String]
  var pid: Double
  var signal: java.lang.String | Null
  var status: Double | Null
  var stderr: T
  var stdout: T
}

object SpawnSyncReturns {
  @scala.inline
  def apply[T](
    output: js.Array[java.lang.String],
    pid: Double,
    stderr: T,
    stdout: T,
    error: Error = null,
    signal: java.lang.String = null,
    status: Int | Double = null
  ): SpawnSyncReturns[T] = {
    val __obj = js.Dynamic.literal(output = output, pid = pid, stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnSyncReturns[T]]
  }
}

