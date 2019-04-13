package typings
package natsDashHemeraLib.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trace extends js.Object {
  var duration: scala.Double
  var method: java.lang.String
  var parentSpanId: java.lang.String
  var service: java.lang.String
  var spanId: java.lang.String
  var timestamp: scala.Double
  var traceId: java.lang.String
}

object Trace {
  @scala.inline
  def apply(
    duration: scala.Double,
    method: java.lang.String,
    parentSpanId: java.lang.String,
    service: java.lang.String,
    spanId: java.lang.String,
    timestamp: scala.Double,
    traceId: java.lang.String
  ): Trace = {
    val __obj = js.Dynamic.literal(duration = duration, method = method, parentSpanId = parentSpanId, service = service, spanId = spanId, timestamp = timestamp, traceId = traceId)
  
    __obj.asInstanceOf[Trace]
  }
}

