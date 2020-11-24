package typings.mobxTask.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskOptions[A /* <: js.Array[_] */, R] extends js.Object {
  
  var args: js.UndefOr[A] = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var result: js.UndefOr[WithoutPromise[R]] = js.native
  
  var state: js.UndefOr[TaskStatus] = js.native
  
  var swallow: js.UndefOr[Boolean] = js.native
}
object TaskOptions {
  
  @scala.inline
  def apply[A /* <: js.Array[_] */, R](): TaskOptions[A, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskOptions[A, R]]
  }
  
  @scala.inline
  implicit class TaskOptionsOps[Self <: TaskOptions[_, _], A /* <: js.Array[_] */, R] (val x: Self with (TaskOptions[A, R])) extends AnyVal {
    
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
    def setArgs(value: A): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setResult(value: WithoutPromise[R]): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setState(value: TaskStatus): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSwallow(value: Boolean): Self = this.set("swallow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwallow: Self = this.set("swallow", js.undefined)
  }
}
