package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnSyncReturns[T] extends js.Object {
  var error: js.UndefOr[nodeLib.Error] = js.undefined
  var output: js.Array[java.lang.String]
  var pid: scala.Double
  var signal: java.lang.String | scala.Null
  var status: scala.Double | scala.Null
  var stderr: T
  var stdout: T
}

object SpawnSyncReturns {
  @scala.inline
  def apply[T](
    output: js.Array[java.lang.String],
    pid: scala.Double,
    stderr: T,
    stdout: T,
    error: nodeLib.Error = null,
    signal: java.lang.String = null,
    status: scala.Int | scala.Double = null
  ): SpawnSyncReturns[T] = {
    val __obj = js.Dynamic.literal(output = output, pid = pid, stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnSyncReturns[T]]
  }
}

