package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/DataEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var data: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/DataEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DataEvent extends StObject {
    
    var data: Any
  }
  object DataEvent {
    
    inline def apply(data: Any): DataEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataEvent]
    }
    
    extension [Self <: DataEvent](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
