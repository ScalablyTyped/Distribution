package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateStatusEndpoint extends js.Object {
  var context: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  var sha: String
  var state: String
  var target_url: js.UndefOr[String] = js.undefined
}

object ReposCreateStatusEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    sha: String,
    state: String,
    context: String = null,
    description: String = null,
    target_url: String = null
  ): ReposCreateStatusEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, sha = sha, state = state)
    if (context != null) __obj.updateDynamic("context")(context)
    if (description != null) __obj.updateDynamic("description")(description)
    if (target_url != null) __obj.updateDynamic("target_url")(target_url)
    __obj.asInstanceOf[ReposCreateStatusEndpoint]
  }
}

