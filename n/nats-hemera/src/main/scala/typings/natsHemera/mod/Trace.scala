package typings.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trace extends js.Object {
  var duration: Double
  var method: String
  var parentSpanId: String
  var service: String
  var spanId: String
  var timestamp: Double
  var traceId: String
}

object Trace {
  @scala.inline
  def apply(
    duration: Double,
    method: String,
    parentSpanId: String,
    service: String,
    spanId: String,
    timestamp: Double,
    traceId: String
  ): Trace = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentSpanId = parentSpanId.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], spanId = spanId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trace]
  }
}

