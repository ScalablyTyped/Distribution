package typings.nginstackEngine

import typings.nginstackEngine.anon.Realm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRunnerScriptRunnerMod {
  
  inline def apply(fileId: String): Unit = ^.asInstanceOf[js.Dynamic].apply(fileId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(fileId: String, options: Realm): Unit = (^.asInstanceOf[js.Dynamic].apply(fileId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(fileId: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(fileId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(fileId: Double, options: Realm): Unit = (^.asInstanceOf[js.Dynamic].apply(fileId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/runner/ScriptRunner", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ScriptRunner {
    def this(fileId: String) = this()
    def this(fileId: Double) = this()
    def this(fileId: String, options: Realm) = this()
    def this(fileId: Double, options: Realm) = this()
  }
  @JSImport("@nginstack/engine/lib/runner/ScriptRunner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  @js.native
  trait ScriptRunner extends StObject {
    
    def applyFunction(functionName: String): DataSet | Double | js.Date | String | Boolean = js.native
    def applyFunction(functionName: String, args: js.Array[Any]): DataSet | Double | js.Date | String | Boolean = js.native
    
    def callFunction(functionName: String): DataSet | Double | js.Date | String | Boolean = js.native
    def callFunction(functionName: String, params: js.Array[Any]): DataSet | Double | js.Date | String | Boolean = js.native
    
    def clear(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def evaluate(expr: Any): DataSet | Double | js.Date | String | Boolean = js.native
    
    def login(userId: String, password: String): Boolean = js.native
    
    def loginByAuthToken(id: Any): Unit = js.native
    
    def loginBySession(session: Session): Unit = js.native
    
    def publishGlobalProperty(name: String, value: String): Unit = js.native
    def publishGlobalProperty(name: String, value: js.Date): Unit = js.native
    def publishGlobalProperty(name: String, value: Boolean): Unit = js.native
    def publishGlobalProperty(name: String, value: Double): Unit = js.native
    def publishGlobalProperty(name: String, value: DataSet): Unit = js.native
    
    def readGlobalProperty(name: String): DataSet | Double | js.Date | String | Boolean = js.native
    
    def run(): Any = js.native
    
    var sessionId: String = js.native
    
    var trackingId: String = js.native
  }
  
  type Session = typings.nginstackEngine.libSessionSessionMod.^
}
