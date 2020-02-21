package typings.octokitRest.mod.Octokit

import typings.octokitRest.octokitRestStrings.issue
import typings.octokitRest.octokitRestStrings.organization
import typings.octokitRest.octokitRestStrings.pull_request
import typings.octokitRest.octokitRestStrings.repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetContextForUserParams extends js.Object {
  /**
    * Uses the ID for the `subject_type` you specified. **Required** when using `subject_type`.
    */
  var subject_id: js.UndefOr[String] = js.undefined
  /**
    * Identifies which additional information you'd like to receive about the person's hovercard. Can be `organization`, `repository`, `issue`, `pull_request`. **Required** when using `subject_id`.
    */
  var subject_type: js.UndefOr[organization | repository | issue | pull_request] = js.undefined
  var username: String
}

object UsersGetContextForUserParams {
  @scala.inline
  def apply(
    username: String,
    subject_id: String = null,
    subject_type: organization | repository | issue | pull_request = null
  ): UsersGetContextForUserParams = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    if (subject_id != null) __obj.updateDynamic("subject_id")(subject_id.asInstanceOf[js.Any])
    if (subject_type != null) __obj.updateDynamic("subject_type")(subject_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetContextForUserParams]
  }
}

