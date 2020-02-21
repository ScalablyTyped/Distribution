package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerRepoSource extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var source: AnonType
  @JSName("source.branch")
  var sourceDotbranch: AnonEnum
  @JSName("source.path")
  var sourceDotpath: AnonType
}

object AnonOwnerRepoSource {
  @scala.inline
  def apply(
    owner: AnonRequired,
    repo: AnonRequired,
    source: AnonType,
    sourceDotbranch: AnonEnum,
    sourceDotpath: AnonType
  ): AnonOwnerRepoSource = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("source.branch")(sourceDotbranch.asInstanceOf[js.Any])
    __obj.updateDynamic("source.path")(sourceDotpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOwnerRepoSource]
  }
}

