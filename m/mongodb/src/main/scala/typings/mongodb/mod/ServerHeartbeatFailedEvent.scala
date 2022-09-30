package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ServerHeartbeatFailedEvent")
@js.native
open class ServerHeartbeatFailedEvent () extends StObject {
  
  /** The connection id for the command */
  var connectionId: String = js.native
  
  /** The execution time of the event in ms */
  var duration: scala.Double = js.native
  
  /** The command failure */
  var failure: js.Error = js.native
}
