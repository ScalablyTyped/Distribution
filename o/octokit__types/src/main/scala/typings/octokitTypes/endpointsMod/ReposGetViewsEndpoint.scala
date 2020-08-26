package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.day
import typings.octokitTypes.octokitTypesStrings.week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetViewsEndpoint extends js.Object {
  var owner: String = js.native
  /**
    * Must be one of: `day`, `week`.
    */
  var per: js.UndefOr[day | week] = js.native
  var repo: String = js.native
}

object ReposGetViewsEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetViewsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetViewsEndpoint]
  }
  @scala.inline
  implicit class ReposGetViewsEndpointOps[Self <: ReposGetViewsEndpoint] (val x: Self) extends AnyVal {
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPer(value: day | week): Self = this.set("per", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePer: Self = this.set("per", js.undefined)
  }
  
}

