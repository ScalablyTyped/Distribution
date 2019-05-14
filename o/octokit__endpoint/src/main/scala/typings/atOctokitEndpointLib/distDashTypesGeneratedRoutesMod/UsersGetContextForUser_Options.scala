package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetContextForUser_Options extends js.Object {
  var subject_id: js.UndefOr[java.lang.String] = js.undefined
  var subject_type: js.UndefOr[java.lang.String] = js.undefined
  var username: java.lang.String
}

object UsersGetContextForUser_Options {
  @scala.inline
  def apply(
    username: java.lang.String,
    subject_id: java.lang.String = null,
    subject_type: java.lang.String = null
  ): UsersGetContextForUser_Options = {
    val __obj = js.Dynamic.literal(username = username)
    if (subject_id != null) __obj.updateDynamic("subject_id")(subject_id)
    if (subject_type != null) __obj.updateDynamic("subject_type")(subject_type)
    __obj.asInstanceOf[UsersGetContextForUser_Options]
  }
}

