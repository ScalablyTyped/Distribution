package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnSyncReturns[T] extends js.Object {
  var error: nodeLib.Error
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
    error: nodeLib.Error,
    output: js.Array[java.lang.String],
    pid: scala.Double,
    signal: java.lang.String,
    status: scala.Double,
    stderr: T,
    stdout: T
  ): SpawnSyncReturns[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("output")(output)
    __obj.updateDynamic("pid")(pid)
    __obj.updateDynamic("signal")(signal)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnSyncReturns[T]]
  }
}

