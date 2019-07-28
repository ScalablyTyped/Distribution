package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAccountIsAssociatedWithAnyParams extends js.Object {
  var account_id: Double
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
}

object AppsCheckAccountIsAssociatedWithAnyParams {
  @scala.inline
  def apply(account_id: Double, page: Int | Double = null, per_page: Int | Double = null): AppsCheckAccountIsAssociatedWithAnyParams = {
    val __obj = js.Dynamic.literal(account_id = account_id)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyParams]
  }
}

