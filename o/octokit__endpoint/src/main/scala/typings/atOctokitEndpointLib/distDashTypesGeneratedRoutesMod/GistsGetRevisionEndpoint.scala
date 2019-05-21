package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetRevisionEndpoint extends js.Object {
  var gist_id: java.lang.String
  var sha: java.lang.String
}

object GistsGetRevisionEndpoint {
  @scala.inline
  def apply(gist_id: java.lang.String, sha: java.lang.String): GistsGetRevisionEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id, sha = sha)
  
    __obj.asInstanceOf[GistsGetRevisionEndpoint]
  }
}

