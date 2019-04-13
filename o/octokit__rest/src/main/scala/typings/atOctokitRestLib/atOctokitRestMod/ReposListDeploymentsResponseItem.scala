package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListDeploymentsResponseItem extends js.Object {
  var created_at: java.lang.String
  var creator: ReposListDeploymentsResponseItemCreator
  var description: java.lang.String
  var environment: java.lang.String
  var id: scala.Double
  var node_id: java.lang.String
  var original_environment: java.lang.String
  var payload: ReposListDeploymentsResponseItemPayload
  var production_environment: scala.Boolean
  var ref: java.lang.String
  var repository_url: java.lang.String
  var sha: java.lang.String
  var statuses_url: java.lang.String
  var task: java.lang.String
  var transient_environment: scala.Boolean
  var updated_at: java.lang.String
  var url: java.lang.String
}

object ReposListDeploymentsResponseItem {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    creator: ReposListDeploymentsResponseItemCreator,
    description: java.lang.String,
    environment: java.lang.String,
    id: scala.Double,
    node_id: java.lang.String,
    original_environment: java.lang.String,
    payload: ReposListDeploymentsResponseItemPayload,
    production_environment: scala.Boolean,
    ref: java.lang.String,
    repository_url: java.lang.String,
    sha: java.lang.String,
    statuses_url: java.lang.String,
    task: java.lang.String,
    transient_environment: scala.Boolean,
    updated_at: java.lang.String,
    url: java.lang.String
  ): ReposListDeploymentsResponseItem = {
    val __obj = js.Dynamic.literal(created_at = created_at, creator = creator, description = description, environment = environment, id = id, node_id = node_id, original_environment = original_environment, payload = payload, production_environment = production_environment, ref = ref, repository_url = repository_url, sha = sha, statuses_url = statuses_url, task = task, transient_environment = transient_environment, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ReposListDeploymentsResponseItem]
  }
}

