package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefGridEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/GridEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GridEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var grid: Grid = js.native
    
    /* CompleteClass */
    var masterData: DataSet = js.native
    
    /* CompleteClass */
    var masterGrid: Grid = js.native
    
    /* CompleteClass */
    var process: Process = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/GridEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  type Grid = typings.nginstackWebFramework.libGridGridMod.^
  
  trait GridEvent extends StObject {
    
    var grid: Grid
    
    var masterData: DataSet
    
    var masterGrid: Grid
    
    var process: Process
  }
  object GridEvent {
    
    inline def apply(grid: Grid, masterData: DataSet, masterGrid: Grid, process: Process): GridEvent = {
      val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], masterData = masterData.asInstanceOf[js.Any], masterGrid = masterGrid.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridEvent]
    }
    
    extension [Self <: GridEvent](x: Self) {
      
      inline def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setMasterData(value: DataSet): Self = StObject.set(x, "masterData", value.asInstanceOf[js.Any])
      
      inline def setMasterGrid(value: Grid): Self = StObject.set(x, "masterGrid", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: Process): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    }
  }
  
  type Process = typings.nginstackWebFramework.libProcessProcessMod.^
}
