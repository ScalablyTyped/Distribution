package typings.mfiles

import typings.mfiles.MFiles.MFScheduledJobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduledJobOutputInfo extends js.Object {
  
  var ID: Double = js.native
  
  var JobType: MFScheduledJobType = js.native
  
  var Message: String = js.native
}
object IScheduledJobOutputInfo {
  
  @scala.inline
  def apply(ID: Double, JobType: MFScheduledJobType, Message: String): IScheduledJobOutputInfo = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledJobOutputInfo]
  }
  
  @scala.inline
  implicit class IScheduledJobOutputInfoOps[Self <: IScheduledJobOutputInfo] (val x: Self) extends AnyVal {
    
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
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobType(value: MFScheduledJobType): Self = this.set("JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
  }
}
