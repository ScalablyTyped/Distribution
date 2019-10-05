package typings.opentracing

import typings.opentracing.libBinaryUnderscoreCarrierMod.default
import typings.opentracing.opentracingStrings.binary
import typings.opentracing.opentracingStrings.child_of
import typings.opentracing.opentracingStrings.client
import typings.opentracing.opentracingStrings.component
import typings.opentracing.opentracingStrings.consumer
import typings.opentracing.opentracingStrings.dbDOTinstance
import typings.opentracing.opentracingStrings.dbDOTstatement
import typings.opentracing.opentracingStrings.dbDOTtype
import typings.opentracing.opentracingStrings.dbDOTuser
import typings.opentracing.opentracingStrings.error
import typings.opentracing.opentracingStrings.follows_from
import typings.opentracing.opentracingStrings.httpDOTmethod
import typings.opentracing.opentracingStrings.httpDOTstatus_code
import typings.opentracing.opentracingStrings.httpDOTurl
import typings.opentracing.opentracingStrings.http_headers
import typings.opentracing.opentracingStrings.message_busDOTdestination
import typings.opentracing.opentracingStrings.peerDOTaddress
import typings.opentracing.opentracingStrings.peerDOThostname
import typings.opentracing.opentracingStrings.peerDOTipv4
import typings.opentracing.opentracingStrings.peerDOTipv6
import typings.opentracing.opentracingStrings.peerDOTport
import typings.opentracing.opentracingStrings.peerDOTservice
import typings.opentracing.opentracingStrings.producer
import typings.opentracing.opentracingStrings.samplingDOTpriority
import typings.opentracing.opentracingStrings.server
import typings.opentracing.opentracingStrings.spanDOTkind
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
    extends typings.opentracing.libSpanMod.default
  
  @js.native
  class SpanContext ()
    extends typings.opentracing.libSpanUnderscoreContextMod.default
  
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
    val DB_INSTANCE: dbDOTinstance = js.native
    val DB_STATEMENT: dbDOTstatement = js.native
    val DB_TYPE: dbDOTtype = js.native
    val DB_USER: dbDOTuser = js.native
    val ERROR: error = js.native
    val HTTP_METHOD: httpDOTmethod = js.native
    val HTTP_STATUS_CODE: httpDOTstatus_code = js.native
    val HTTP_URL: httpDOTurl = js.native
    val MESSAGE_BUS_DESTINATION: message_busDOTdestination = js.native
    val PEER_ADDRESS: peerDOTaddress = js.native
    val PEER_HOSTNAME: peerDOThostname = js.native
    val PEER_HOST_IPV4: peerDOTipv4 = js.native
    val PEER_HOST_IPV6: peerDOTipv6 = js.native
    val PEER_PORT: peerDOTport = js.native
    val PEER_SERVICE: peerDOTservice = js.native
    val SAMPLING_PRIORITY: samplingDOTpriority = js.native
    val SPAN_KIND: spanDOTkind = js.native
    val SPAN_KIND_MESSAGING_CONSUMER: consumer = js.native
    val SPAN_KIND_MESSAGING_PRODUCER: producer = js.native
    val SPAN_KIND_RPC_CLIENT: client = js.native
    val SPAN_KIND_RPC_SERVER: server = js.native
  }
  
}

