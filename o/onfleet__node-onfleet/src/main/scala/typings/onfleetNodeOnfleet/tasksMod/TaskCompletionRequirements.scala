package typings.onfleetNodeOnfleet.tasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskCompletionRequirements extends js.Object {
  
  var minimumAge: js.UndefOr[Double] = js.native
  
  var notes: js.UndefOr[Boolean] = js.native
  
  var photo: js.UndefOr[Boolean] = js.native
  
  var signature: js.UndefOr[Boolean] = js.native
}
object TaskCompletionRequirements {
  
  @scala.inline
  def apply(): TaskCompletionRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskCompletionRequirements]
  }
  
  @scala.inline
  implicit class TaskCompletionRequirementsOps[Self <: TaskCompletionRequirements] (val x: Self) extends AnyVal {
    
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
    def setMinimumAge(value: Double): Self = this.set("minimumAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumAge: Self = this.set("minimumAge", js.undefined)
    
    @scala.inline
    def setNotes(value: Boolean): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setPhoto(value: Boolean): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    
    @scala.inline
    def setSignature(value: Boolean): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
}
