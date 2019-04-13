package typings
package opentokLib.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Archive extends js.Object {
  var createdAt: scala.Double
  var duration: java.lang.String
  var hasAudio: scala.Boolean
  var hasVideo: scala.Boolean
  var id: java.lang.String
  var name: java.lang.String
  var outputMode: OutputMode
  var partnerId: java.lang.String
  var reason: java.lang.String
  var sessionId: java.lang.String
  var size: scala.Double
  var status: ArchiveStatus
  var url: java.lang.String
}

object Archive {
  @scala.inline
  def apply(
    createdAt: scala.Double,
    duration: java.lang.String,
    hasAudio: scala.Boolean,
    hasVideo: scala.Boolean,
    id: java.lang.String,
    name: java.lang.String,
    outputMode: OutputMode,
    partnerId: java.lang.String,
    reason: java.lang.String,
    sessionId: java.lang.String,
    size: scala.Double,
    status: ArchiveStatus,
    url: java.lang.String
  ): Archive = {
    val __obj = js.Dynamic.literal(createdAt = createdAt, duration = duration, hasAudio = hasAudio, hasVideo = hasVideo, id = id, name = name, outputMode = outputMode, partnerId = partnerId, reason = reason, sessionId = sessionId, size = size, status = status, url = url)
  
    __obj.asInstanceOf[Archive]
  }
}

