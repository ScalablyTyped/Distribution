package typings.mobxTask.taskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskMatchProps[T1, T2, T3, A /* <: js.Array[_] */, R] extends js.Object {
  
  var pending: js.UndefOr[js.Function1[/* args */ A, T1]] = js.native
  
  var rejected: js.UndefOr[js.Function1[/* error */ js.Any, T2]] = js.native
  
  var resolved: js.UndefOr[js.Function1[/* result */ WithoutPromise[R], T3]] = js.native
}
object TaskMatchProps {
  
  @scala.inline
  def apply[T1, T2, T3, A /* <: js.Array[_] */, R](): TaskMatchProps[T1, T2, T3, A, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskMatchProps[T1, T2, T3, A, R]]
  }
  
  @scala.inline
  implicit class TaskMatchPropsOps[Self <: TaskMatchProps[_, _, _, _, _], T1, T2, T3, A /* <: js.Array[_] */, R] (val x: Self with (TaskMatchProps[T1, T2, T3, A, R])) extends AnyVal {
    
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
    def setPending(value: /* args */ A => T1): Self = this.set("pending", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
    
    @scala.inline
    def setRejected(value: /* error */ js.Any => T2): Self = this.set("rejected", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRejected: Self = this.set("rejected", js.undefined)
    
    @scala.inline
    def setResolved(value: /* result */ WithoutPromise[R] => T3): Self = this.set("resolved", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResolved: Self = this.set("resolved", js.undefined)
  }
}
