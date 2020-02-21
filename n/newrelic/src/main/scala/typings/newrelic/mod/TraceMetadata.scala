package typings.newrelic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceMetadata extends js.Object {
  /**
    * The current span ID
    */
  var spanId: js.UndefOr[String] = js.undefined
  /**
    * The current trace ID
    */
  var traceId: js.UndefOr[String] = js.undefined
}

object TraceMetadata {
  @scala.inline
  def apply(spanId: String = null, traceId: String = null): TraceMetadata = {
    val __obj = js.Dynamic.literal()
    if (spanId != null) __obj.updateDynamic("spanId")(spanId.asInstanceOf[js.Any])
    if (traceId != null) __obj.updateDynamic("traceId")(traceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceMetadata]
  }
}

