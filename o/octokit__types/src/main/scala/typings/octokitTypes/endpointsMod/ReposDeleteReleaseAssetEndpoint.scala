package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteReleaseAssetEndpoint extends js.Object {
  var asset_id: Double
  var owner: String
  var repo: String
}

object ReposDeleteReleaseAssetEndpoint {
  @scala.inline
  def apply(asset_id: Double, owner: String, repo: String): ReposDeleteReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(asset_id = asset_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteReleaseAssetEndpoint]
  }
}

