package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archiveurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListSelectedReposForOrgSecretResponseData extends js.Object {
  var repositories: js.Array[Archiveurl]
  var total_count: Double
}

object ActionsListSelectedReposForOrgSecretResponseData {
  @scala.inline
  def apply(repositories: js.Array[Archiveurl], total_count: Double): ActionsListSelectedReposForOrgSecretResponseData = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListSelectedReposForOrgSecretResponseData]
  }
}

