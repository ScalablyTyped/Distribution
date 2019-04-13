package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReleaseByTagParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var tag: java.lang.String
}

object ReposGetReleaseByTagParams {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, tag: java.lang.String): ReposGetReleaseByTagParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tag = tag)
  
    __obj.asInstanceOf[ReposGetReleaseByTagParams]
  }
}

