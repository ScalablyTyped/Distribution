package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateReleaseAsset_Options extends js.Object {
  var asset_id: scala.Double
  var label: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposUpdateReleaseAsset_Options {
  @scala.inline
  def apply(
    asset_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    label: java.lang.String = null,
    name: java.lang.String = null
  ): ReposUpdateReleaseAsset_Options = {
    val __obj = js.Dynamic.literal(asset_id = asset_id, owner = owner, repo = repo)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ReposUpdateReleaseAsset_Options]
  }
}

