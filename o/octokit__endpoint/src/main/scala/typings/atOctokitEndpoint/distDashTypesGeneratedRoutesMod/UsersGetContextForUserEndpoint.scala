package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetContextForUserEndpoint extends js.Object {
  var subject_id: js.UndefOr[String] = js.undefined
  var subject_type: js.UndefOr[String] = js.undefined
  var username: String
}

object UsersGetContextForUserEndpoint {
  @scala.inline
  def apply(username: String, subject_id: String = null, subject_type: String = null): UsersGetContextForUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username)
    if (subject_id != null) __obj.updateDynamic("subject_id")(subject_id)
    if (subject_type != null) __obj.updateDynamic("subject_type")(subject_type)
    __obj.asInstanceOf[UsersGetContextForUserEndpoint]
  }
}

