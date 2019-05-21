package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReleaseEndpoint extends js.Object {
  var owner: java.lang.String
  var release_id: scala.Double
  var repo: java.lang.String
}

object ReposGetReleaseEndpoint {
  @scala.inline
  def apply(owner: java.lang.String, release_id: scala.Double, repo: java.lang.String): ReposGetReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, release_id = release_id, repo = repo)
  
    __obj.asInstanceOf[ReposGetReleaseEndpoint]
  }
}

