package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ConnectionPoolClearedEvent")
@js.native
open class ConnectionPoolClearedEvent () extends ConnectionPoolMonitoringEvent {
  
  /* Excluded from this release type: serviceId */
  var interruptInUseConnections: js.UndefOr[Boolean] = js.native
}
