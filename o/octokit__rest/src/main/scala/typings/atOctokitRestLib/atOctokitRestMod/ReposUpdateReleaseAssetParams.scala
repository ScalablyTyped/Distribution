package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateReleaseAssetParams extends js.Object {
  var asset_id: scala.Double
  /**
    * An alternate short description of the asset. Used in place of the filename.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The file name of the asset.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposUpdateReleaseAssetParams {
  @scala.inline
  def apply(
    asset_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    label: java.lang.String = null,
    name: java.lang.String = null
  ): ReposUpdateReleaseAssetParams = {
    val __obj = js.Dynamic.literal(asset_id = asset_id, owner = owner, repo = repo)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ReposUpdateReleaseAssetParams]
  }
}

