package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetRevisionEndpoint extends js.Object {
  var gist_id: String
  var sha: String
}

object GistsGetRevisionEndpoint {
  @scala.inline
  def apply(gist_id: String, sha: String): GistsGetRevisionEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id, sha = sha)
  
    __obj.asInstanceOf[GistsGetRevisionEndpoint]
  }
}

