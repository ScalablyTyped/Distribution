package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesDeleteLabelParams extends js.Object {
  var name: String
  var owner: String
  var repo: String
}

object IssuesDeleteLabelParams {
  @scala.inline
  def apply(name: String, owner: String, repo: String): IssuesDeleteLabelParams = {
    val __obj = js.Dynamic.literal(name = name, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesDeleteLabelParams]
  }
}

