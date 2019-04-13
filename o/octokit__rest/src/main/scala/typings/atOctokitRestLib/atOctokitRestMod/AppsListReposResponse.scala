package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListReposResponse extends js.Object {
  var repositories: js.Array[AppsListReposResponseRepositoriesItem]
  var total_count: scala.Double
}

object AppsListReposResponse {
  @scala.inline
  def apply(repositories: js.Array[AppsListReposResponseRepositoriesItem], total_count: scala.Double): AppsListReposResponse = {
    val __obj = js.Dynamic.literal(repositories = repositories, total_count = total_count)
  
    __obj.asInstanceOf[AppsListReposResponse]
  }
}

