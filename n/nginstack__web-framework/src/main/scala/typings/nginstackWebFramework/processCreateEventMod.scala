package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processCreateEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/process/ProcessCreateEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ProcessCreateEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var process: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/process/ProcessCreateEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ProcessCreateEvent extends StObject {
    
    var process: Any
  }
  object ProcessCreateEvent {
    
    inline def apply(process: Any): ProcessCreateEvent = {
      val __obj = js.Dynamic.literal(process = process.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessCreateEvent]
    }
    
    extension [Self <: ProcessCreateEvent](x: Self) {
      
      inline def setProcess(value: Any): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    }
  }
}
