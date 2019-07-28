package typings.nodeDashZookeeperDashClient.nodeDashZookeeperDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-zookeeper-client", "Exception")
@js.native
class Exception protected () extends js.Object {
  // tslint:disable-next-line ban-types
  def this(code: Double, name: String, ctor: js.Function) = this()
  // tslint:disable-next-line ban-types
  def this(code: Double, name: String, path: String, ctor: js.Function) = this()
  var code: Double = js.native
  var name: String = js.native
  var path: js.UndefOr[String] = js.native
  def getCode(): Double = js.native
  def getName(): String = js.native
  def getPath(): String = js.native
}

/* static members */
@JSImport("node-zookeeper-client", "Exception")
@js.native
object Exception extends js.Object {
  var API_ERROR: Double = js.native
  var AUTH_FAILED: Double = js.native
  var BAD_ARGUMENTS: Double = js.native
  var BAD_VERSION: Double = js.native
  var CONNECTION_LOSS: Double = js.native
  var DATA_INCONSISTENCY: Double = js.native
  var INVALID_ACL: Double = js.native
  var INVALID_CALLBACK: Double = js.native
  var MARSHALLING_ERROR: Double = js.native
  var NODE_EXISTS: Double = js.native
  var NOT_EMPTY: Double = js.native
  var NO_AUTH: Double = js.native
  var NO_CHILDREN_FOR_EPHEMERALS: Double = js.native
  var NO_NODE: Double = js.native
  var OK: Double = js.native
  var OPERATION_TIMEOUT: Double = js.native
  var RUNTIME_INCONSISTENCY: Double = js.native
  var SESSION_EXPIRED: Double = js.native
  var SYSTEM_ERROR: Double = js.native
  var UNIMPLEMENTED: Double = js.native
}

