package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetContentsParams extends js.Object {
  var owner: String
  var path: String
  /**
    * The name of the commit/branch/tag. Default: the repository’s default branch (usually `master`)
    */
  var ref: js.UndefOr[String] = js.undefined
  var repo: String
}

object ReposGetContentsParams {
  @scala.inline
  def apply(owner: String, path: String, repo: String, ref: String = null): ReposGetContentsParams = {
    val __obj = js.Dynamic.literal(owner = owner, path = path, repo = repo)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ReposGetContentsParams]
  }
}

