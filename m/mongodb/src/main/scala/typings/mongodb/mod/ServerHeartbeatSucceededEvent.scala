package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ServerHeartbeatSucceededEvent")
@js.native
open class ServerHeartbeatSucceededEvent () extends StObject {
  
  /** The connection id for the command */
  var connectionId: String = js.native
  
  /** The execution time of the event in ms */
  var duration: scala.Double = js.native
  
  /** The command reply */
  var reply: Document = js.native
}
