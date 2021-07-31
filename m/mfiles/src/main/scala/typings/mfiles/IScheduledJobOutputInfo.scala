package typings.mfiles

import typings.mfiles.MFiles.MFScheduledJobType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScheduledJobOutputInfo extends StObject {
  
  var ID: Double
  
  var JobType: MFScheduledJobType
  
  var Message: String
}
object IScheduledJobOutputInfo {
  
  @scala.inline
  def apply(ID: Double, JobType: MFScheduledJobType, Message: String): IScheduledJobOutputInfo = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledJobOutputInfo]
  }
  
  @scala.inline
  implicit class IScheduledJobOutputInfoMutableBuilder[Self <: IScheduledJobOutputInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobType(value: MFScheduledJobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
  }
}
