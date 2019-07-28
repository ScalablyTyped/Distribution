package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposReplaceTopicsEndpoint extends js.Object {
  var names: js.Array[String]
  var owner: String
  var repo: String
}

object ReposReplaceTopicsEndpoint {
  @scala.inline
  def apply(names: js.Array[String], owner: String, repo: String): ReposReplaceTopicsEndpoint = {
    val __obj = js.Dynamic.literal(names = names, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposReplaceTopicsEndpoint]
  }
}

