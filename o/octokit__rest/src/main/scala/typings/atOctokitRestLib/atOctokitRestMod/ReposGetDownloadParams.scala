package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetDownloadParams extends js.Object {
  var download_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposGetDownloadParams {
  @scala.inline
  def apply(download_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposGetDownloadParams = {
    val __obj = js.Dynamic.literal(download_id = download_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetDownloadParams]
  }
}

