package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableResults extends StObject {
  
  var destinations: js.Array[Waypoint] = js.native
  
  var distances: js.UndefOr[js.Array[js.Array[Distance]]] = js.native
  
  var durations: js.Array[js.Array[Duration]] = js.native
  
  var sources: js.Array[Waypoint] = js.native
}
object TableResults {
  
  @scala.inline
  def apply(
    destinations: js.Array[Waypoint],
    durations: js.Array[js.Array[Duration]],
    sources: js.Array[Waypoint]
  ): TableResults = {
    val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], durations = durations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableResults]
  }
  
  @scala.inline
  implicit class TableResultsMutableBuilder[Self <: TableResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinations(value: js.Array[Waypoint]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsVarargs(value: Waypoint*): Self = StObject.set(x, "destinations", js.Array(value :_*))
    
    @scala.inline
    def setDistances(value: js.Array[js.Array[Distance]]): Self = StObject.set(x, "distances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistancesUndefined: Self = StObject.set(x, "distances", js.undefined)
    
    @scala.inline
    def setDistancesVarargs(value: js.Array[Distance]*): Self = StObject.set(x, "distances", js.Array(value :_*))
    
    @scala.inline
    def setDurations(value: js.Array[js.Array[Duration]]): Self = StObject.set(x, "durations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationsVarargs(value: js.Array[Duration]*): Self = StObject.set(x, "durations", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[Waypoint]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: Waypoint*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
