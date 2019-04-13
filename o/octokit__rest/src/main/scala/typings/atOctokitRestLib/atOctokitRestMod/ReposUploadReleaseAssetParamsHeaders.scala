package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUploadReleaseAssetParamsHeaders extends js.Object {
  var `content-length`: scala.Double
  var `content-type`: java.lang.String
}

object ReposUploadReleaseAssetParamsHeaders {
  @scala.inline
  def apply(`content-length`: scala.Double, `content-type`: java.lang.String): ReposUploadReleaseAssetParamsHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content-length")(`content-length`)
    __obj.updateDynamic("content-type")(`content-type`)
    __obj.asInstanceOf[ReposUploadReleaseAssetParamsHeaders]
  }
}

