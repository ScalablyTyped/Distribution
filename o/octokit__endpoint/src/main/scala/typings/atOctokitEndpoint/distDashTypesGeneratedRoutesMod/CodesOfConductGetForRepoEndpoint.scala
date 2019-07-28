package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodesOfConductGetForRepoEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object CodesOfConductGetForRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): CodesOfConductGetForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[CodesOfConductGetForRepoEndpoint]
  }
}

