package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReadmeParams extends js.Object {
  var owner: java.lang.String
  /**
    * The name of the commit/branch/tag.
    */
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var repo: java.lang.String
}

object ReposGetReadmeParams {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, ref: java.lang.String = null): ReposGetReadmeParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ReposGetReadmeParams]
  }
}

