package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReleaseByTagEndpoint extends js.Object {
  var owner: String
  var repo: String
  var tag: String
}

object ReposGetReleaseByTagEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, tag: String): ReposGetReleaseByTagEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tag = tag)
  
    __obj.asInstanceOf[ReposGetReleaseByTagEndpoint]
  }
}

