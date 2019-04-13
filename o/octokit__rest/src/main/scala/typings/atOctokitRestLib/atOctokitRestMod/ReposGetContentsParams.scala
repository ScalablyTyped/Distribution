package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetContentsParams extends js.Object {
  var owner: java.lang.String
  var path: java.lang.String
  /**
    * The name of the commit/branch/tag.
    */
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var repo: java.lang.String
}

object ReposGetContentsParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    path: java.lang.String,
    repo: java.lang.String,
    ref: java.lang.String = null
  ): ReposGetContentsParams = {
    val __obj = js.Dynamic.literal(owner = owner, path = path, repo = repo)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ReposGetContentsParams]
  }
}

