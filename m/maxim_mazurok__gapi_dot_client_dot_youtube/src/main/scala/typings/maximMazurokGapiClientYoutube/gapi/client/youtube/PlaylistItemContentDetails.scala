package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistItemContentDetails extends js.Object {
  
  /**
    * The time, measured in seconds from the start of the video, when the video should stop playing. (The playlist owner can specify the times when the video should start and stop playing
    * when the video is played in the context of the playlist.) By default, assume that the video.endTime is the end of the video.
    */
  var endAt: js.UndefOr[String] = js.native
  
  /** A user-generated note for this item. */
  var note: js.UndefOr[String] = js.native
  
  /**
    * The time, measured in seconds from the start of the video, when the video should start playing. (The playlist owner can specify the times when the video should start and stop
    * playing when the video is played in the context of the playlist.) The default value is 0.
    */
  var startAt: js.UndefOr[String] = js.native
  
  /** The ID that YouTube uses to uniquely identify a video. To retrieve the video resource, set the id query parameter to this value in your API request. */
  var videoId: js.UndefOr[String] = js.native
  
  /** The date and time that the video was published to YouTube. The value is specified in ISO 8601 format. */
  var videoPublishedAt: js.UndefOr[String] = js.native
}
object PlaylistItemContentDetails {
  
  @scala.inline
  def apply(): PlaylistItemContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistItemContentDetails]
  }
  
  @scala.inline
  implicit class PlaylistItemContentDetailsOps[Self <: PlaylistItemContentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndAt(value: String): Self = this.set("endAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAt: Self = this.set("endAt", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setStartAt(value: String): Self = this.set("startAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
    
    @scala.inline
    def setVideoPublishedAt(value: String): Self = this.set("videoPublishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoPublishedAt: Self = this.set("videoPublishedAt", js.undefined)
  }
}
