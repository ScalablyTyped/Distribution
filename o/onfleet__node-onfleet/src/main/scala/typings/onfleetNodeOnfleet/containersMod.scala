package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.ORGANIZATION
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.TEAM
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.WORKER
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.organizations
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.teams
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.workers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containersMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Containers", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Container
  
  @js.native
  trait Container extends StObject {
    
    @JSName("get")
    def get_organizations(id: String, group: organizations): js.Promise[OnfleetContainer] = js.native
    @JSName("get")
    def get_teams(id: String, group: teams): js.Promise[OnfleetContainer] = js.native
    @JSName("get")
    def get_workers(id: String, group: workers): js.Promise[OnfleetContainer] = js.native
  }
  
  trait OnfleetContainer extends StObject {
    
    var activeTask: String | Null
    
    var id: String
    
    var organization: String
    
    var tasks: js.Array[String]
    
    var timeCreated: Double
    
    var timeLastModified: Double
    
    var `type`: ORGANIZATION | TEAM | WORKER
    
    var worker: String
  }
  object OnfleetContainer {
    
    @scala.inline
    def apply(
      id: String,
      organization: String,
      tasks: js.Array[String],
      timeCreated: Double,
      timeLastModified: Double,
      `type`: ORGANIZATION | TEAM | WORKER,
      worker: String
    ): OnfleetContainer = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any], activeTask = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetContainer]
    }
    
    @scala.inline
    implicit class OnfleetContainerMutableBuilder[Self <: OnfleetContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTask(value: String): Self = StObject.set(x, "activeTask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTaskNull: Self = StObject.set(x, "activeTask", null)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasks(value: js.Array[String]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasksVarargs(value: String*): Self = StObject.set(x, "tasks", js.Array(value :_*))
      
      @scala.inline
      def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ORGANIZATION | TEAM | WORKER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
}
