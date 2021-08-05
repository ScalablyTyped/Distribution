package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.anon.Tasks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teamsMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Teams", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Team
  
  /**
    * @prop managers - An array of managing administrator IDs.
    * @prop name - A unique name for the team.
    * @prop workers - An array of worker IDs.
    * @prop hub - Optional. The ID of the team's hub.
    */
  trait CreateTeamProps extends StObject {
    
    var hub: js.UndefOr[String] = js.undefined
    
    var managers: js.Array[String]
    
    var name: String
    
    var workers: js.Array[String]
  }
  object CreateTeamProps {
    
    inline def apply(managers: js.Array[String], name: String, workers: js.Array[String]): CreateTeamProps = {
      val __obj = js.Dynamic.literal(managers = managers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTeamProps]
    }
    
    extension [Self <: CreateTeamProps](x: Self) {
      
      inline def setHub(value: String): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      inline def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
      
      inline def setManagers(value: js.Array[String]): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      inline def setManagersVarargs(value: String*): Self = StObject.set(x, "managers", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWorkers(value: js.Array[String]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersVarargs(value: String*): Self = StObject.set(x, "workers", js.Array(value :_*))
    }
  }
  
  trait OnfleetTeam extends StObject {
    
    var hub: String
    
    var id: String
    
    var managers: js.Array[String]
    
    var name: String
    
    var timeCreated: Double
    
    var timeLastModified: Double
    
    var workers: js.Array[String]
  }
  object OnfleetTeam {
    
    inline def apply(
      hub: String,
      id: String,
      managers: js.Array[String],
      name: String,
      timeCreated: Double,
      timeLastModified: Double,
      workers: js.Array[String]
    ): OnfleetTeam = {
      val __obj = js.Dynamic.literal(hub = hub.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetTeam]
    }
    
    extension [Self <: OnfleetTeam](x: Self) {
      
      inline def setHub(value: String): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setManagers(value: js.Array[String]): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      inline def setManagersVarargs(value: String*): Self = StObject.set(x, "managers", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
      
      inline def setWorkers(value: js.Array[String]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersVarargs(value: String*): Self = StObject.set(x, "workers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Team extends StObject {
    
    def create(obj: js.Any): js.Promise[OnfleetTeam] = js.native
    
    def deleteOne(id: String): js.Promise[Unit] = js.native
    
    def get(): js.Promise[js.Array[OnfleetTeam]] = js.native
    def get(id: String): js.Promise[OnfleetTeam] = js.native
    
    def insertTask(id: String, obj: Tasks): js.Promise[OnfleetTeam] = js.native
    
    def update(id: String, obj: UpdateTeamProps): js.Promise[OnfleetTeam] = js.native
  }
  
  trait UpdateTeamProps extends StObject {
    
    var hub: js.UndefOr[String] = js.undefined
    
    var managers: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var workers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UpdateTeamProps {
    
    inline def apply(): UpdateTeamProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTeamProps]
    }
    
    extension [Self <: UpdateTeamProps](x: Self) {
      
      inline def setHub(value: String): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      inline def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
      
      inline def setManagers(value: js.Array[String]): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      inline def setManagersUndefined: Self = StObject.set(x, "managers", js.undefined)
      
      inline def setManagersVarargs(value: String*): Self = StObject.set(x, "managers", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setWorkers(value: js.Array[String]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
      
      inline def setWorkersVarargs(value: String*): Self = StObject.set(x, "workers", js.Array(value :_*))
    }
  }
}
