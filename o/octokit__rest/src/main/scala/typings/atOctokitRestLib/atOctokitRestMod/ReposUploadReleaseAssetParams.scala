package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUploadReleaseAssetParams extends js.Object {
  var file: java.lang.String | js.Object
  /**
    * Request headers containing `content-type` and `content-length`
    */
  var headers: ReposUploadReleaseAssetParamsHeaders
  /**
    * An alternate short description of the asset. Used in place of the filename. This should be set in a URI query parameter.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The file name of the asset. This should be set in a URI query parameter.
    */
  var name: java.lang.String
  var url: java.lang.String
}

object ReposUploadReleaseAssetParams {
  @scala.inline
  def apply(
    file: java.lang.String | js.Object,
    headers: ReposUploadReleaseAssetParamsHeaders,
    name: java.lang.String,
    url: java.lang.String,
    label: java.lang.String = null
  ): ReposUploadReleaseAssetParams = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], headers = headers, name = name, url = url)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ReposUploadReleaseAssetParams]
  }
}

