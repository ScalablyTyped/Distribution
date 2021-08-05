package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Video extends StObject {
  
  /** Age restriction details related to a video. This data can only be retrieved by the video owner. */
  var ageGating: js.UndefOr[VideoAgeGating] = js.undefined
  
  /** The contentDetails object contains information about the video content, including the length of the video and its aspect ratio. */
  var contentDetails: js.UndefOr[VideoContentDetails] = js.undefined
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The fileDetails object encapsulates information about the video file that was uploaded to YouTube, including the file's resolution, duration, audio and video codecs, stream
    * bitrates, and more. This data can only be retrieved by the video owner.
    */
  var fileDetails: js.UndefOr[VideoFileDetails] = js.undefined
  
  /** The ID that YouTube uses to uniquely identify the video. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#video". */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The liveStreamingDetails object contains metadata about a live video broadcast. The object will only be present in a video resource if the video is an upcoming, live, or completed
    * live broadcast.
    */
  var liveStreamingDetails: js.UndefOr[VideoLiveStreamingDetails] = js.undefined
  
  /** The localizations object contains localized versions of the basic details about the video, such as its title and description. */
  var localizations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.youtube.gapi.client.youtube.VideoLocalization}
    */ typings.maximMazurokGapiClientYoutube.maximMazurokGapiClientYoutubeStrings.Video & TopLevel[js.Any]
  ] = js.undefined
  
  /** The monetizationDetails object encapsulates information about the monetization status of the video. */
  var monetizationDetails: js.UndefOr[VideoMonetizationDetails] = js.undefined
  
  /** The player object contains information that you would use to play the video in an embedded player. */
  var player: js.UndefOr[VideoPlayer] = js.undefined
  
  /**
    * The processingDetails object encapsulates information about YouTube's progress in processing the uploaded video file. The properties in the object identify the current processing
    * status and an estimate of the time remaining until YouTube finishes processing the video. This part also indicates whether different types of data or content, such as file details
    * or thumbnail images, are available for the video. The processingProgress object is designed to be polled so that the video uploaded can track the progress that YouTube has made in
    * processing the uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: js.UndefOr[VideoProcessingDetails] = js.undefined
  
  /** The projectDetails object contains information about the project specific video metadata. */
  var projectDetails: js.UndefOr[VideoProjectDetails] = js.undefined
  
  /** The recordingDetails object encapsulates information about the location, date and address where the video was recorded. */
  var recordingDetails: js.UndefOr[VideoRecordingDetails] = js.undefined
  
  /** The snippet object contains basic details about the video, such as its title, description, and category. */
  var snippet: js.UndefOr[VideoSnippet] = js.undefined
  
  /** The statistics object contains statistics about the video. */
  var statistics: js.UndefOr[VideoStatistics] = js.undefined
  
  /** The status object contains information about the video's uploading, processing, and privacy statuses. */
  var status: js.UndefOr[VideoStatus] = js.undefined
  
  /**
    * The suggestions object encapsulates suggestions that identify opportunities to improve the video quality or the metadata for the uploaded video. This data can only be retrieved by
    * the video owner.
    */
  var suggestions: js.UndefOr[VideoSuggestions] = js.undefined
  
  /** The topicDetails object encapsulates information about Freebase topics associated with the video. */
  var topicDetails: js.UndefOr[VideoTopicDetails] = js.undefined
}
object Video {
  
  inline def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  
  extension [Self <: Video](x: Self) {
    
    inline def setAgeGating(value: VideoAgeGating): Self = StObject.set(x, "ageGating", value.asInstanceOf[js.Any])
    
    inline def setAgeGatingUndefined: Self = StObject.set(x, "ageGating", js.undefined)
    
    inline def setContentDetails(value: VideoContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFileDetails(value: VideoFileDetails): Self = StObject.set(x, "fileDetails", value.asInstanceOf[js.Any])
    
    inline def setFileDetailsUndefined: Self = StObject.set(x, "fileDetails", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLiveStreamingDetails(value: VideoLiveStreamingDetails): Self = StObject.set(x, "liveStreamingDetails", value.asInstanceOf[js.Any])
    
    inline def setLiveStreamingDetailsUndefined: Self = StObject.set(x, "liveStreamingDetails", js.undefined)
    
    inline def setLocalizations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.youtube.gapi.client.youtube.VideoLocalization}
      */ typings.maximMazurokGapiClientYoutube.maximMazurokGapiClientYoutubeStrings.Video & TopLevel[js.Any]
    ): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    inline def setMonetizationDetails(value: VideoMonetizationDetails): Self = StObject.set(x, "monetizationDetails", value.asInstanceOf[js.Any])
    
    inline def setMonetizationDetailsUndefined: Self = StObject.set(x, "monetizationDetails", js.undefined)
    
    inline def setPlayer(value: VideoPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
    
    inline def setProcessingDetails(value: VideoProcessingDetails): Self = StObject.set(x, "processingDetails", value.asInstanceOf[js.Any])
    
    inline def setProcessingDetailsUndefined: Self = StObject.set(x, "processingDetails", js.undefined)
    
    inline def setProjectDetails(value: VideoProjectDetails): Self = StObject.set(x, "projectDetails", value.asInstanceOf[js.Any])
    
    inline def setProjectDetailsUndefined: Self = StObject.set(x, "projectDetails", js.undefined)
    
    inline def setRecordingDetails(value: VideoRecordingDetails): Self = StObject.set(x, "recordingDetails", value.asInstanceOf[js.Any])
    
    inline def setRecordingDetailsUndefined: Self = StObject.set(x, "recordingDetails", js.undefined)
    
    inline def setSnippet(value: VideoSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setStatistics(value: VideoStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setStatus(value: VideoStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSuggestions(value: VideoSuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setTopicDetails(value: VideoTopicDetails): Self = StObject.set(x, "topicDetails", value.asInstanceOf[js.Any])
    
    inline def setTopicDetailsUndefined: Self = StObject.set(x, "topicDetails", js.undefined)
  }
}
