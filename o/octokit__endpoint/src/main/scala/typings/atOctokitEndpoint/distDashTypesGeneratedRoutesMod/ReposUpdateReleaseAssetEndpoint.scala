package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateReleaseAssetEndpoint extends js.Object {
  var asset_id: Double
  var label: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object ReposUpdateReleaseAssetEndpoint {
  @scala.inline
  def apply(asset_id: Double, owner: String, repo: String, label: String = null, name: String = null): ReposUpdateReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(asset_id = asset_id, owner = owner, repo = repo)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ReposUpdateReleaseAssetEndpoint]
  }
}

