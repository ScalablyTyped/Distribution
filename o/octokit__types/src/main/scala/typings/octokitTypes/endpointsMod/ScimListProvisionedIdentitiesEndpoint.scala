package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScimListProvisionedIdentitiesEndpoint extends js.Object {
  /**
    * Used for pagination: the number of results to return.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Filters results using the equals query parameter operator (`eq`). You can filter results that are equal to `id`, `userName`, `emails`, and `external_id`. For example, to search for an identity with the `userName` Octocat, you would use this query:
    *
    * `?filter=userName%20eq%20\"Octocat\"`.
    *
    * To filter results for for the identity with the email `octocat@github.com`, you would use this query:
    *
    * `?filter=emails%20eq%20\"octocat@github.com\"`.
    */
  var filter: js.UndefOr[String] = js.native
  @JSName("org")
  var org_ : String = js.native
  /**
    * Used for pagination: the index of the first result to return.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object ScimListProvisionedIdentitiesEndpoint {
  @scala.inline
  def apply(org_ : String): ScimListProvisionedIdentitiesEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimListProvisionedIdentitiesEndpoint]
  }
  @scala.inline
  implicit class ScimListProvisionedIdentitiesEndpointOps[Self <: ScimListProvisionedIdentitiesEndpoint] (val x: Self) extends AnyVal {
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
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
  
}

