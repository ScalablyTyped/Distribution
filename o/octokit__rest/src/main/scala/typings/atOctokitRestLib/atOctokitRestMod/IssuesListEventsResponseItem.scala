package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListEventsResponseItem extends js.Object {
  var actor: IssuesListEventsResponseItemActor
  var commit_id: java.lang.String
  var commit_url: java.lang.String
  var created_at: java.lang.String
  var event: java.lang.String
  var id: scala.Double
  var node_id: java.lang.String
  var url: java.lang.String
}

object IssuesListEventsResponseItem {
  @scala.inline
  def apply(
    actor: IssuesListEventsResponseItemActor,
    commit_id: java.lang.String,
    commit_url: java.lang.String,
    created_at: java.lang.String,
    event: java.lang.String,
    id: scala.Double,
    node_id: java.lang.String,
    url: java.lang.String
  ): IssuesListEventsResponseItem = {
    val __obj = js.Dynamic.literal(actor = actor, commit_id = commit_id, commit_url = commit_url, created_at = created_at, event = event, id = id, node_id = node_id, url = url)
  
    __obj.asInstanceOf[IssuesListEventsResponseItem]
  }
}

