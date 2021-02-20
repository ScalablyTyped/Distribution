package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spanKindMod {
  
  @js.native
  sealed trait SpanKind extends StObject
  @JSImport("@opentelemetry/api/build/src/trace/span_kind", "SpanKind")
  @js.native
  object SpanKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SpanKind with Double] = js.native
    
    /**
      * Indicates that the span covers the client-side wrapper around an RPC or
      * other remote request.
      */
    @js.native
    sealed trait CLIENT extends SpanKind
    /* 2 */ val CLIENT: typings.opentelemetryApi.spanKindMod.SpanKind.CLIENT with Double = js.native
    
    /**
      * Indicates that the span describes consumer receiving a message from a
      * broker. Unlike client and server, there is no direct critical path latency
      * relationship between producer and consumer spans.
      */
    @js.native
    sealed trait CONSUMER extends SpanKind
    /* 4 */ val CONSUMER: typings.opentelemetryApi.spanKindMod.SpanKind.CONSUMER with Double = js.native
    
    /** Default value. Indicates that the span is used internally. */
    @js.native
    sealed trait INTERNAL extends SpanKind
    /* 0 */ val INTERNAL: typings.opentelemetryApi.spanKindMod.SpanKind.INTERNAL with Double = js.native
    
    /**
      * Indicates that the span describes producer sending a message to a
      * broker. Unlike client and server, there is no direct critical path latency
      * relationship between producer and consumer spans.
      */
    @js.native
    sealed trait PRODUCER extends SpanKind
    /* 3 */ val PRODUCER: typings.opentelemetryApi.spanKindMod.SpanKind.PRODUCER with Double = js.native
    
    /**
      * Indicates that the span covers server-side handling of an RPC or other
      * remote request.
      */
    @js.native
    sealed trait SERVER extends SpanKind
    /* 1 */ val SERVER: typings.opentelemetryApi.spanKindMod.SpanKind.SERVER with Double = js.native
  }
}
