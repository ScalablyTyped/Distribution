package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.asc
import typings.octokitTypes.octokitTypesStrings.created
import typings.octokitTypes.octokitTypesStrings.desc
import typings.octokitTypes.octokitTypesStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsListAccountsForPlanEndpoint extends js.Object {
  /**
    * To return the oldest accounts first, set to `asc`. Can be one of `asc` or `desc`. Ignored without the `sort` parameter.
    */
  var direction: js.UndefOr[asc | desc] = js.native
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  var plan_id: Double = js.native
  /**
    * Sorts the GitHub accounts by the date they were created or last updated. Can be one of `created` or `updated`.
    */
  var sort: js.UndefOr[created | updated] = js.native
}

object AppsListAccountsForPlanEndpoint {
  @scala.inline
  def apply(plan_id: Double): AppsListAccountsForPlanEndpoint = {
    val __obj = js.Dynamic.literal(plan_id = plan_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListAccountsForPlanEndpoint]
  }
  @scala.inline
  implicit class AppsListAccountsForPlanEndpointOps[Self <: AppsListAccountsForPlanEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlan_id(value: Double): Self = this.set("plan_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: asc | desc): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPer_page(value: Double): Self = this.set("per_page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePer_page: Self = this.set("per_page", js.undefined)
    @scala.inline
    def setSort(value: created | updated): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

