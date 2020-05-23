package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowrebasemerge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListReposResponseData extends js.Object {
  var repositories: js.Array[Allowrebasemerge]
  var total_count: Double
}

object AppsListReposResponseData {
  @scala.inline
  def apply(repositories: js.Array[Allowrebasemerge], total_count: Double): AppsListReposResponseData = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListReposResponseData]
  }
}

