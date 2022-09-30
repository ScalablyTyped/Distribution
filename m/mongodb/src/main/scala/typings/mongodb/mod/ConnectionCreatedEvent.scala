package typings.mongodb.mod

import typings.mongodb.mongodbStrings.LessthansignmonitorGreaterthansign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ConnectionCreatedEvent")
@js.native
open class ConnectionCreatedEvent () extends ConnectionPoolMonitoringEvent {
  
  /** A monotonically increasing, per-pool id for the newly created connection */
  var connectionId: scala.Double | LessthansignmonitorGreaterthansign = js.native
}
