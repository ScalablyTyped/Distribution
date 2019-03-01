package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("parentSpanId")(parentSpanId)
    __obj.updateDynamic("service")(service)
    __obj.updateDynamic("spanId")(spanId)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("traceId")(traceId)
    __obj.asInstanceOf[Trace]
  }
}

