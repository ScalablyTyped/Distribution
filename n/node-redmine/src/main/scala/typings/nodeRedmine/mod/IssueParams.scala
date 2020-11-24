package typings.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssueParams extends js.Object {
  
  var assigned_to_id: js.UndefOr[Double] = js.native
  
  var category_id: js.UndefOr[Double] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var notes: js.UndefOr[String] = js.native
  
  var parent_issue_id: js.UndefOr[Double] = js.native
  
  var priority_id: js.UndefOr[Double] = js.native
  
  var project_id: js.UndefOr[Double] = js.native
  
  var status_id: js.UndefOr[Double] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var tracker_id: js.UndefOr[Double] = js.native
  
  var uploads: js.UndefOr[js.Array[UploadRecord]] = js.native
}
object IssueParams {
  
  @scala.inline
  def apply(): IssueParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssueParams]
  }
  
  @scala.inline
  implicit class IssueParamsOps[Self <: IssueParams] (val x: Self) extends AnyVal {
    
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
    def setAssigned_to_id(value: Double): Self = this.set("assigned_to_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssigned_to_id: Self = this.set("assigned_to_id", js.undefined)
    
    @scala.inline
    def setCategory_id(value: Double): Self = this.set("category_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory_id: Self = this.set("category_id", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setParent_issue_id(value: Double): Self = this.set("parent_issue_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent_issue_id: Self = this.set("parent_issue_id", js.undefined)
    
    @scala.inline
    def setPriority_id(value: Double): Self = this.set("priority_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority_id: Self = this.set("priority_id", js.undefined)
    
    @scala.inline
    def setProject_id(value: Double): Self = this.set("project_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject_id: Self = this.set("project_id", js.undefined)
    
    @scala.inline
    def setStatus_id(value: Double): Self = this.set("status_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus_id: Self = this.set("status_id", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setTracker_id(value: Double): Self = this.set("tracker_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracker_id: Self = this.set("tracker_id", js.undefined)
    
    @scala.inline
    def setUploadsVarargs(value: UploadRecord*): Self = this.set("uploads", js.Array(value :_*))
    
    @scala.inline
    def setUploads(value: js.Array[UploadRecord]): Self = this.set("uploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploads: Self = this.set("uploads", js.undefined)
  }
}
