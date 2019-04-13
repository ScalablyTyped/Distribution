package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteReleaseParams extends js.Object {
  var owner: java.lang.String
  var release_id: scala.Double
  var repo: java.lang.String
}

object ReposDeleteReleaseParams {
  @scala.inline
  def apply(owner: java.lang.String, release_id: scala.Double, repo: java.lang.String): ReposDeleteReleaseParams = {
    val __obj = js.Dynamic.literal(owner = owner, release_id = release_id, repo = repo)
  
    __obj.asInstanceOf[ReposDeleteReleaseParams]
  }
}

