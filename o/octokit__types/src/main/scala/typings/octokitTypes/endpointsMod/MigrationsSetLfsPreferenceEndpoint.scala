package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.opt_in
import typings.octokitTypes.octokitTypesStrings.opt_out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsSetLfsPreferenceEndpoint extends js.Object {
  var owner: String = js.native
  var repo: String = js.native
  /**
    * Can be one of `opt_in` (large files will be stored using Git LFS) or `opt_out` (large files will be removed during the import).
    */
  var use_lfs: opt_in | opt_out = js.native
}

object MigrationsSetLfsPreferenceEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, use_lfs: opt_in | opt_out): MigrationsSetLfsPreferenceEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsSetLfsPreferenceEndpoint]
  }
  @scala.inline
  implicit class MigrationsSetLfsPreferenceEndpointOps[Self <: MigrationsSetLfsPreferenceEndpoint] (val x: Self) extends AnyVal {
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
    def setUse_lfs(value: opt_in | opt_out): Self = this.set("use_lfs", value.asInstanceOf[js.Any])
  }
  
}

