package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReleaseAssetParams extends js.Object {
  var asset_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposGetReleaseAssetParams {
  @scala.inline
  def apply(asset_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposGetReleaseAssetParams = {
    val __obj = js.Dynamic.literal(asset_id = asset_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetReleaseAssetParams]
  }
}

