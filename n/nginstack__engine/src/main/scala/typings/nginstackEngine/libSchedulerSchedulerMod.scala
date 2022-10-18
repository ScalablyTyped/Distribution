package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSchedulerSchedulerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/scheduler/Scheduler", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Scheduler
  @JSImport("@nginstack/engine/lib/scheduler/Scheduler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): Scheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Scheduler]
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  @js.native
  trait Scheduler extends StObject {
    
    def delTasks(taskIds: String): Unit = js.native
    def delTasks(taskIds: String, userId: String): Unit = js.native
    def delTasks(taskIds: String, userId: String, password: String): Unit = js.native
    def delTasks(taskIds: String, userId: Unit, password: String): Unit = js.native
    def delTasks(taskIds: js.Array[String]): Unit = js.native
    def delTasks(taskIds: js.Array[String], userId: String): Unit = js.native
    def delTasks(taskIds: js.Array[String], userId: String, password: String): Unit = js.native
    def delTasks(taskIds: js.Array[String], userId: Unit, password: String): Unit = js.native
    
    def getCurrentTaskId(): String | Null = js.native
    
    def getTasks(): DataSet = js.native
    
    var maxSimultaneousTasks: Double = js.native
    
    def saveTasks(tasks: DataSet): Unit = js.native
    def saveTasks(tasks: DataSet, userId: String): Unit = js.native
    def saveTasks(tasks: DataSet, userId: String, password: String): Unit = js.native
    def saveTasks(tasks: DataSet, userId: Unit, password: String): Unit = js.native
    
    def startTasks(taskIds: String): Unit = js.native
    def startTasks(taskIds: js.Array[String]): Unit = js.native
    
    def stopTasks(taskIds: String): Unit = js.native
    def stopTasks(taskIds: js.Array[String]): Unit = js.native
  }
}
