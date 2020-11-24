package typings.nonogramSolver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
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
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPuzzle(value: Puzzle): Self = this.set("puzzle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: State): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
