package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mongodb", "ConnectionPoolMonitoringEvent")
@js.native
open class ConnectionPoolMonitoringEvent () extends StObject {
  
  /** The address (host/port pair) of the pool */
  var address: String = js.native
  
  /** A timestamp when the event was created  */
  var time: js.Date = js.native
}
