package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateForRepoParams extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * The name of the project.
    */
  var name: String
  var owner: String
  var repo: String
}

object ProjectsCreateForRepoParams {
  @scala.inline
  def apply(name: String, owner: String, repo: String, body: String = null): ProjectsCreateForRepoParams = {
    val __obj = js.Dynamic.literal(name = name, owner = owner, repo = repo)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[ProjectsCreateForRepoParams]
  }
}

