package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAccountIsAssociatedWithAnyStubbedEndpoint extends js.Object {
  var account_id: Double
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
}

object AppsCheckAccountIsAssociatedWithAnyStubbedEndpoint {
  @scala.inline
  def apply(account_id: Double, page: Int | Double = null, per_page: Int | Double = null): AppsCheckAccountIsAssociatedWithAnyStubbedEndpoint = {
    val __obj = js.Dynamic.literal(account_id = account_id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyStubbedEndpoint]
  }
}

