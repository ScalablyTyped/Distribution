package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.ContenttypeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUploadReleaseAssetEndpoint extends js.Object {
  /**
    * For https://api.github.com, set `baseUrl` to `https://uploads.github.com`. For GitHub Enterprise Server, set it to `<your hostname>/api/uploads`
    */
  var baseUrl: String
  /**
    * The raw file data
    */
  var data: String
  var headers: ContenttypeString
  /**
    * label parameter
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * name parameter
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The URL origin (protocol + host name + port) is included in `upload_url` returned in the response of the "Create a release" endpoint
    */
  var origin: js.UndefOr[String] = js.undefined
  /**
    * owner parameter
    */
  var owner: String
  /**
    * release_id parameter
    */
  var release_id: Double
  /**
    * repo parameter
    */
  var repo: String
}

object ReposUploadReleaseAssetEndpoint {
  @scala.inline
  def apply(
    baseUrl: String,
    data: String,
    headers: ContenttypeString,
    owner: String,
    release_id: Double,
    repo: String,
    label: String = null,
    name: String = null,
    origin: String = null
  ): ReposUploadReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUploadReleaseAssetEndpoint]
  }
}

