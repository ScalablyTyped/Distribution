package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.anon.Apartment
import typings.onfleetNodeOnfleet.destinationsMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hubsMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Hubs", JSImport.Namespace)
  @js.native
  class ^ () extends Hub
  
  @js.native
  trait Hub extends StObject {
    
    def get(): js.Promise[js.Array[OnfleetHub]] = js.native
  }
  object Hub {
    
    @scala.inline
    def apply(get: () => js.Promise[js.Array[OnfleetHub]]): Hub = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Hub]
    }
    
    @scala.inline
    implicit class HubMutableBuilder[Self <: Hub] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: () => js.Promise[js.Array[OnfleetHub]]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait OnfleetHub extends StObject {
    
    var address: Apartment = js.native
    
    var id: String = js.native
    
    var location: Location = js.native
    
    var name: String = js.native
    
    var teams: js.Array[String] = js.native
  }
  object OnfleetHub {
    
    @scala.inline
    def apply(address: Apartment, id: String, location: Location, name: String, teams: js.Array[String]): OnfleetHub = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetHub]
    }
    
    @scala.inline
    implicit class OnfleetHubMutableBuilder[Self <: OnfleetHub] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Apartment): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value :_*))
    }
  }
}
