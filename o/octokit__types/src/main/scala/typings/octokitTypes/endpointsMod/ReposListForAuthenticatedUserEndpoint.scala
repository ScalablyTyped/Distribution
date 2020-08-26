package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`private`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.asc
import typings.octokitTypes.octokitTypesStrings.created
import typings.octokitTypes.octokitTypesStrings.desc
import typings.octokitTypes.octokitTypesStrings.full_name
import typings.octokitTypes.octokitTypesStrings.member
import typings.octokitTypes.octokitTypesStrings.owner
import typings.octokitTypes.octokitTypesStrings.public
import typings.octokitTypes.octokitTypesStrings.pushed
import typings.octokitTypes.octokitTypesStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposListForAuthenticatedUserEndpoint extends js.Object {
  /**
    * Comma-separated list of values. Can include:
    * \* `owner`: Repositories that are owned by the authenticated user.
    * \* `collaborator`: Repositories that the user has been added to as a collaborator.
    * \* `organization_member`: Repositories that the user has access to through being a member of an organization. This includes every repository on every team that the user is on.
    */
  var affiliation: js.UndefOr[String] = js.native
  /**
    * Can be one of `asc` or `desc`. Default: `asc` when using `full_name`, otherwise `desc`
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
  /**
    * Can be one of `created`, `updated`, `pushed`, `full_name`.
    */
  var sort: js.UndefOr[created | updated | pushed | full_name] = js.native
  /**
    * Can be one of `all`, `owner`, `public`, `private`, `member`. Default: `all`
    *
    * Will cause a `422` error if used in the same request as **visibility** or **affiliation**. Will cause a `422` error if used in the same request as **visibility** or **affiliation**.
    */
  var `type`: js.UndefOr[all | owner | public | `private` | member] = js.native
  /**
    * Can be one of `all`, `public`, or `private`.
    */
  var visibility: js.UndefOr[all | public | `private`] = js.native
}

object ReposListForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(): ReposListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposListForAuthenticatedUserEndpoint]
  }
  @scala.inline
  implicit class ReposListForAuthenticatedUserEndpointOps[Self <: ReposListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
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
    def setAffiliation(value: String): Self = this.set("affiliation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffiliation: Self = this.set("affiliation", js.undefined)
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
    def setSort(value: created | updated | pushed | full_name): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setType(value: all | owner | public | `private` | member): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisibility(value: all | public | `private`): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

