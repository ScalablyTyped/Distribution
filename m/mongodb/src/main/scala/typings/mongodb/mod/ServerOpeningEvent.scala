package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ServerOpeningEvent")
@js.native
open class ServerOpeningEvent () extends StObject {
  
  /** The address (host/port pair) of the server */
  var address: String = js.native
  
  /** A unique identifier for the topology */
  var topologyId: scala.Double = js.native
}
