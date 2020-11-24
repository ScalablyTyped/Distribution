package typings.nodeSnap7.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiVarsWriteResult extends js.Object {
  
  var Result: Double = js.native
}
object MultiVarsWriteResult {
  
  @scala.inline
  def apply(Result: Double): MultiVarsWriteResult = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarsWriteResult]
  }
  
  @scala.inline
  implicit class MultiVarsWriteResultOps[Self <: MultiVarsWriteResult] (val x: Self) extends AnyVal {
    
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
    def setResult(value: Double): Self = this.set("Result", value.asInstanceOf[js.Any])
  }
}
