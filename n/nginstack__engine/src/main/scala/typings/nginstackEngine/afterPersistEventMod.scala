package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object afterPersistEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/AfterPersistEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AfterPersistEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var version: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/AfterPersistEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AfterPersistEvent extends StObject {
    
    var version: Double
  }
  object AfterPersistEvent {
    
    inline def apply(version: Double): AfterPersistEvent = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterPersistEvent]
    }
    
    extension [Self <: AfterPersistEvent](x: Self) {
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
