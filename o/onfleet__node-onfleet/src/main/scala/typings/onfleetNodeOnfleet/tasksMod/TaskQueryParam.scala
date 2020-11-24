package typings.onfleetNodeOnfleet.tasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskQueryParam extends js.Object {
  
  var completeAfterAfter: js.UndefOr[Double] = js.native
  
  var completeBeforeBefore: js.UndefOr[Double] = js.native
  
  var dependencies: js.UndefOr[String] = js.native
  
  var from: Double = js.native
  
  var lastId: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[Double] = js.native
  
  var to: js.UndefOr[Double] = js.native
  
  var worker: js.UndefOr[String] = js.native
}
object TaskQueryParam {
  
  @scala.inline
  def apply(from: Double): TaskQueryParam = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskQueryParam]
  }
  
  @scala.inline
  implicit class TaskQueryParamOps[Self <: TaskQueryParam] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteAfterAfter(value: Double): Self = this.set("completeAfterAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleteAfterAfter: Self = this.set("completeAfterAfter", js.undefined)
    
    @scala.inline
    def setCompleteBeforeBefore(value: Double): Self = this.set("completeBeforeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleteBeforeBefore: Self = this.set("completeBeforeBefore", js.undefined)
    
    @scala.inline
    def setDependencies(value: String): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setLastId(value: String): Self = this.set("lastId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastId: Self = this.set("lastId", js.undefined)
    
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setWorker(value: String): Self = this.set("worker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorker: Self = this.set("worker", js.undefined)
  }
}
