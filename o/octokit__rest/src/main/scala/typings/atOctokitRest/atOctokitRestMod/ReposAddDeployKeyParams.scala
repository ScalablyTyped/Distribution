package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddDeployKeyParams extends js.Object {
  /**
    * The contents of the key.
    */
  var key: String
  var owner: String
  /**
    * If `true`, the key will only be able to read repository contents. Otherwise, the key will be able to read and write.
    *
    * Deploy keys with write access can perform the same actions as an organization member with admin access, or a collaborator on a personal repository. For more information, see "[Repository permission levels for an organization](https://help.github.com/articles/repository-permission-levels-for-an-organization/)" and "[Permission levels for a user account repository](https://help.github.com/articles/permission-levels-for-a-user-account-repository/)."
    */
  var read_only: js.UndefOr[Boolean] = js.undefined
  var repo: String
  /**
    * A name for the key.
    */
  var title: js.UndefOr[String] = js.undefined
}

object ReposAddDeployKeyParams {
  @scala.inline
  def apply(
    key: String,
    owner: String,
    repo: String,
    read_only: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): ReposAddDeployKeyParams = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(read_only)) __obj.updateDynamic("read_only")(read_only.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAddDeployKeyParams]
  }
}

