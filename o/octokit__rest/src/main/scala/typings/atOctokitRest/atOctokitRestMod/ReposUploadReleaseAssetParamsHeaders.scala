package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUploadReleaseAssetParamsHeaders extends js.Object {
  var `content-length`: Double
  var `content-type`: String
}

object ReposUploadReleaseAssetParamsHeaders {
  @scala.inline
  def apply(`content-length`: Double, `content-type`: String): ReposUploadReleaseAssetParamsHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content-length")(`content-length`)
    __obj.updateDynamic("content-type")(`content-type`)
    __obj.asInstanceOf[ReposUploadReleaseAssetParamsHeaders]
  }
}

