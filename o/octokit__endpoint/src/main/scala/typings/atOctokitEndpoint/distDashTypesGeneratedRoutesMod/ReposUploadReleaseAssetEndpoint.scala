package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUploadReleaseAssetEndpoint extends js.Object {
  var file: String | js.Object
  var headers: js.Object
  var `headers.content-length`: Double
  var `headers.content-type`: String
  var label: js.UndefOr[String] = js.undefined
  var name: String
  var url: String
}

object ReposUploadReleaseAssetEndpoint {
  @scala.inline
  def apply(
    file: String | js.Object,
    headers: js.Object,
    `headers.content-length`: Double,
    `headers.content-type`: String,
    name: String,
    url: String,
    label: String = null
  ): ReposUploadReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], headers = headers, name = name, url = url)
    __obj.updateDynamic("headers.content-length")(`headers.content-length`)
    __obj.updateDynamic("headers.content-type")(`headers.content-type`)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ReposUploadReleaseAssetEndpoint]
  }
}

