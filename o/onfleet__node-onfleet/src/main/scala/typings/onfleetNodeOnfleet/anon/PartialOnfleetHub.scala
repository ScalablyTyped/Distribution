package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.resourcesDestinationsMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Hubs.OnfleetHub> */
trait PartialOnfleetHub extends StObject {
  
  var address: js.UndefOr[Apartment] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[Location] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var teams: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialOnfleetHub {
  
  inline def apply(): PartialOnfleetHub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOnfleetHub]
  }
  
  extension [Self <: PartialOnfleetHub](x: Self) {
    
    inline def setAddress(value: Apartment): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsUndefined: Self = StObject.set(x, "teams", js.undefined)
    
    inline def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value*))
  }
}
