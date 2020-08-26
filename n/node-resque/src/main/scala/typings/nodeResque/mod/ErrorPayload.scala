package typings.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorPayload extends js.Object {
  var backtrace: js.Array[String] | Null = js.native
  var error: String = js.native
  var exception: String = js.native
  var failed_at: String = js.native
  var payload: js.Any = js.native
  var queue: String = js.native
  var worker: String = js.native
}

object ErrorPayload {
  @scala.inline
  def apply(
    error: String,
    exception: String,
    failed_at: String,
    payload: js.Any,
    queue: String,
    worker: String
  ): ErrorPayload = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], failed_at = failed_at.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorPayload]
  }
  @scala.inline
  implicit class ErrorPayloadOps[Self <: ErrorPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setException(value: String): Self = this.set("exception", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed_at(value: String): Self = this.set("failed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorker(value: String): Self = this.set("worker", value.asInstanceOf[js.Any])
    @scala.inline
    def setBacktraceVarargs(value: String*): Self = this.set("backtrace", js.Array(value :_*))
    @scala.inline
    def setBacktrace(value: js.Array[String]): Self = this.set("backtrace", value.asInstanceOf[js.Any])
    @scala.inline
    def setBacktraceNull: Self = this.set("backtrace", null)
  }
  
}

