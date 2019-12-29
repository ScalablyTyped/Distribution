package typings.opentracing

import typings.opentracing.libBinaryUnderscoreCarrierMod.default
import typings.opentracing.opentracingStrings.binary
import typings.opentracing.opentracingStrings.child_of
import typings.opentracing.opentracingStrings.client
import typings.opentracing.opentracingStrings.component
import typings.opentracing.opentracingStrings.consumer
import typings.opentracing.opentracingStrings.dbDotinstance
import typings.opentracing.opentracingStrings.dbDotstatement
import typings.opentracing.opentracingStrings.dbDottype
import typings.opentracing.opentracingStrings.dbDotuser
import typings.opentracing.opentracingStrings.error
import typings.opentracing.opentracingStrings.follows_from
import typings.opentracing.opentracingStrings.httpDotmethod
import typings.opentracing.opentracingStrings.httpDotstatus_code
import typings.opentracing.opentracingStrings.httpDoturl
import typings.opentracing.opentracingStrings.http_headers
import typings.opentracing.opentracingStrings.message_busDotdestination
import typings.opentracing.opentracingStrings.peerDotaddress
import typings.opentracing.opentracingStrings.peerDothostname
import typings.opentracing.opentracingStrings.peerDotipv4
import typings.opentracing.opentracingStrings.peerDotipv6
import typings.opentracing.opentracingStrings.peerDotport
import typings.opentracing.opentracingStrings.peerDotservice
import typings.opentracing.opentracingStrings.producer
import typings.opentracing.opentracingStrings.samplingDotpriority
import typings.opentracing.opentracingStrings.server
import typings.opentracing.opentracingStrings.spanDotkind
import typings.opentracing.opentracingStrings.text_map
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing", JSImport.Namespace)
@js.native
object opentracingMod extends js.Object {
  @js.native
  class BinaryCarrier protected () extends default {
    def this(buffer: ArrayLike[Double]) = this()
  }
  
  @js.native
  class MockTracer ()
    extends typings.opentracing.libMockUnderscoreTracerMod.MockTracer
  
  @js.native
  class Reference protected ()
    extends typings.opentracing.libReferenceMod.default {
    def this(`type`: String, referencedContext: typings.opentracing.libSpanMod.default) = this()
    /**
      * Initialize a new Reference instance.
      *
      * @param {string} type - the Reference type constant (e.g.,
      *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
      * @param {SpanContext} referencedContext - the SpanContext being referred
      *        to. As a convenience, a Span instance may be passed in instead
      *        (in which case its .context() is used here).
      */
    def this(`type`: String, referencedContext: typings.opentracing.libSpanUnderscoreContextMod.default) = this()
  }
  
  @js.native
  class Span ()
    extends typings.opentracing.libSpanMod.Span
  
  @js.native
  class SpanContext ()
    extends typings.opentracing.libSpanUnderscoreContextMod.SpanContext
  
  @js.native
  class Tracer ()
    extends typings.opentracing.libTracerMod.Tracer
  
  val FORMAT_BINARY: binary = js.native
  val FORMAT_HTTP_HEADERS: http_headers = js.native
  val FORMAT_TEXT_MAP: text_map = js.native
  val REFERENCE_CHILD_OF: child_of = js.native
  val REFERENCE_FOLLOWS_FROM: follows_from = js.native
  def childOf(spanContext: typings.opentracing.libSpanMod.default): typings.opentracing.libReferenceMod.default = js.native
  def childOf(spanContext: typings.opentracing.libSpanUnderscoreContextMod.default): typings.opentracing.libReferenceMod.default = js.native
  def followsFrom(spanContext: typings.opentracing.libSpanMod.default): typings.opentracing.libReferenceMod.default = js.native
  def followsFrom(spanContext: typings.opentracing.libSpanUnderscoreContextMod.default): typings.opentracing.libReferenceMod.default = js.native
  def globalTracer(): typings.opentracing.libTracerMod.default = js.native
  def initGlobalTracer(tracer: typings.opentracing.libTracerMod.default): Unit = js.native
  @js.native
  object Tags extends js.Object {
    val COMPONENT: component = js.native
    val DB_INSTANCE: dbDotinstance = js.native
    val DB_STATEMENT: dbDotstatement = js.native
    val DB_TYPE: dbDottype = js.native
    val DB_USER: dbDotuser = js.native
    val ERROR: error = js.native
    val HTTP_METHOD: httpDotmethod = js.native
    val HTTP_STATUS_CODE: httpDotstatus_code = js.native
    val HTTP_URL: httpDoturl = js.native
    val MESSAGE_BUS_DESTINATION: message_busDotdestination = js.native
    val PEER_ADDRESS: peerDotaddress = js.native
    val PEER_HOSTNAME: peerDothostname = js.native
    val PEER_HOST_IPV4: peerDotipv4 = js.native
    val PEER_HOST_IPV6: peerDotipv6 = js.native
    val PEER_PORT: peerDotport = js.native
    val PEER_SERVICE: peerDotservice = js.native
    val SAMPLING_PRIORITY: samplingDotpriority = js.native
    val SPAN_KIND: spanDotkind = js.native
    val SPAN_KIND_MESSAGING_CONSUMER: consumer = js.native
    val SPAN_KIND_MESSAGING_PRODUCER: producer = js.native
    val SPAN_KIND_RPC_CLIENT: client = js.native
    val SPAN_KIND_RPC_SERVER: server = js.native
  }
  
}

