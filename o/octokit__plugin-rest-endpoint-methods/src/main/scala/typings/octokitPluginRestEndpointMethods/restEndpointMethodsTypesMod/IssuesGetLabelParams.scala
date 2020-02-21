package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetLabelParams extends js.Object {
  var name: String
  var owner: String
  var repo: String
}

object IssuesGetLabelParams {
  @scala.inline
  def apply(name: String, owner: String, repo: String): IssuesGetLabelParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssuesGetLabelParams]
  }
}

