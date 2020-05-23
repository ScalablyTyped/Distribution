package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastStopResponse extends js.Object {
  var createdAt: Double
  var id: String
  var projectId: Double
  var resolution: String
  var sessionId: String
  var updatedAt: Double
}

object BroadcastStopResponse {
  @scala.inline
  def apply(
    createdAt: Double,
    id: String,
    projectId: Double,
    resolution: String,
    sessionId: String,
    updatedAt: Double
  ): BroadcastStopResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastStopResponse]
  }
}

