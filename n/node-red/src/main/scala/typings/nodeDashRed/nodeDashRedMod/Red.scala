package typings.nodeDashRed.nodeDashRedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Red extends js.Object {
  var auth: js.Any
  var comms: js.Any
  var events: js.Any
  var httpAdmin: js.Any
  var httpNode: js.Any
  var library: js.Any
  var log: js.Any
  /** Node lifecycle management api. Used by all nodes. */
  var nodes: Nodes
  var server: js.Any
  var settings: js.Any
  var util: js.Any
  /** Returns the version of the running Node-RED environment. */
  def version(): String
}

object Red {
  @scala.inline
  def apply(
    auth: js.Any,
    comms: js.Any,
    events: js.Any,
    httpAdmin: js.Any,
    httpNode: js.Any,
    library: js.Any,
    log: js.Any,
    nodes: Nodes,
    server: js.Any,
    settings: js.Any,
    util: js.Any,
    version: () => String
  ): Red = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], comms = comms.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], httpAdmin = httpAdmin.asInstanceOf[js.Any], httpNode = httpNode.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any], version = js.Any.fromFunction0(version))
  
    __obj.asInstanceOf[Red]
  }
}

