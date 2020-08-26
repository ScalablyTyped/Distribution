package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposSetStatusCheckContextsEndpoint extends js.Object {
  var branch: String = js.native
  /**
    * contexts parameter
    */
  var contexts: js.Array[String] = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ReposSetStatusCheckContextsEndpoint {
  @scala.inline
  def apply(branch: String, contexts: js.Array[String], owner: String, repo: String): ReposSetStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposSetStatusCheckContextsEndpoint]
  }
  @scala.inline
  implicit class ReposSetStatusCheckContextsEndpointOps[Self <: ReposSetStatusCheckContextsEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextsVarargs(value: String*): Self = this.set("contexts", js.Array(value :_*))
    @scala.inline
    def setContexts(value: js.Array[String]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
  
}

