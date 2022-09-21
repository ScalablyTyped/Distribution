package typings.nginstackEngine

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/scheduler/Task", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Task
  @JSImport("@nginstack/engine/lib/scheduler/Task", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Task extends StObject {
    
    var date: js.Date = js.native
    
    var day: Double = js.native
    
    var dbName: String = js.native
    
    def del(): Unit = js.native
    
    var enabled: Boolean = js.native
    
    var hour: String | Double = js.native
    
    var id: String = js.native
    
    var lastExecution: js.Date = js.native
    
    var name: String = js.native
    
    var nextExecution: js.Date = js.native
    
    var period: String = js.native
    
    var preRequisiteTask: String = js.native
    
    def saveLocally(): Unit = js.native
    def saveLocally(userId: String): Unit = js.native
    def saveLocally(userId: String, password: String): Unit = js.native
    def saveLocally(userId: Unit, password: String): Unit = js.native
    
    var scheduled: js.Date = js.native
    
    var scriptKey: Double = js.native
    
    var scriptName: String = js.native
    
    var scriptURI: String = js.native
    
    def setParameters(name: String, value: js.Array[String | Double | Boolean | (Record[Any, Any])]): Double = js.native
    
    def start(): Unit = js.native
    
    var status: String = js.native
    
    def stop(): Unit = js.native
    
    var textParameters: String = js.native
    
    var userKey: Double = js.native
  }
}
