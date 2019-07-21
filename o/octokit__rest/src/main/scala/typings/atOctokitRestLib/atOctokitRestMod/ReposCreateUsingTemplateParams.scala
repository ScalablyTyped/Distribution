package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateUsingTemplateParams extends js.Object {
  /**
    * A short description of the new repository.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the new repository.
    */
  var name: java.lang.String
  /**
    * The organization or person who will own the new repository. To create a new repository in an organization, the authenticated user must be a member of the specified organization.
    */
  var owner: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Either `true` to create a new private repository or `false` to create a new public one.
    */
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var template_owner: java.lang.String
  var template_repo: java.lang.String
}

object ReposCreateUsingTemplateParams {
  @scala.inline
  def apply(
    name: java.lang.String,
    template_owner: java.lang.String,
    template_repo: java.lang.String,
    description: java.lang.String = null,
    owner: java.lang.String = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined
  ): ReposCreateUsingTemplateParams = {
    val __obj = js.Dynamic.literal(name = name, template_owner = template_owner, template_repo = template_repo)
    if (description != null) __obj.updateDynamic("description")(description)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[ReposCreateUsingTemplateParams]
  }
}

