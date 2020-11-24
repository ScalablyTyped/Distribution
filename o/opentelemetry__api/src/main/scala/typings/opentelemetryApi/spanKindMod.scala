package typings.opentelemetryApi

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/trace/span_kind", JSImport.Namespace)
@js.native
object spanKindMod extends js.Object {
  
  @js.native
  sealed trait SpanKind extends js.Object
  @js.native
  object SpanKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SpanKind with Double] = js.native
    
    /**
      * Indicates that the span covers the client-side wrapper around an RPC or
      * other remote request.
      */
    @js.native
    sealed trait CLIENT extends SpanKind
    /* 2 */ @js.native
    object CLIENT extends TopLevel[CLIENT with Double]
    
    /**
      * Indicates that the span describes consumer receiving a message from a
      * broker. Unlike client and server, there is no direct critical path latency
      * relationship between producer and consumer spans.
      */
    @js.native
    sealed trait CONSUMER extends SpanKind
    /* 4 */ @js.native
    object CONSUMER extends TopLevel[CONSUMER with Double]
    
    /** Default value. Indicates that the span is used internally. */
    @js.native
    sealed trait INTERNAL extends SpanKind
    /* 0 */ @js.native
    object INTERNAL extends TopLevel[INTERNAL with Double]
    
    /**
      * Indicates that the span describes producer sending a message to a
      * broker. Unlike client and server, there is no direct critical path latency
      * relationship between producer and consumer spans.
      */
    @js.native
    sealed trait PRODUCER extends SpanKind
    /* 3 */ @js.native
    object PRODUCER extends TopLevel[PRODUCER with Double]
    
    /**
      * Indicates that the span covers server-side handling of an RPC or other
      * remote request.
      */
    @js.native
    sealed trait SERVER extends SpanKind
    /* 1 */ @js.native
    object SERVER extends TopLevel[SERVER with Double]
  }
}
