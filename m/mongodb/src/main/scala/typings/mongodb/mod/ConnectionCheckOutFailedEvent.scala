package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ConnectionCheckOutFailedEvent")
@js.native
open class ConnectionCheckOutFailedEvent () extends ConnectionPoolMonitoringEvent {
  
  /** The reason the attempt to check out failed */
  var reason: AnyError | String = js.native
}
