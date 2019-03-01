package typings
package nodeDashResqueLib.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorPayload extends js.Object {
  var backtrace: js.Array[java.lang.String]
  var error: java.lang.String
  var exception: java.lang.String
  var failed_at: java.lang.String
  var payload: js.Any
  var queue: java.lang.String
  var worker: java.lang.String
}

object ErrorPayload {
  @scala.inline
  def apply(
    backtrace: js.Array[java.lang.String],
    error: java.lang.String,
    exception: java.lang.String,
    failed_at: java.lang.String,
    payload: js.Any,
    queue: java.lang.String,
    worker: java.lang.String
  ): ErrorPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backtrace")(backtrace)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("exception")(exception)
    __obj.updateDynamic("failed_at")(failed_at)
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("queue")(queue)
    __obj.updateDynamic("worker")(worker)
    __obj.asInstanceOf[ErrorPayload]
  }
}

