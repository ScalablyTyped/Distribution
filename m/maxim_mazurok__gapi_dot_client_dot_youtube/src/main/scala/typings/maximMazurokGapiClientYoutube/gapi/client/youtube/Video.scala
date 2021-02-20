package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Video extends StObject {
  
  /** Age restriction details related to a video. This data can only be retrieved by the video owner. */
  var ageGating: js.UndefOr[VideoAgeGating] = js.native
  
  /** The contentDetails object contains information about the video content, including the length of the video and its aspect ratio. */
  var contentDetails: js.UndefOr[VideoContentDetails] = js.native
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The fileDetails object encapsulates information about the video file that was uploaded to YouTube, including the file's resolution, duration, audio and video codecs, stream
    * bitrates, and more. This data can only be retrieved by the video owner.
    */
  var fileDetails: js.UndefOr[VideoFileDetails] = js.native
  
  /** The ID that YouTube uses to uniquely identify the video. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#video". */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The liveStreamingDetails object contains metadata about a live video broadcast. The object will only be present in a video resource if the video is an upcoming, live, or completed
    * live broadcast.
    */
  var liveStreamingDetails: js.UndefOr[VideoLiveStreamingDetails] = js.native
  
  /** The localizations object contains localized versions of the basic details about the video, such as its title and description. */
  var localizations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.youtube.gapi.client.youtube.VideoLocalization}
    */ typings.maximMazurokGapiClientYoutube.maximMazurokGapiClientYoutubeStrings.Video with TopLevel[js.Any]
  ] = js.native
  
  /** The monetizationDetails object encapsulates information about the monetization status of the video. */
  var monetizationDetails: js.UndefOr[VideoMonetizationDetails] = js.native
  
  /** The player object contains information that you would use to play the video in an embedded player. */
  var player: js.UndefOr[VideoPlayer] = js.native
  
  /**
    * The processingDetails object encapsulates information about YouTube's progress in processing the uploaded video file. The properties in the object identify the current processing
    * status and an estimate of the time remaining until YouTube finishes processing the video. This part also indicates whether different types of data or content, such as file details
    * or thumbnail images, are available for the video. The processingProgress object is designed to be polled so that the video uploaded can track the progress that YouTube has made in
    * processing the uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: js.UndefOr[VideoProcessingDetails] = js.native
  
  /** The projectDetails object contains information about the project specific video metadata. */
  var projectDetails: js.UndefOr[VideoProjectDetails] = js.native
  
  /** The recordingDetails object encapsulates information about the location, date and address where the video was recorded. */
  var recordingDetails: js.UndefOr[VideoRecordingDetails] = js.native
  
  /** The snippet object contains basic details about the video, such as its title, description, and category. */
  var snippet: js.UndefOr[VideoSnippet] = js.native
  
  /** The statistics object contains statistics about the video. */
  var statistics: js.UndefOr[VideoStatistics] = js.native
  
  /** The status object contains information about the video's uploading, processing, and privacy statuses. */
  var status: js.UndefOr[VideoStatus] = js.native
  
  /**
    * The suggestions object encapsulates suggestions that identify opportunities to improve the video quality or the metadata for the uploaded video. This data can only be retrieved by
    * the video owner.
    */
  var suggestions: js.UndefOr[VideoSuggestions] = js.native
  
  /** The topicDetails object encapsulates information about Freebase topics associated with the video. */
  var topicDetails: js.UndefOr[VideoTopicDetails] = js.native
}
object Video {
  
  @scala.inline
  def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  
  @scala.inline
  implicit class VideoMutableBuilder[Self <: Video] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgeGating(value: VideoAgeGating): Self = StObject.set(x, "ageGating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeGatingUndefined: Self = StObject.set(x, "ageGating", js.undefined)
    
    @scala.inline
    def setContentDetails(value: VideoContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFileDetails(value: VideoFileDetails): Self = StObject.set(x, "fileDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDetailsUndefined: Self = StObject.set(x, "fileDetails", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLiveStreamingDetails(value: VideoLiveStreamingDetails): Self = StObject.set(x, "liveStreamingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveStreamingDetailsUndefined: Self = StObject.set(x, "liveStreamingDetails", js.undefined)
    
    @scala.inline
    def setLocalizations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.youtube.gapi.client.youtube.VideoLocalization}
      */ typings.maximMazurokGapiClientYoutube.maximMazurokGapiClientYoutubeStrings.Video with TopLevel[js.Any]
    ): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    @scala.inline
    def setMonetizationDetails(value: VideoMonetizationDetails): Self = StObject.set(x, "monetizationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonetizationDetailsUndefined: Self = StObject.set(x, "monetizationDetails", js.undefined)
    
    @scala.inline
    def setPlayer(value: VideoPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
    
    @scala.inline
    def setProcessingDetails(value: VideoProcessingDetails): Self = StObject.set(x, "processingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingDetailsUndefined: Self = StObject.set(x, "processingDetails", js.undefined)
    
    @scala.inline
    def setProjectDetails(value: VideoProjectDetails): Self = StObject.set(x, "projectDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDetailsUndefined: Self = StObject.set(x, "projectDetails", js.undefined)
    
    @scala.inline
    def setRecordingDetails(value: VideoRecordingDetails): Self = StObject.set(x, "recordingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordingDetailsUndefined: Self = StObject.set(x, "recordingDetails", js.undefined)
    
    @scala.inline
    def setSnippet(value: VideoSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setStatistics(value: VideoStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: VideoStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSuggestions(value: VideoSuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setTopicDetails(value: VideoTopicDetails): Self = StObject.set(x, "topicDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicDetailsUndefined: Self = StObject.set(x, "topicDetails", js.undefined)
  }
}
