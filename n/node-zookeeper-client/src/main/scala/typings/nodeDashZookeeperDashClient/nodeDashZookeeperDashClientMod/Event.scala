package typings.nodeDashZookeeperDashClient.nodeDashZookeeperDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-zookeeper-client", "Event")
@js.native
class Event protected () extends js.Object {
  def this(`type`: Double, name: String, path: String) = this()
  var name: String = js.native
  var path: String = js.native
  var `type`: Double = js.native
  def getName(): String = js.native
  def getPath(): String = js.native
  def getType(): Double = js.native
}

/* static members */
@JSImport("node-zookeeper-client", "Event")
@js.native
object Event extends js.Object {
  var NODE_CHILDREN_CHANGED: Double = js.native
  var NODE_CREATED: Double = js.native
  var NODE_DATA_CHANGED: Double = js.native
  var NODE_DELETED: Double = js.native
}

