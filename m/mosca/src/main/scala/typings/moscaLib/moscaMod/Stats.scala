package typings
package moscaLib.moscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mosca", "Stats")
@js.native
class Stats () extends js.Object {
  var connectedClients: scala.Double = js.native
  var lastIntervalConnectedClients: scala.Double = js.native
  var lastIntervalPublishedMessages: scala.Double = js.native
  var load: js.Any = js.native
  var maxConnectedClients: scala.Double = js.native
  var publishedMessages: scala.Double = js.native
  var started: stdLib.Date = js.native
  def wire(server: Server): scala.Unit = js.native
}

