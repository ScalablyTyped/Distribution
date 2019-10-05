package typings.mfiles

import typings.mfiles.MFiles.MFScheduledJobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJobOutputInfo extends js.Object {
  var ID: Double
  var JobType: MFScheduledJobType
  var Message: String
}

object IScheduledJobOutputInfo {
  @scala.inline
  def apply(ID: Double, JobType: MFScheduledJobType, Message: String): IScheduledJobOutputInfo = {
    val __obj = js.Dynamic.literal(ID = ID, JobType = JobType, Message = Message)
  
    __obj.asInstanceOf[IScheduledJobOutputInfo]
  }
}

