package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsListGrantsEndpoint extends js.Object {
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
}

object OauthAuthorizationsListGrantsEndpoint {
  @scala.inline
  def apply(page: Int | Double = null, per_page: Int | Double = null): OauthAuthorizationsListGrantsEndpoint = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsListGrantsEndpoint]
  }
}

