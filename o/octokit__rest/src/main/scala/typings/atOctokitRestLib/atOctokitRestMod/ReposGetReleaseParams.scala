package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReleaseParams extends js.Object {
  var owner: java.lang.String
  var release_id: scala.Double
  var repo: java.lang.String
}

object ReposGetReleaseParams {
  @scala.inline
  def apply(owner: java.lang.String, release_id: scala.Double, repo: java.lang.String): ReposGetReleaseParams = {
    val __obj = js.Dynamic.literal(owner = owner, release_id = release_id, repo = repo)
  
    __obj.asInstanceOf[ReposGetReleaseParams]
  }
}

