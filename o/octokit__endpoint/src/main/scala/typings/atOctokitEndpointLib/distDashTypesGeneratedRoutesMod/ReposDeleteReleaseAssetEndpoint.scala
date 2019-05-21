package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteReleaseAssetEndpoint extends js.Object {
  var asset_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposDeleteReleaseAssetEndpoint {
  @scala.inline
  def apply(asset_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposDeleteReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(asset_id = asset_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposDeleteReleaseAssetEndpoint]
  }
}

