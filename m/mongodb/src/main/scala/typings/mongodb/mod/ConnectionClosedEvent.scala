package typings.mongodb.mod

import typings.mongodb.mongodbStrings.LessthansignmonitorGreaterthansign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ConnectionClosedEvent")
@js.native
open class ConnectionClosedEvent () extends ConnectionPoolMonitoringEvent {
  
  /** The id of the connection */
  var connectionId: scala.Double | LessthansignmonitorGreaterthansign = js.native
  
  /** The reason the connection was closed */
  var reason: String = js.native
  
  var serviceId: js.UndefOr[typings.bson.mod.ObjectId] = js.native
}
