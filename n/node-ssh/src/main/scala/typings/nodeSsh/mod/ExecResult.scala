package typings.nodeSsh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecResult extends js.Object {
  var code: Double
  var signal: js.UndefOr[String] = js.undefined
  var stderr: String
  var stdout: String
}

object ExecResult {
  @scala.inline
  def apply(code: Double, stderr: String, stdout: String, signal: String = null): ExecResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecResult]
  }
}

