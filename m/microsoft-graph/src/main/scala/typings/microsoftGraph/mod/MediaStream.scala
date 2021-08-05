package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStream extends StObject {
  
  // The direction. The possible values are inactive, sendOnly, receiveOnly, sendReceive.
  var direction: js.UndefOr[MediaDirection] = js.undefined
  
  // The media stream label.
  var label: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The media type. The possible value are unknown, audio, video, videoBasedScreenSharing, data.
  var mediaType: js.UndefOr[Modality] = js.undefined
  
  // If the media is muted by the server.
  var serverMuted: js.UndefOr[Boolean] = js.undefined
  
  // The source ID.
  var sourceId: js.UndefOr[String] = js.undefined
}
object MediaStream {
  
  inline def apply(): MediaStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStream]
  }
  
  extension [Self <: MediaStream](x: Self) {
    
    inline def setDirection(value: MediaDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setLabel(value: NullableOption[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMediaType(value: Modality): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
    
    inline def setServerMuted(value: Boolean): Self = StObject.set(x, "serverMuted", value.asInstanceOf[js.Any])
    
    inline def setServerMutedUndefined: Self = StObject.set(x, "serverMuted", js.undefined)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
  }
}
