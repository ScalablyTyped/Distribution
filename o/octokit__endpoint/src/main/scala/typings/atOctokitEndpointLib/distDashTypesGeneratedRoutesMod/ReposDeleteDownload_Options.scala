package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteDownload_Options extends js.Object {
  var download_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposDeleteDownload_Options {
  @scala.inline
  def apply(download_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposDeleteDownload_Options = {
    val __obj = js.Dynamic.literal(download_id = download_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposDeleteDownload_Options]
  }
}

