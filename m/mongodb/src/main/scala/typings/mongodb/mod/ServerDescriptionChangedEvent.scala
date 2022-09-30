package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ServerDescriptionChangedEvent")
@js.native
open class ServerDescriptionChangedEvent () extends StObject {
  
  /** The address (host/port pair) of the server */
  var address: String = js.native
  
  /** The new server description */
  var newDescription: ServerDescription = js.native
  
  /** The previous server description */
  var previousDescription: ServerDescription = js.native
  
  /** A unique identifier for the topology */
  var topologyId: scala.Double = js.native
}
