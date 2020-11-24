package typings.numeric.anon

import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iact extends js.Object {
  
  var iact: Vector = js.native
  
  var iterations: Vector = js.native
  
  var message: String = js.native
  
  var solution: Vector = js.native
  
  var unconstrained_solution: Vector = js.native
  
  var value: Vector = js.native
}
object Iact {
  
  @scala.inline
  def apply(
    iact: Vector,
    iterations: Vector,
    message: String,
    solution: Vector,
    unconstrained_solution: Vector,
    value: Vector
  ): Iact = {
    val __obj = js.Dynamic.literal(iact = iact.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any], unconstrained_solution = unconstrained_solution.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iact]
  }
  
  @scala.inline
  implicit class IactOps[Self <: Iact] (val x: Self) extends AnyVal {
    
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
    def setIactVarargs(value: Double*): Self = this.set("iact", js.Array(value :_*))
    
    @scala.inline
    def setIact(value: Vector): Self = this.set("iact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsVarargs(value: Double*): Self = this.set("iterations", js.Array(value :_*))
    
    @scala.inline
    def setIterations(value: Vector): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionVarargs(value: Double*): Self = this.set("solution", js.Array(value :_*))
    
    @scala.inline
    def setSolution(value: Vector): Self = this.set("solution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnconstrained_solutionVarargs(value: Double*): Self = this.set("unconstrained_solution", js.Array(value :_*))
    
    @scala.inline
    def setUnconstrained_solution(value: Vector): Self = this.set("unconstrained_solution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Vector): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
