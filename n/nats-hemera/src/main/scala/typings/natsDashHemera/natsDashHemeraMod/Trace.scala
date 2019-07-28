package typings.natsDashHemera.natsDashHemeraMod

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
    val __obj = js.Dynamic.literal(duration = duration, method = method, parentSpanId = parentSpanId, service = service, spanId = spanId, timestamp = timestamp, traceId = traceId)
  
    __obj.asInstanceOf[Trace]
  }
}

