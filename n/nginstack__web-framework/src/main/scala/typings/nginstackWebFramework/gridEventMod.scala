package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/GridEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GridEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var grid: Any = js.native
    
    /* CompleteClass */
    var masterData: Any = js.native
    
    /* CompleteClass */
    var masterGrid: Any = js.native
    
    /* CompleteClass */
    var process: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/GridEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GridEvent extends StObject {
    
    var grid: Any
    
    var masterData: Any
    
    var masterGrid: Any
    
    var process: Any
  }
  object GridEvent {
    
    inline def apply(grid: Any, masterData: Any, masterGrid: Any, process: Any): GridEvent = {
      val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], masterData = masterData.asInstanceOf[js.Any], masterGrid = masterGrid.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridEvent]
    }
    
    extension [Self <: GridEvent](x: Self) {
      
      inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setMasterData(value: Any): Self = StObject.set(x, "masterData", value.asInstanceOf[js.Any])
      
      inline def setMasterGrid(value: Any): Self = StObject.set(x, "masterGrid", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: Any): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    }
  }
}
