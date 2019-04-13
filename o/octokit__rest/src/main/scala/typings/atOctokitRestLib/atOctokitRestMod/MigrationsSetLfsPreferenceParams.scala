package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsSetLfsPreferenceParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * Can be one of `opt_in` (large files will be stored using Git LFS) or `opt_out` (large files will be removed during the import).
    */
  var use_lfs: atOctokitRestLib.atOctokitRestLibStrings.opt_in | atOctokitRestLib.atOctokitRestLibStrings.opt_out
}

object MigrationsSetLfsPreferenceParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    use_lfs: atOctokitRestLib.atOctokitRestLibStrings.opt_in | atOctokitRestLib.atOctokitRestLibStrings.opt_out
  ): MigrationsSetLfsPreferenceParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, use_lfs = use_lfs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsSetLfsPreferenceParams]
  }
}

