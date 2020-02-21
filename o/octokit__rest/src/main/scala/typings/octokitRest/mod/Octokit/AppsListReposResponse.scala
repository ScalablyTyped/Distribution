package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListReposResponse extends js.Object {
  var repositories: js.Array[AppsListReposResponseRepositoriesItem]
  var total_count: Double
}

object AppsListReposResponse {
  @scala.inline
  def apply(repositories: js.Array[AppsListReposResponseRepositoriesItem], total_count: Double): AppsListReposResponse = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsListReposResponse]
  }
}

