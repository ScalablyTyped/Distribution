package typings.nodeRed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Red extends js.Object {
  var auth: js.Any = js.native
  var comms: js.Any = js.native
  var events: js.Any = js.native
  var httpAdmin: js.Any = js.native
  var httpNode: js.Any = js.native
  var library: js.Any = js.native
  var log: js.Any = js.native
  /** Node lifecycle management api. Used by all nodes. */
  var nodes: Nodes = js.native
  var server: js.Any = js.native
  var settings: js.Any = js.native
  var util: js.Any = js.native
  /** Returns the version of the running Node-RED environment. */
  def version(): String = js.native
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
  @scala.inline
  implicit class RedOps[Self <: Red] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuth(value: js.Any): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def setComms(value: js.Any): Self = this.set("comms", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpAdmin(value: js.Any): Self = this.set("httpAdmin", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpNode(value: js.Any): Self = this.set("httpNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLibrary(value: js.Any): Self = this.set("library", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog(value: js.Any): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodes(value: Nodes): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: js.Any): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: js.Any): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtil(value: js.Any): Self = this.set("util", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: () => String): Self = this.set("version", js.Any.fromFunction0(value))
  }
  
}

