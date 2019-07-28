package typings.opentracing.libSpanUnderscoreContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/span_context", "SpanContext")
@js.native
class SpanContext () extends js.Object {
  /**
    * Returns a string representation of the implementation internal span ID.
    *
    * @returns {string}
    */
  def toSpanId(): String = js.native
  /**
    * Returns a string representation of the implementation internal trace ID.
    *
    * @returns {string}
    */
  def toTraceId(): String = js.native
}

