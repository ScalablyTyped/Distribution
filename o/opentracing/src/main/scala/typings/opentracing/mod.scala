package typings.opentracing

import typings.opentracing.binaryCarrierMod.default
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BinaryCarrier protected () extends default {
    def this(buffer: ArrayLike[Double]) = this()
  }
  
  @js.native
  class MockTracer ()
    extends typings.opentracing.mockTracerMod.MockTracer
  
  @js.native
  class Reference protected ()
    extends typings.opentracing.referenceMod.default {
    /**
      * Initialize a new Reference instance.
      *
      * @param {string} type - the Reference type constant (e.g.,
      *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
      * @param {SpanContext} referencedContext - the SpanContext being referred
      *        to. As a convenience, a Span instance may be passed in instead
      *        (in which case its .context() is used here).
      */
    def this(`type`: String, referencedContext: typings.opentracing.spanContextMod.default) = this()
    def this(`type`: String, referencedContext: typings.opentracing.spanMod.default) = this()
  }
  
  @js.native
  class Span ()
    extends typings.opentracing.spanMod.Span
  
  @js.native
  class SpanContext ()
    extends typings.opentracing.spanContextMod.SpanContext
  
  @js.native
  class Tracer ()
    extends typings.opentracing.tracerMod.Tracer
  
  val FORMAT_BINARY: /* "binary" */ String = js.native
  val FORMAT_HTTP_HEADERS: /* "http_headers" */ String = js.native
  val FORMAT_TEXT_MAP: /* "text_map" */ String = js.native
  val REFERENCE_CHILD_OF: /* "child_of" */ String = js.native
  val REFERENCE_FOLLOWS_FROM: /* "follows_from" */ String = js.native
  def childOf(spanContext: typings.opentracing.spanContextMod.default): typings.opentracing.referenceMod.default = js.native
  def childOf(spanContext: typings.opentracing.spanMod.default): typings.opentracing.referenceMod.default = js.native
  def followsFrom(spanContext: typings.opentracing.spanContextMod.default): typings.opentracing.referenceMod.default = js.native
  def followsFrom(spanContext: typings.opentracing.spanMod.default): typings.opentracing.referenceMod.default = js.native
  def globalTracer(): typings.opentracing.tracerMod.default = js.native
  def initGlobalTracer(tracer: typings.opentracing.tracerMod.default): Unit = js.native
  @js.native
  object Tags extends js.Object {
    val COMPONENT: /* "component" */ String = js.native
    val DB_INSTANCE: /* "db.instance" */ String = js.native
    val DB_STATEMENT: /* "db.statement" */ String = js.native
    val DB_TYPE: /* "db.type" */ String = js.native
    val DB_USER: /* "db.user" */ String = js.native
    val ERROR: /* "error" */ String = js.native
    val HTTP_METHOD: /* "http.method" */ String = js.native
    val HTTP_STATUS_CODE: /* "http.status_code" */ String = js.native
    val HTTP_URL: /* "http.url" */ String = js.native
    val MESSAGE_BUS_DESTINATION: /* "message_bus.destination" */ String = js.native
    val PEER_ADDRESS: /* "peer.address" */ String = js.native
    val PEER_HOSTNAME: /* "peer.hostname" */ String = js.native
    val PEER_HOST_IPV4: /* "peer.ipv4" */ String = js.native
    val PEER_HOST_IPV6: /* "peer.ipv6" */ String = js.native
    val PEER_PORT: /* "peer.port" */ String = js.native
    val PEER_SERVICE: /* "peer.service" */ String = js.native
    val SAMPLING_PRIORITY: /* "sampling.priority" */ String = js.native
    val SPAN_KIND: /* "span.kind" */ String = js.native
    val SPAN_KIND_MESSAGING_CONSUMER: /* "consumer" */ String = js.native
    val SPAN_KIND_MESSAGING_PRODUCER: /* "producer" */ String = js.native
    val SPAN_KIND_RPC_CLIENT: /* "client" */ String = js.native
    val SPAN_KIND_RPC_SERVER: /* "server" */ String = js.native
  }
  
}

