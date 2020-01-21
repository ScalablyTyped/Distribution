package typings.opentracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/span_context", JSImport.Namespace)
@js.native
object spanContextMod extends js.Object {
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
  
  @js.native
  class default () extends SpanContext
  
}

