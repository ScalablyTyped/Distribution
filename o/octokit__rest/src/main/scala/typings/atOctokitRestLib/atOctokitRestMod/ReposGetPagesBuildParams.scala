package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesBuildParams extends js.Object {
  var build_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposGetPagesBuildParams {
  @scala.inline
  def apply(build_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ReposGetPagesBuildParams = {
    val __obj = js.Dynamic.literal(build_id = build_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetPagesBuildParams]
  }
}

