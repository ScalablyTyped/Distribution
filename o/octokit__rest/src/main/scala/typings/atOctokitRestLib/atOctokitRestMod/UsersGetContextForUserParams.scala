package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetContextForUserParams extends js.Object {
  /**
    * Uses the ID for the `subject_type` you specified. **Required** when using `subject_type`.
    */
  var subject_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifies which additional information you'd like to receive about the person's hovercard. Can be `organization`, `repository`, `issue`, `pull_request`. **Required** when using `subject_id`.
    */
  var subject_type: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.organization | atOctokitRestLib.atOctokitRestLibStrings.repository | atOctokitRestLib.atOctokitRestLibStrings.issue | atOctokitRestLib.atOctokitRestLibStrings.pull_request
  ] = js.undefined
  var username: java.lang.String
}

object UsersGetContextForUserParams {
  @scala.inline
  def apply(
    username: java.lang.String,
    subject_id: java.lang.String = null,
    subject_type: atOctokitRestLib.atOctokitRestLibStrings.organization | atOctokitRestLib.atOctokitRestLibStrings.repository | atOctokitRestLib.atOctokitRestLibStrings.issue | atOctokitRestLib.atOctokitRestLibStrings.pull_request = null
  ): UsersGetContextForUserParams = {
    val __obj = js.Dynamic.literal(username = username)
    if (subject_id != null) __obj.updateDynamic("subject_id")(subject_id)
    if (subject_type != null) __obj.updateDynamic("subject_type")(subject_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetContextForUserParams]
  }
}

