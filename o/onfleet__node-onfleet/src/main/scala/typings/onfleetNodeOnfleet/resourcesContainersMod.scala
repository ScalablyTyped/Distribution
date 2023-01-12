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

object resourcesContainersMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Containers", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Container {
    
    /* CompleteClass */
    override def get(id: String, group: organizations | teams | workers): js.Promise[OnfleetContainer] = js.native
  }
  
  trait Container extends StObject {
    
    def get(id: String, group: organizations | teams | workers): js.Promise[OnfleetContainer]
  }
  object Container {
    
    inline def apply(get: (String, organizations | teams | workers) => js.Promise[OnfleetContainer]): Container = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
      __obj.asInstanceOf[Container]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
      
      inline def setGet(value: (String, organizations | teams | workers) => js.Promise[OnfleetContainer]): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    }
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
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: OnfleetContainer] (val x: Self) extends AnyVal {
      
      inline def setActiveTask(value: String): Self = StObject.set(x, "activeTask", value.asInstanceOf[js.Any])
      
      inline def setActiveTaskNull: Self = StObject.set(x, "activeTask", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setTasks(value: js.Array[String]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksVarargs(value: String*): Self = StObject.set(x, "tasks", js.Array(value*))
      
      inline def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
      
      inline def setType(value: ORGANIZATION | TEAM | WORKER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
}
