package typings.nonogramSolver

import typings.nonogramSolver.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<nonogram-solver.nonogram-solver.Input> */
  trait RequiredInput extends StObject {
    
    var columns: js.Array[js.Array[Double]]
    
    var content: js.Array[State]
    
    var rows: js.Array[js.Array[Double]]
  }
  object RequiredInput {
    
    inline def apply(columns: js.Array[js.Array[Double]], content: js.Array[State], rows: js.Array[js.Array[Double]]): RequiredInput = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredInput] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setContent(value: js.Array[State]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: State*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setRows(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
}
