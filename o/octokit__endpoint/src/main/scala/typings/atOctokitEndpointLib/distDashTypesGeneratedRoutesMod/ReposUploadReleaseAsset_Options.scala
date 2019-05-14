package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUploadReleaseAsset_Options extends js.Object {
  var file: java.lang.String | js.Object
  var headers: js.Object
  var `headers.content-length`: scala.Double
  var `headers.content-type`: java.lang.String
  var label: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var url: java.lang.String
}

object ReposUploadReleaseAsset_Options {
  @scala.inline
  def apply(
    file: java.lang.String | js.Object,
    headers: js.Object,
    `headers.content-length`: scala.Double,
    `headers.content-type`: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    label: java.lang.String = null
  ): ReposUploadReleaseAsset_Options = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], headers = headers, name = name, url = url)
    __obj.updateDynamic("headers.content-length")(`headers.content-length`)
    __obj.updateDynamic("headers.content-type")(`headers.content-type`)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ReposUploadReleaseAsset_Options]
  }
}

