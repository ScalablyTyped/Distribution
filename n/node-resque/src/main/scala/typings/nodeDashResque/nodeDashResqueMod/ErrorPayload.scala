package typings.nodeDashResque.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorPayload extends js.Object {
  var backtrace: js.Array[String]
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
    backtrace: js.Array[String],
    error: String,
    exception: String,
    failed_at: String,
    payload: js.Any,
    queue: String,
    worker: String
  ): ErrorPayload = {
    val __obj = js.Dynamic.literal(backtrace = backtrace, error = error, exception = exception, failed_at = failed_at, payload = payload, queue = queue, worker = worker)
  
    __obj.asInstanceOf[ErrorPayload]
  }
}

