package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateUsingTemplateParams extends js.Object {
  /**
    * A short description of the new repository.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The name of the new repository.
    */
  var name: String
  /**
    * The organization or person who will own the new repository. To create a new repository in an organization, the authenticated user must be a member of the specified organization.
    */
  var owner: js.UndefOr[String] = js.undefined
  /**
    * Either `true` to create a new private repository or `false` to create a new public one.
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
  var template_owner: String
  var template_repo: String
}

object ReposCreateUsingTemplateParams {
  @scala.inline
  def apply(
    name: String,
    template_owner: String,
    template_repo: String,
    description: String = null,
    owner: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined
  ): ReposCreateUsingTemplateParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], template_owner = template_owner.asInstanceOf[js.Any], template_repo = template_repo.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateUsingTemplateParams]
  }
}

