package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Archive extends js.Object {
  var createdAt: Double
  var duration: String
  var hasAudio: Boolean
  var hasVideo: Boolean
  var id: String
  var name: String
  var outputMode: OutputMode
  var partnerId: String
  var reason: String
  var sessionId: String
  var size: Double
  var status: ArchiveStatus
  var url: String
}

object Archive {
  @scala.inline
  def apply(
    createdAt: Double,
    duration: String,
    hasAudio: Boolean,
    hasVideo: Boolean,
    id: String,
    name: String,
    outputMode: OutputMode,
    partnerId: String,
    reason: String,
    sessionId: String,
    size: Double,
    status: ArchiveStatus,
    url: String
  ): Archive = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], hasAudio = hasAudio.asInstanceOf[js.Any], hasVideo = hasVideo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputMode = outputMode.asInstanceOf[js.Any], partnerId = partnerId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Archive]
  }
}

