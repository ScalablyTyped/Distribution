package typings
package nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-zookeeper-client", "Exception")
@js.native
class Exception protected () extends js.Object {
  // tslint:disable-next-line ban-types
  def this(code: scala.Double, name: java.lang.String, ctor: js.Function) = this()
  // tslint:disable-next-line ban-types
  def this(code: scala.Double, name: java.lang.String, path: java.lang.String, ctor: js.Function) = this()
  var code: scala.Double = js.native
  var name: java.lang.String = js.native
  var path: js.UndefOr[java.lang.String] = js.native
  def getCode(): scala.Double = js.native
  def getName(): java.lang.String = js.native
  def getPath(): java.lang.String = js.native
}

@JSImport("node-zookeeper-client", "Exception")
@js.native
object Exception extends js.Object {
  var API_ERROR: scala.Double = js.native
  var AUTH_FAILED: scala.Double = js.native
  var BAD_ARGUMENTS: scala.Double = js.native
  var BAD_VERSION: scala.Double = js.native
  var CONNECTION_LOSS: scala.Double = js.native
  var DATA_INCONSISTENCY: scala.Double = js.native
  var INVALID_ACL: scala.Double = js.native
  var INVALID_CALLBACK: scala.Double = js.native
  var MARSHALLING_ERROR: scala.Double = js.native
  var NODE_EXISTS: scala.Double = js.native
  var NOT_EMPTY: scala.Double = js.native
  var NO_AUTH: scala.Double = js.native
  var NO_CHILDREN_FOR_EPHEMERALS: scala.Double = js.native
  var NO_NODE: scala.Double = js.native
  var OK: scala.Double = js.native
  var OPERATION_TIMEOUT: scala.Double = js.native
  var RUNTIME_INCONSISTENCY: scala.Double = js.native
  var SESSION_EXPIRED: scala.Double = js.native
  var SYSTEM_ERROR: scala.Double = js.native
  var UNIMPLEMENTED: scala.Double = js.native
}

