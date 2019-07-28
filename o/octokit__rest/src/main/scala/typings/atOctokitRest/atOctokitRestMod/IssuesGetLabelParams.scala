package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(name = name, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesGetLabelParams]
  }
}

