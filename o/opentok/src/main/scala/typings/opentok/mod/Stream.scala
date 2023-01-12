package typings.opentok.mod

import typings.opentok.opentokStrings.camera
import typings.opentok.opentokStrings.custom
import typings.opentok.opentokStrings.screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  var hasAudio: Boolean
  
  var hasVideo: Boolean
  
  var id: String
  
  var layoutClassList: js.Array[String]
  
  var name: String
  
  var streamId: String
  
  var videoType: camera | screen | custom
}
object Stream {
  
  inline def apply(
    hasAudio: Boolean,
    hasVideo: Boolean,
    id: String,
    layoutClassList: js.Array[String],
    name: String,
    streamId: String,
    videoType: camera | screen | custom
  ): Stream = {
    val __obj = js.Dynamic.literal(hasAudio = hasAudio.asInstanceOf[js.Any], hasVideo = hasVideo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layoutClassList = layoutClassList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], videoType = videoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
    
    inline def setHasAudio(value: Boolean): Self = StObject.set(x, "hasAudio", value.asInstanceOf[js.Any])
    
    inline def setHasVideo(value: Boolean): Self = StObject.set(x, "hasVideo", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLayoutClassList(value: js.Array[String]): Self = StObject.set(x, "layoutClassList", value.asInstanceOf[js.Any])
    
    inline def setLayoutClassListVarargs(value: String*): Self = StObject.set(x, "layoutClassList", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setVideoType(value: camera | screen | custom): Self = StObject.set(x, "videoType", value.asInstanceOf[js.Any])
  }
}
