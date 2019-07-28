package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReadmeEndpoint extends js.Object {
  var owner: String
  var ref: js.UndefOr[String] = js.undefined
  var repo: String
}

object ReposGetReadmeEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, ref: String = null): ReposGetReadmeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ReposGetReadmeEndpoint]
  }
}

