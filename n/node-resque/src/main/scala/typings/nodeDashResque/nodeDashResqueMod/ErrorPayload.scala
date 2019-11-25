package typings.nodeDashResque.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorPayload extends js.Object {
  var backtrace: js.Array[String] | Null
  var error: String
  var exception: String
  var failed_at: String
  var payload: js.Any
  var queue: String
  var worker: String
}

object ErrorPayload {
  @scala.inline
  def apply(
    error: String,
    exception: String,
    failed_at: String,
    payload: js.Any,
    queue: String,
    worker: String,
    backtrace: js.Array[String] = null
  ): ErrorPayload = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], failed_at = failed_at.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
    if (backtrace != null) __obj.updateDynamic("backtrace")(backtrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorPayload]
  }
}

