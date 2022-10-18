package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcessProcessEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/process/ProcessEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ProcessEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var process: Process = js.native
  }
  @JSImport("@nginstack/web-framework/lib/process/ProcessEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Process = typings.nginstackWebFramework.libProcessProcessMod.^
  
  trait ProcessEvent extends StObject {
    
    var process: Process
  }
  object ProcessEvent {
    
    inline def apply(process: Process): ProcessEvent = {
      val __obj = js.Dynamic.literal(process = process.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessEvent]
    }
    
    extension [Self <: ProcessEvent](x: Self) {
      
      inline def setProcess(value: Process): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    }
  }
}
