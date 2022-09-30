package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ConnectionPoolCreatedEvent")
@js.native
open class ConnectionPoolCreatedEvent () extends ConnectionPoolMonitoringEvent {
  
  /** The options used to create this connection pool */
  var options: js.UndefOr[ConnectionPoolOptions] = js.native
}
