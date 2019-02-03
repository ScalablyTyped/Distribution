package typings
package nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-zookeeper-client", "Event")
@js.native
class Event protected () extends js.Object {
  def this(`type`: scala.Double, name: java.lang.String, path: java.lang.String) = this()
  var name: java.lang.String = js.native
  var path: java.lang.String = js.native
  var `type`: scala.Double = js.native
  def getName(): java.lang.String = js.native
  def getPath(): java.lang.String = js.native
  def getType(): scala.Double = js.native
}

/* static members */
@JSImport("node-zookeeper-client", "Event")
@js.native
object Event extends js.Object {
  var NODE_CHILDREN_CHANGED: scala.Double = js.native
  var NODE_CREATED: scala.Double = js.native
  var NODE_DATA_CHANGED: scala.Double = js.native
  var NODE_DELETED: scala.Double = js.native
}

