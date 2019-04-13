package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCombinedStatusForRefResponseStatusesItem extends js.Object {
  var avatar_url: java.lang.String
  var context: java.lang.String
  var created_at: java.lang.String
  var description: java.lang.String
  var id: scala.Double
  var node_id: java.lang.String
  var state: java.lang.String
  var target_url: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object ReposGetCombinedStatusForRefResponseStatusesItem {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    context: java.lang.String,
    created_at: java.lang.String,
    description: java.lang.String,
    id: scala.Double,
    node_id: java.lang.String,
    state: java.lang.String,
    target_url: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): ReposGetCombinedStatusForRefResponseStatusesItem = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, context = context, created_at = created_at, description = description, id = id, node_id = node_id, state = state, target_url = target_url, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ReposGetCombinedStatusForRefResponseStatusesItem]
  }
}

