package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposSetStatusCheckContextsEndpoint extends js.Object {
  var branch: String
  /**
    * contexts parameter
    */
  var contexts: js.Array[String]
  var owner: String
  var repo: String
}

object ReposSetStatusCheckContextsEndpoint {
  @scala.inline
  def apply(branch: String, contexts: js.Array[String], owner: String, repo: String): ReposSetStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposSetStatusCheckContextsEndpoint]
  }
}

