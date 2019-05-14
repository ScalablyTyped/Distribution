package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateStatus_Options extends js.Object {
  var context: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var sha: java.lang.String
  var state: java.lang.String
  var target_url: js.UndefOr[java.lang.String] = js.undefined
}

object ReposCreateStatus_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    sha: java.lang.String,
    state: java.lang.String,
    context: java.lang.String = null,
    description: java.lang.String = null,
    target_url: java.lang.String = null
  ): ReposCreateStatus_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, sha = sha, state = state)
    if (context != null) __obj.updateDynamic("context")(context)
    if (description != null) __obj.updateDynamic("description")(description)
    if (target_url != null) __obj.updateDynamic("target_url")(target_url)
    __obj.asInstanceOf[ReposCreateStatus_Options]
  }
}

