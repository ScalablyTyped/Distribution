package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesDeleteLabelEndpoint extends js.Object {
  var name: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesDeleteLabelEndpoint {
  @scala.inline
  def apply(name: java.lang.String, owner: java.lang.String, repo: java.lang.String): IssuesDeleteLabelEndpoint = {
    val __obj = js.Dynamic.literal(name = name, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesDeleteLabelEndpoint]
  }
}

