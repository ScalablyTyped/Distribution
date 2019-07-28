package typings.opentok.opentokMod

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
    val __obj = js.Dynamic.literal(createdAt = createdAt, duration = duration, hasAudio = hasAudio, hasVideo = hasVideo, id = id, name = name, outputMode = outputMode, partnerId = partnerId, reason = reason, sessionId = sessionId, size = size, status = status, url = url)
  
    __obj.asInstanceOf[Archive]
  }
}

