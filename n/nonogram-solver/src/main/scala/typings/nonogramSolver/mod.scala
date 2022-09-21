package typings.nonogramSolver

import typings.nonogramSolver.anon.RequiredInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filename: String): Result = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  @JSImport("nonogram-solver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nonogram-solver", "Puzzle")
  @js.native
  open class Puzzle protected () extends StObject {
    def this(data: String) = this()
    def this(data: Input) = this()
    
    var columnHints: js.Array[js.Array[Double]] = js.native
    
    var height: Double = js.native
    
    def `import`(puzzle: Puzzle): Unit = js.native
    
    val isFinished: Boolean = js.native
    
    val isSolved: Boolean = js.native
    
    var rowHints: js.Array[js.Array[Double]] = js.native
    
    var snapshot: js.Array[Double] = js.native
    
    val svg: String = js.native
    
    def toJSON(): RequiredInput = js.native
    
    var width: Double = js.native
  }
  
  trait Input extends StObject {
    
    var columns: js.Array[js.Array[Double]]
    
    var content: js.UndefOr[js.Array[State]] = js.undefined
    
    var rows: js.Array[js.Array[Double]]
  }
  object Input {
    
    inline def apply(columns: js.Array[js.Array[Double]], rows: js.Array[js.Array[Double]]): Input = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    extension [Self <: Input](x: Self) {
      
      inline def setColumns(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setContent(value: js.Array[State]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: State*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setRows(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  trait Result extends StObject {
    
    var puzzle: Puzzle
    
    var status: State
  }
  object Result {
    
    inline def apply(puzzle: Puzzle, status: State): Result = {
      val __obj = js.Dynamic.literal(puzzle = puzzle.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setPuzzle(value: Puzzle): Self = StObject.set(x, "puzzle", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: State): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nonogramSolver.nonogramSolverNumbers.`0`
    - typings.nonogramSolver.nonogramSolverNumbers.`1`
    - typings.nonogramSolver.nonogramSolverNumbers.`-1`
  */
  trait State extends StObject
  object State {
    
    inline def `-1`: typings.nonogramSolver.nonogramSolverNumbers.`-1` = -1.asInstanceOf[typings.nonogramSolver.nonogramSolverNumbers.`-1`]
    
    inline def `0`: typings.nonogramSolver.nonogramSolverNumbers.`0` = 0.asInstanceOf[typings.nonogramSolver.nonogramSolverNumbers.`0`]
    
    inline def `1`: typings.nonogramSolver.nonogramSolverNumbers.`1` = 1.asInstanceOf[typings.nonogramSolver.nonogramSolverNumbers.`1`]
  }
}
