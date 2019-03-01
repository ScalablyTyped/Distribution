package typings
package nodeDashRedLib.nodeDashRedMod

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
  def version(): java.lang.String
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
    version: js.Function0[java.lang.String]
  ): Red = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth")(auth)
    __obj.updateDynamic("comms")(comms)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("httpAdmin")(httpAdmin)
    __obj.updateDynamic("httpNode")(httpNode)
    __obj.updateDynamic("library")(library)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("nodes")(nodes)
    __obj.updateDynamic("server")(server)
    __obj.updateDynamic("settings")(settings)
    __obj.updateDynamic("util")(util)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Red]
  }
}

