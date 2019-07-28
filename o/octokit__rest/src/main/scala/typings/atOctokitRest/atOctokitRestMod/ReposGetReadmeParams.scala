package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReadmeParams extends js.Object {
  var owner: String
  /**
    * The name of the commit/branch/tag.
    */
  var ref: js.UndefOr[String] = js.undefined
  var repo: String
}

object ReposGetReadmeParams {
  @scala.inline
  def apply(owner: String, repo: String, ref: String = null): ReposGetReadmeParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ReposGetReadmeParams]
  }
}

