package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCodeFrequencyStatsEndpoint extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposGetCodeFrequencyStatsEndpoint {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String): ReposGetCodeFrequencyStatsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetCodeFrequencyStatsEndpoint]
  }
}

