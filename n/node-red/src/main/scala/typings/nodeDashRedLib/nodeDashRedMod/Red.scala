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

