package typings.nonogramSolver

import typings.nonogramSolver.anon.RequiredInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nonogram-solver", JSImport.Namespace)
  @js.native
  def apply(filename: String): Result = js.native
  
  @JSImport("nonogram-solver", "Puzzle")
  @js.native
  class Puzzle protected () extends StObject {
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
  
  @js.native
  trait Input extends StObject {
    
    var columns: js.Array[js.Array[Double]] = js.native
    
    var content: js.UndefOr[js.Array[State]] = js.native
    
    var rows: js.Array[js.Array[Double]] = js.native
  }
  object Input {
    
    @scala.inline
    def apply(columns: js.Array[js.Array[Double]], rows: js.Array[js.Array[Double]]): Input = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: js.Array[State]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContentVarargs(value: State*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setRows(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var puzzle: Puzzle = js.native
    
    var status: State = js.native
  }
  object Result {
    
    @scala.inline
    def apply(puzzle: Puzzle, status: State): Result = {
      val __obj = js.Dynamic.literal(puzzle = puzzle.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPuzzle(value: Puzzle): Self = StObject.set(x, "puzzle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: State): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nonogramSolver.nonogramSolverNumbers.`0`
    - typings.nonogramSolver.nonogramSolverNumbers.`1`
    - typings.nonogramSolver.nonogramSolverNumbers.`-1`
  */
  trait State extends StObject
  object State {
    
    @scala.inline
    def `-1`: typings.nonogramSolver.nonogramSolverNumbers.`-1` = -1.asInstanceOf[typings.nonogramSolver.nonogramSolverNumbers.`-1`]
    
    @scala.inline
    def `0`: typings.nonogramSolver.nonogramSolverNumbers.`0` = 0.asInstanceOf[typings.nonogramSolver.nonogramSolverNumbers.`0`]
    
    @scala.inline
    def `1`: typings.nonogramSolver.nonogramSolverNumbers.`1` = 1.asInstanceOf[typings.nonogramSolver.nonogramSolverNumbers.`1`]
  }
}
