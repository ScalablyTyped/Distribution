package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(source: DataSet): Unit = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(source: File): Unit = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(source: MemoryStream): Unit = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/scheduler/Job", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Job {
    def this(source: DataSet) = this()
    def this(source: File) = this()
    def this(source: MemoryStream) = this()
  }
  @JSImport("@nginstack/engine/lib/scheduler/Job", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.dataSetMod.^
  
  type File = typings.nginstackEngine.fileMod.^
  
  @js.native
  trait Job extends StObject {
    
    val authTokenId: String = js.native
    
    def calcNextExecution(): Unit = js.native
    
    var classKey: Double = js.native
    
    val creation: js.Date = js.native
    
    var date: js.Date = js.native
    
    var dateTime: js.Date = js.native
    
    var enabled: Boolean = js.native
    
    val finished: js.Date = js.native
    
    val finishedSuccessfully: Boolean = js.native
    
    var frequency: String = js.native
    
    var frequencyKey: Double = js.native
    
    var host: Double = js.native
    
    var hour: String = js.native
    
    val id: String = js.native
    
    val key: Double = js.native
    
    val lastResult: String = js.native
    
    def loadFromStream(stream: File): Unit = js.native
    def loadFromStream(stream: MemoryStream): Unit = js.native
    
    def loadFromTable(table: DataSet): Unit = js.native
    
    var monthDay: Double = js.native
    
    var name: String = js.native
    
    val nextExecution: js.Date = js.native
    
    var prerequisiteTask: String = js.native
    
    def saveToStream(stream: File): Unit = js.native
    def saveToStream(stream: MemoryStream): Unit = js.native
    
    def saveToTable(table: DataSet): Unit = js.native
    
    val scheduled: js.Date = js.native
    
    var scriptURI: String | Double = js.native
    
    val started: js.Date = js.native
    
    val status: String = js.native
    
    val statusKey: Double = js.native
    
    val userKey: Double = js.native
    
    var weekDay: Double = js.native
  }
  
  type MemoryStream = typings.nginstackEngine.memoryStreamMod.^
}
