package typings.mosca.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mosca", "Stats")
@js.native
class Stats () extends js.Object {
  
  var connectedClients: Double = js.native
  
  var lastIntervalConnectedClients: Double = js.native
  
  var lastIntervalPublishedMessages: Double = js.native
  
  var load: js.Any = js.native
  
  var maxConnectedClients: Double = js.native
  
  var publishedMessages: Double = js.native
  
  var started: Date = js.native
  
  def wire(server: Server): Unit = js.native
}
