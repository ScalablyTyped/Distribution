package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetContentsEndpoint extends js.Object {
  var owner: String
  var path: String
  var ref: js.UndefOr[String] = js.undefined
  var repo: String
}

object ReposGetContentsEndpoint {
  @scala.inline
  def apply(owner: String, path: String, repo: String, ref: String = null): ReposGetContentsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, path = path, repo = repo)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ReposGetContentsEndpoint]
  }
}

