package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReleaseAssetParams extends js.Object {
  var asset_id: Double
  var owner: String
  var repo: String
}

object ReposGetReleaseAssetParams {
  @scala.inline
  def apply(asset_id: Double, owner: String, repo: String): ReposGetReleaseAssetParams = {
    val __obj = js.Dynamic.literal(asset_id = asset_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetReleaseAssetParams]
  }
}

