package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionSnippet extends StObject {
  
  /** The type of audio track associated with the caption track. */
  var audioTrackType: js.UndefOr[String] = js.native
  
  /** The reason that YouTube failed to process the caption track. This property is only present if the state property's value is failed. */
  var failureReason: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether YouTube synchronized the caption track to the audio track in the video. The value will be true if a sync was explicitly requested when the caption track was
    * uploaded. For example, when calling the captions.insert or captions.update methods, you can set the sync parameter to true to instruct YouTube to sync the uploaded track to the
    * video. If the value is false, YouTube uses the time codes in the uploaded caption track to determine when to display captions.
    */
  var isAutoSynced: js.UndefOr[Boolean] = js.native
  
  /** Indicates whether the track contains closed captions for the deaf and hard of hearing. The default value is false. */
  var isCC: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the caption track is a draft. If the value is true, then the track is not publicly visible. The default value is false. @mutable youtube.captions.insert
    * youtube.captions.update
    */
  var isDraft: js.UndefOr[Boolean] = js.native
  
  /** Indicates whether caption track is formatted for "easy reader," meaning it is at a third-grade level for language learners. The default value is false. */
  var isEasyReader: js.UndefOr[Boolean] = js.native
  
  /** Indicates whether the caption track uses large text for the vision-impaired. The default value is false. */
  var isLarge: js.UndefOr[Boolean] = js.native
  
  /** The language of the caption track. The property value is a BCP-47 language tag. */
  var language: js.UndefOr[String] = js.native
  
  /** The date and time when the caption track was last updated. The value is specified in ISO 8601 format. */
  var lastUpdated: js.UndefOr[String] = js.native
  
  /** The name of the caption track. The name is intended to be visible to the user as an option during playback. */
  var name: js.UndefOr[String] = js.native
  
  /** The caption track's status. */
  var status: js.UndefOr[String] = js.native
  
  /** The caption track's type. */
  var trackKind: js.UndefOr[String] = js.native
  
  /** The ID that YouTube uses to uniquely identify the video associated with the caption track. @mutable youtube.captions.insert */
  var videoId: js.UndefOr[String] = js.native
}
object CaptionSnippet {
  
  @scala.inline
  def apply(): CaptionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSnippet]
  }
  
  @scala.inline
  implicit class CaptionSnippetMutableBuilder[Self <: CaptionSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioTrackType(value: String): Self = StObject.set(x, "audioTrackType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioTrackTypeUndefined: Self = StObject.set(x, "audioTrackType", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setIsAutoSynced(value: Boolean): Self = StObject.set(x, "isAutoSynced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutoSyncedUndefined: Self = StObject.set(x, "isAutoSynced", js.undefined)
    
    @scala.inline
    def setIsCC(value: Boolean): Self = StObject.set(x, "isCC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCCUndefined: Self = StObject.set(x, "isCC", js.undefined)
    
    @scala.inline
    def setIsDraft(value: Boolean): Self = StObject.set(x, "isDraft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDraftUndefined: Self = StObject.set(x, "isDraft", js.undefined)
    
    @scala.inline
    def setIsEasyReader(value: Boolean): Self = StObject.set(x, "isEasyReader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEasyReaderUndefined: Self = StObject.set(x, "isEasyReader", js.undefined)
    
    @scala.inline
    def setIsLarge(value: Boolean): Self = StObject.set(x, "isLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLargeUndefined: Self = StObject.set(x, "isLarge", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTrackKind(value: String): Self = StObject.set(x, "trackKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackKindUndefined: Self = StObject.set(x, "trackKind", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
