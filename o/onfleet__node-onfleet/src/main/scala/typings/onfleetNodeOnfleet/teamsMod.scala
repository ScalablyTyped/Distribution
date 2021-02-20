package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.anon.Tasks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teamsMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Teams", JSImport.Namespace)
  @js.native
  class ^ () extends Team
  
  /**
    * @prop managers - An array of managing administrator IDs.
    * @prop name - A unique name for the team.
    * @prop workers - An array of worker IDs.
    * @prop hub - Optional. The ID of the team's hub.
    */
  @js.native
  trait CreateTeamProps extends StObject {
    
    var hub: js.UndefOr[String] = js.native
    
    var managers: js.Array[String] = js.native
    
    var name: String = js.native
    
    var workers: js.Array[String] = js.native
  }
  object CreateTeamProps {
    
    @scala.inline
    def apply(managers: js.Array[String], name: String, workers: js.Array[String]): CreateTeamProps = {
      val __obj = js.Dynamic.literal(managers = managers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTeamProps]
    }
    
    @scala.inline
    implicit class CreateTeamPropsMutableBuilder[Self <: CreateTeamProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHub(value: String): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
      
      @scala.inline
      def setManagers(value: js.Array[String]): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagersVarargs(value: String*): Self = StObject.set(x, "managers", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkers(value: js.Array[String]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkersVarargs(value: String*): Self = StObject.set(x, "workers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OnfleetTeam extends StObject {
    
    var hub: String = js.native
    
    var id: String = js.native
    
    var managers: js.Array[String] = js.native
    
    var name: String = js.native
    
    var timeCreated: Double = js.native
    
    var timeLastModified: Double = js.native
    
    var workers: js.Array[String] = js.native
  }
  object OnfleetTeam {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class OnfleetTeamMutableBuilder[Self <: OnfleetTeam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHub(value: String): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagers(value: js.Array[String]): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagersVarargs(value: String*): Self = StObject.set(x, "managers", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkers(value: js.Array[String]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkersVarargs(value: String*): Self = StObject.set(x, "workers", js.Array(value :_*))
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
  
  @js.native
  trait UpdateTeamProps extends StObject {
    
    var hub: js.UndefOr[String] = js.native
    
    var managers: js.UndefOr[js.Array[String]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var workers: js.UndefOr[js.Array[String]] = js.native
  }
  object UpdateTeamProps {
    
    @scala.inline
    def apply(): UpdateTeamProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTeamProps]
    }
    
    @scala.inline
    implicit class UpdateTeamPropsMutableBuilder[Self <: UpdateTeamProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHub(value: String): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
      
      @scala.inline
      def setManagers(value: js.Array[String]): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagersUndefined: Self = StObject.set(x, "managers", js.undefined)
      
      @scala.inline
      def setManagersVarargs(value: String*): Self = StObject.set(x, "managers", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setWorkers(value: js.Array[String]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
      
      @scala.inline
      def setWorkersVarargs(value: String*): Self = StObject.set(x, "workers", js.Array(value :_*))
    }
  }
}
