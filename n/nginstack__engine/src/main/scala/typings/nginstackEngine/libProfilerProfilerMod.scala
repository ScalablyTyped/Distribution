package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProfilerProfilerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/profiler/Profiler", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Profiler
  @JSImport("@nginstack/engine/lib/profiler/Profiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): Profiler = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Profiler]
  
  @js.native
  trait Profiler extends StObject {
    
    var enabled: Boolean = js.native
    
    def endOperation(): Unit = js.native
    def endOperation(details: String): Unit = js.native
    
    def excludeFunction(func: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    
    var forcedLog: Boolean = js.native
    
    def getHtmlStatistics(): String = js.native
    
    def getTxtStatistics(): String = js.native
    
    def startOperation(name: String): Unit = js.native
    def startOperation(name: String, details: String): Unit = js.native
    def startOperation(name: String, details: String, sumInteractions: Boolean): Unit = js.native
    def startOperation(name: String, details: Unit, sumInteractions: Boolean): Unit = js.native
  }
}
