package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubjectid extends js.Object {
  var subject_id: AnonType
  var subject_type: AnonEnum
  var username: AnonRequired
}

object AnonSubjectid {
  @scala.inline
  def apply(subject_id: AnonType, subject_type: AnonEnum, username: AnonRequired): AnonSubjectid = {
    val __obj = js.Dynamic.literal(subject_id = subject_id.asInstanceOf[js.Any], subject_type = subject_type.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSubjectid]
  }
}

