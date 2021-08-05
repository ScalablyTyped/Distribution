package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistItemContentDetails extends StObject {
  
  /**
    * The time, measured in seconds from the start of the video, when the video should stop playing. (The playlist owner can specify the times when the video should start and stop playing
    * when the video is played in the context of the playlist.) By default, assume that the video.endTime is the end of the video.
    */
  var endAt: js.UndefOr[String] = js.undefined
  
  /** A user-generated note for this item. */
  var note: js.UndefOr[String] = js.undefined
  
  /**
    * The time, measured in seconds from the start of the video, when the video should start playing. (The playlist owner can specify the times when the video should start and stop
    * playing when the video is played in the context of the playlist.) The default value is 0.
    */
  var startAt: js.UndefOr[String] = js.undefined
  
  /** The ID that YouTube uses to uniquely identify a video. To retrieve the video resource, set the id query parameter to this value in your API request. */
  var videoId: js.UndefOr[String] = js.undefined
  
  /** The date and time that the video was published to YouTube. The value is specified in ISO 8601 format. */
  var videoPublishedAt: js.UndefOr[String] = js.undefined
}
object PlaylistItemContentDetails {
  
  inline def apply(): PlaylistItemContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistItemContentDetails]
  }
  
  extension [Self <: PlaylistItemContentDetails](x: Self) {
    
    inline def setEndAt(value: String): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    inline def setEndAtUndefined: Self = StObject.set(x, "endAt", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setStartAt(value: String): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    
    inline def setVideoPublishedAt(value: String): Self = StObject.set(x, "videoPublishedAt", value.asInstanceOf[js.Any])
    
    inline def setVideoPublishedAtUndefined: Self = StObject.set(x, "videoPublishedAt", js.undefined)
  }
}
