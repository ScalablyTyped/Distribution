package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nodeid extends js.Object {
  var content: String
  var created_at: String
  var id: Double
  var node_id: String
  var user: Eventsurl
}

object Nodeid {
  @scala.inline
  def apply(content: String, created_at: String, id: Double, node_id: String, user: Eventsurl): Nodeid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodeid]
  }
}

