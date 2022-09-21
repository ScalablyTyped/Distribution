package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMonitorMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/progress/ProgressMonitor", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ProgressMonitor {
    
    /* CompleteClass */
    override def getTaskProgressStackUpdate(statusArray: Any, threadId: Double): Boolean = js.native
  }
  @JSImport("@nginstack/engine/lib/progress/ProgressMonitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ProgressMonitor extends StObject {
    
    def getTaskProgressStackUpdate(statusArray: Any, threadId: Double): Boolean
  }
  object ProgressMonitor {
    
    inline def apply(getTaskProgressStackUpdate: (Any, Double) => Boolean): ProgressMonitor = {
      val __obj = js.Dynamic.literal(getTaskProgressStackUpdate = js.Any.fromFunction2(getTaskProgressStackUpdate))
      __obj.asInstanceOf[ProgressMonitor]
    }
    
    extension [Self <: ProgressMonitor](x: Self) {
      
      inline def setGetTaskProgressStackUpdate(value: (Any, Double) => Boolean): Self = StObject.set(x, "getTaskProgressStackUpdate", js.Any.fromFunction2(value))
    }
  }
}
