package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`12`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   ref  :string,   app_id ? :number,   check_name ? :string,   per_page ? :number,   page ? :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
trait ChecksListSuitesForRefEndpoint extends js.Object {
  /**
    * Filters check suites by GitHub App `id`.
    */
  var app_id: js.UndefOr[Double] = js.undefined
  /**
    * Filters checks suites by the name of the [check run](https://developer.github.com/v3/checks/runs/).
    */
  var check_name: js.UndefOr[String] = js.undefined
  var mediaType: `12`
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var ref: String
  var repo: String
}

object ChecksListSuitesForRefEndpoint {
  @scala.inline
  def apply(
    mediaType: `12`,
    owner: String,
    ref: String,
    repo: String,
    app_id: js.UndefOr[Double] = js.undefined,
    check_name: String = null,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): ChecksListSuitesForRefEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (!js.isUndefined(app_id)) __obj.updateDynamic("app_id")(app_id.get.asInstanceOf[js.Any])
    if (check_name != null) __obj.updateDynamic("check_name")(check_name.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListSuitesForRefEndpoint]
  }
}

