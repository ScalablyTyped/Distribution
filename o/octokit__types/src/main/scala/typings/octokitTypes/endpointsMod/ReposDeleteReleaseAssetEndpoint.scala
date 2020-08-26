package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposDeleteReleaseAssetEndpoint extends js.Object {
  var asset_id: Double = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ReposDeleteReleaseAssetEndpoint {
  @scala.inline
  def apply(asset_id: Double, owner: String, repo: String): ReposDeleteReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(asset_id = asset_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteReleaseAssetEndpoint]
  }
  @scala.inline
  implicit class ReposDeleteReleaseAssetEndpointOps[Self <: ReposDeleteReleaseAssetEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsset_id(value: Double): Self = this.set("asset_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
  
}

