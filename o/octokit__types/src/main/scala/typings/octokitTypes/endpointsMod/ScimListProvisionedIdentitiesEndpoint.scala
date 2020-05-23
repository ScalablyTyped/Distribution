package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScimListProvisionedIdentitiesEndpoint extends js.Object {
  /**
    * Used for pagination: the number of results to return.
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Filters results using the equals query parameter operator (`eq`). You can filter results that are equal to `id`, `userName`, `emails`, and `external_id`. For example, to search for an identity with the `userName` Octocat, you would use this query: `?filter=userName%20eq%20\"Octocat\"`.
    */
  var filter: js.UndefOr[String] = js.undefined
  @JSName("org")
  var org_ : String
  /**
    * Used for pagination: the index of the first result to return.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
}

object ScimListProvisionedIdentitiesEndpoint {
  @scala.inline
  def apply(
    org_ : String,
    count: js.UndefOr[Double] = js.undefined,
    filter: String = null,
    startIndex: js.UndefOr[Double] = js.undefined
  ): ScimListProvisionedIdentitiesEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScimListProvisionedIdentitiesEndpoint]
  }
}

