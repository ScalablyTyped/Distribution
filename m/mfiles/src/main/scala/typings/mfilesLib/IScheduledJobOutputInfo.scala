package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJobOutputInfo extends js.Object {
  var ID: scala.Double
  var JobType: mfilesLib.MFilesNs.MFScheduledJobType
  var Message: java.lang.String
}

object IScheduledJobOutputInfo {
  @scala.inline
  def apply(ID: scala.Double, JobType: mfilesLib.MFilesNs.MFScheduledJobType, Message: java.lang.String): IScheduledJobOutputInfo = {
    val __obj = js.Dynamic.literal(ID = ID, JobType = JobType, Message = Message)
  
    __obj.asInstanceOf[IScheduledJobOutputInfo]
  }
}

