package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.anon.Apartment
import typings.onfleetNodeOnfleet.anon.PartialOnfleetHub
import typings.onfleetNodeOnfleet.resourcesDestinationsMod.DestinationAddress
import typings.onfleetNodeOnfleet.resourcesDestinationsMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcesHubsMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Hubs", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Hub {
    
    /* CompleteClass */
    override def create(obj: CreateHubProps): js.Promise[OnfleetHub] = js.native
    
    /* CompleteClass */
    override def get(): js.Promise[js.Array[OnfleetHub]] = js.native
    
    /* CompleteClass */
    override def update(id: String, hub: PartialOnfleetHub): js.Promise[OnfleetHub] = js.native
  }
  
  trait CreateHubProps extends StObject {
    
    /**
      * The hub’s street address information.
      */
    var address: DestinationAddress
    
    /**
      *  A name to identify the Hub.
      */
    var name: String
    
    /**
      * This is the team ID(s) that this Hub will be assigned to.
      */
    var team: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CreateHubProps {
    
    inline def apply(address: DestinationAddress, name: String): CreateHubProps = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateHubProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateHubProps] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: DestinationAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTeam(value: js.Array[String]): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
      
      inline def setTeamVarargs(value: String*): Self = StObject.set(x, "team", js.Array(value*))
    }
  }
  
  trait Hub extends StObject {
    
    def create(obj: CreateHubProps): js.Promise[OnfleetHub]
    
    def get(): js.Promise[js.Array[OnfleetHub]]
    
    def update(id: String, hub: PartialOnfleetHub): js.Promise[OnfleetHub]
  }
  object Hub {
    
    inline def apply(
      create: CreateHubProps => js.Promise[OnfleetHub],
      get: () => js.Promise[js.Array[OnfleetHub]],
      update: (String, PartialOnfleetHub) => js.Promise[OnfleetHub]
    ): Hub = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction0(get), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[Hub]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hub] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: CreateHubProps => js.Promise[OnfleetHub]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => js.Promise[js.Array[OnfleetHub]]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: (String, PartialOnfleetHub) => js.Promise[OnfleetHub]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  trait OnfleetHub extends StObject {
    
    var address: Apartment
    
    var id: String
    
    var location: Location
    
    var name: String
    
    var teams: js.Array[String]
  }
  object OnfleetHub {
    
    inline def apply(address: Apartment, id: String, location: Location, name: String, teams: js.Array[String]): OnfleetHub = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetHub]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnfleetHub] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: Apartment): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value*))
    }
  }
}
