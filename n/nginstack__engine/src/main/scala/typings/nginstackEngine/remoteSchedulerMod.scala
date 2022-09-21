package typings.nginstackEngine

import typings.nginstackEngine.anon.ScriptKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteSchedulerMod {
  
  inline def apply(database: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(database.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/scheduler/RemoteScheduler", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with RemoteScheduler {
    def this(database: Any) = this()
  }
  @JSImport("@nginstack/engine/lib/scheduler/RemoteScheduler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait RemoteScheduler extends StObject {
    
    /* private */ var database_ : Any = js.native
    
    def delTasks(taskIds: String): Unit = js.native
    def delTasks(taskIds: String, userName: String): Unit = js.native
    def delTasks(taskIds: String, userName: String, password: String): Unit = js.native
    def delTasks(taskIds: String, userName: Unit, password: String): Unit = js.native
    def delTasks(taskIds: js.Array[String]): Unit = js.native
    def delTasks(taskIds: js.Array[String], userName: String): Unit = js.native
    def delTasks(taskIds: js.Array[String], userName: String, password: String): Unit = js.native
    def delTasks(taskIds: js.Array[String], userName: Unit, password: String): Unit = js.native
    
    def getTasks(): Any = js.native
    def getTasks(options: ScriptKey): Any = js.native
    
    var maxSimultaneousTasks: Double = js.native
    
    /* private */ var runAction_ : Any = js.native
    
    def saveTasks(tasks: Any): Unit = js.native
    def saveTasks(tasks: Any, userName: String): Unit = js.native
    def saveTasks(tasks: Any, userName: String, password: String): Unit = js.native
    def saveTasks(tasks: Any, userName: Unit, password: String): Unit = js.native
    
    def startTasks(taskIds: String): Unit = js.native
    def startTasks(taskIds: js.Array[String]): Unit = js.native
    
    def stopTasks(taskIds: String): Unit = js.native
    def stopTasks(taskIds: js.Array[String]): Unit = js.native
  }
}
