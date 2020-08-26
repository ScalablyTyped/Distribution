package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRestrictionsForRepo extends js.Object {
  var getRestrictionsForOrg: `706` = js.native
  var getRestrictionsForRepo: `707` = js.native
  var removeRestrictionsForOrg: `708` = js.native
  var removeRestrictionsForRepo: `709` = js.native
  var setRestrictionsForOrg: `710` = js.native
  var setRestrictionsForRepo: `711` = js.native
}

object GetRestrictionsForRepo {
  @scala.inline
  def apply(
    getRestrictionsForOrg: `706`,
    getRestrictionsForRepo: `707`,
    removeRestrictionsForOrg: `708`,
    removeRestrictionsForRepo: `709`,
    setRestrictionsForOrg: `710`,
    setRestrictionsForRepo: `711`
  ): GetRestrictionsForRepo = {
    val __obj = js.Dynamic.literal(getRestrictionsForOrg = getRestrictionsForOrg.asInstanceOf[js.Any], getRestrictionsForRepo = getRestrictionsForRepo.asInstanceOf[js.Any], removeRestrictionsForOrg = removeRestrictionsForOrg.asInstanceOf[js.Any], removeRestrictionsForRepo = removeRestrictionsForRepo.asInstanceOf[js.Any], setRestrictionsForOrg = setRestrictionsForOrg.asInstanceOf[js.Any], setRestrictionsForRepo = setRestrictionsForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRestrictionsForRepo]
  }
  @scala.inline
  implicit class GetRestrictionsForRepoOps[Self <: GetRestrictionsForRepo] (val x: Self) extends AnyVal {
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
    def setGetRestrictionsForOrg(value: `706`): Self = this.set("getRestrictionsForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRestrictionsForRepo(value: `707`): Self = this.set("getRestrictionsForRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveRestrictionsForOrg(value: `708`): Self = this.set("removeRestrictionsForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveRestrictionsForRepo(value: `709`): Self = this.set("removeRestrictionsForRepo", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetRestrictionsForOrg(value: `710`): Self = this.set("setRestrictionsForOrg", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetRestrictionsForRepo(value: `711`): Self = this.set("setRestrictionsForRepo", value.asInstanceOf[js.Any])
  }
  
}

