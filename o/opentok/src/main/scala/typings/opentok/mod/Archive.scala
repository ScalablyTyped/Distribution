package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Archive extends StObject {
  
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
  
  @scala.inline
  implicit class ArchiveMutableBuilder[Self <: Archive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAudio(value: Boolean): Self = StObject.set(x, "hasAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasVideo(value: Boolean): Self = StObject.set(x, "hasVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputMode(value: OutputMode): Self = StObject.set(x, "outputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ArchiveStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
