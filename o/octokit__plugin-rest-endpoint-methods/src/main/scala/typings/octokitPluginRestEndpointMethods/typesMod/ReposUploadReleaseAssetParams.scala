package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUploadReleaseAssetParams extends js.Object {
  /**
    * The raw file data
    */
  var data: String
  var headers: ReposUploadReleaseAssetParamsHeaders
  var label: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  var release_id: Double
  var repo: String
}

object ReposUploadReleaseAssetParams {
  @scala.inline
  def apply(
    data: String,
    headers: ReposUploadReleaseAssetParamsHeaders,
    owner: String,
    release_id: Double,
    repo: String,
    label: String = null,
    name: String = null
  ): ReposUploadReleaseAssetParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUploadReleaseAssetParams]
  }
}

