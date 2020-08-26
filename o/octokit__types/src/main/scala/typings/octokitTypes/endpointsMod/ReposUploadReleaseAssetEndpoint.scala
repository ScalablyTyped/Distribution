package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.ContenttypeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUploadReleaseAssetEndpoint extends js.Object {
  /**
    * For https://api.github.com, set `baseUrl` to `https://uploads.github.com`. For GitHub Enterprise Server, set it to `<your hostname>/api/uploads`
    */
  var baseUrl: String = js.native
  /**
    * The raw file data
    */
  var data: String = js.native
  var headers: ContenttypeString = js.native
  /**
    * label parameter
    */
  var label: js.UndefOr[String] = js.native
  /**
    * name parameter
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL origin (protocol + host name + port) is included in `upload_url` returned in the response of the "Create a release" endpoint
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * owner parameter
    */
  var owner: String = js.native
  /**
    * release_id parameter
    */
  var release_id: Double = js.native
  /**
    * repo parameter
    */
  var repo: String = js.native
}

object ReposUploadReleaseAssetEndpoint {
  @scala.inline
  def apply(
    baseUrl: String,
    data: String,
    headers: ContenttypeString,
    owner: String,
    release_id: Double,
    repo: String
  ): ReposUploadReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUploadReleaseAssetEndpoint]
  }
  @scala.inline
  implicit class ReposUploadReleaseAssetEndpointOps[Self <: ReposUploadReleaseAssetEndpoint] (val x: Self) extends AnyVal {
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: ContenttypeString): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease_id(value: Double): Self = this.set("release_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

