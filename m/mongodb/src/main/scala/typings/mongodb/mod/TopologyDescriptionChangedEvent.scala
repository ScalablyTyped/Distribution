package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "TopologyDescriptionChangedEvent")
@js.native
open class TopologyDescriptionChangedEvent () extends StObject {
  
  /** The new topology description */
  var newDescription: TopologyDescription = js.native
  
  /** The old topology description */
  var previousDescription: TopologyDescription = js.native
  
  /** A unique identifier for the topology */
  var topologyId: scala.Double = js.native
}
