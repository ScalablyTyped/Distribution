package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefGridFieldEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/GridFieldEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GridFieldEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var grid: Grid = js.native
    
    /* CompleteClass */
    var process: Process = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/GridFieldEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Grid = typings.nginstackWebFramework.libGridGridMod.^
  
  trait GridFieldEvent extends StObject {
    
    var grid: Grid
    
    var process: Process
  }
  object GridFieldEvent {
    
    inline def apply(grid: Grid, process: Process): GridFieldEvent = {
      val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridFieldEvent]
    }
    
    extension [Self <: GridFieldEvent](x: Self) {
      
      inline def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: Process): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    }
  }
  
  type Process = typings.nginstackWebFramework.libProcessProcessMod.^
}
