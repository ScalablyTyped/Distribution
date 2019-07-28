package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReleaseByTagParams extends js.Object {
  var owner: String
  var repo: String
  var tag: String
}

object ReposGetReleaseByTagParams {
  @scala.inline
  def apply(owner: String, repo: String, tag: String): ReposGetReleaseByTagParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tag = tag)
  
    __obj.asInstanceOf[ReposGetReleaseByTagParams]
  }
}

