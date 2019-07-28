package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateBlobEndpoint extends js.Object {
  var content: String
  var encoding: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object GitCreateBlobEndpoint {
  @scala.inline
  def apply(content: String, owner: String, repo: String, encoding: String = null): GitCreateBlobEndpoint = {
    val __obj = js.Dynamic.literal(content = content, owner = owner, repo = repo)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[GitCreateBlobEndpoint]
  }
}

