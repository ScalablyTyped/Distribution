package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateUsingTemplateEndpoint extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var owner: js.UndefOr[String] = js.undefined
  var `private`: js.UndefOr[Boolean] = js.undefined
  var template_owner: String
  var template_repo: String
}

object ReposCreateUsingTemplateEndpoint {
  @scala.inline
  def apply(
    name: String,
    template_owner: String,
    template_repo: String,
    description: String = null,
    owner: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined
  ): ReposCreateUsingTemplateEndpoint = {
    val __obj = js.Dynamic.literal(name = name, template_owner = template_owner, template_repo = template_repo)
    if (description != null) __obj.updateDynamic("description")(description)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[ReposCreateUsingTemplateEndpoint]
  }
}

