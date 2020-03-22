package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.opt_in
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.opt_out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsSetLfsPreferenceParams extends js.Object {
  var owner: String
  var repo: String
  /**
    * Can be one of `opt_in` (large files will be stored using Git LFS) or `opt_out` (large files will be removed during the import).
    */
  var use_lfs: opt_in | opt_out
}

object MigrationsSetLfsPreferenceParams {
  @scala.inline
  def apply(owner: String, repo: String, use_lfs: opt_in | opt_out): MigrationsSetLfsPreferenceParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsSetLfsPreferenceParams]
  }
}

