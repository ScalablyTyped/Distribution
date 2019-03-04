package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnSyncReturns[T] extends js.Object {
  var error: js.UndefOr[nodeLib.Error] = js.undefined
  var output: js.Array[java.lang.String]
  var pid: scala.Double
  var signal: java.lang.String
  var status: scala.Double
  var stderr: T
  var stdout: T
}

object SpawnSyncReturns {
  @scala.inline
  def apply[T](
    output: js.Array[java.lang.String],
    pid: scala.Double,
    signal: java.lang.String,
    status: scala.Double,
    stderr: T,
    stdout: T,
    error: nodeLib.Error = null
  ): SpawnSyncReturns[T] = {
    val __obj = js.Dynamic.literal(output = output, pid = pid, signal = signal, status = status, stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[SpawnSyncReturns[T]]
  }
}

