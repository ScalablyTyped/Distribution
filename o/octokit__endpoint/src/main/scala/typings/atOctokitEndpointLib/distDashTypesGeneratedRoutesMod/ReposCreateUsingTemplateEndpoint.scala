package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateUsingTemplateEndpoint extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var owner: js.UndefOr[java.lang.String] = js.undefined
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var template_owner: java.lang.String
  var template_repo: java.lang.String
}

object ReposCreateUsingTemplateEndpoint {
  @scala.inline
  def apply(
    name: java.lang.String,
    template_owner: java.lang.String,
    template_repo: java.lang.String,
    description: java.lang.String = null,
    owner: java.lang.String = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined
  ): ReposCreateUsingTemplateEndpoint = {
    val __obj = js.Dynamic.literal(name = name, template_owner = template_owner, template_repo = template_repo)
    if (description != null) __obj.updateDynamic("description")(description)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[ReposCreateUsingTemplateEndpoint]
  }
}

