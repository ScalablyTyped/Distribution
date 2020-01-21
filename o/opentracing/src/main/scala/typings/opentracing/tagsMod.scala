package typings.opentracing

import typings.opentracing.opentracingStrings.client
import typings.opentracing.opentracingStrings.component
import typings.opentracing.opentracingStrings.consumer
import typings.opentracing.opentracingStrings.dbDotinstance
import typings.opentracing.opentracingStrings.dbDotstatement
import typings.opentracing.opentracingStrings.dbDottype
import typings.opentracing.opentracingStrings.dbDotuser
import typings.opentracing.opentracingStrings.error
import typings.opentracing.opentracingStrings.httpDotmethod
import typings.opentracing.opentracingStrings.httpDotstatus_code
import typings.opentracing.opentracingStrings.httpDoturl
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/ext/tags", JSImport.Namespace)
@js.native
object tagsMod extends js.Object {
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

