package typings.octokitRest.mod.Octokit

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
    __obj.updateDynamic("content-length")(`content-length`.asInstanceOf[js.Any])
    __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUploadReleaseAssetParamsHeaders]
  }
}

