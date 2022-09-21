package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridFieldEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/GridFieldEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GridFieldEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var grid: Any = js.native
    
    /* CompleteClass */
    var process: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/GridFieldEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GridFieldEvent extends StObject {
    
    var grid: Any
    
    var process: Any
  }
  object GridFieldEvent {
    
    inline def apply(grid: Any, process: Any): GridFieldEvent = {
      val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridFieldEvent]
    }
    
    extension [Self <: GridFieldEvent](x: Self) {
      
      inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: Any): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    }
  }
}
