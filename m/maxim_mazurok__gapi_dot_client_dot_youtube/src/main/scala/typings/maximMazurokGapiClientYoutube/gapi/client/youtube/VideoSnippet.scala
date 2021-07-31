package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSnippet extends StObject {
  
  /** The YouTube video category associated with the video. */
  var categoryId: js.UndefOr[String] = js.undefined
  
  /** The ID that YouTube uses to uniquely identify the channel that the video was uploaded to. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** Channel title for the channel that the video belongs to. */
  var channelTitle: js.UndefOr[String] = js.undefined
  
  /** The default_audio_language property specifies the language spoken in the video's default audio track. */
  var defaultAudioLanguage: js.UndefOr[String] = js.undefined
  
  /** The language of the videos's default snippet. */
  var defaultLanguage: js.UndefOr[String] = js.undefined
  
  /** The video's description. @mutable youtube.videos.insert youtube.videos.update */
  var description: js.UndefOr[String] = js.undefined
  
  /** Indicates if the video is an upcoming/active live broadcast. Or it's "none" if the video is not an upcoming/active live broadcast. */
  var liveBroadcastContent: js.UndefOr[String] = js.undefined
  
  /** Localized snippet selected with the hl parameter. If no such localization exists, this field is populated with the default snippet. (Read-only) */
  var localized: js.UndefOr[VideoLocalization] = js.undefined
  
  /** The date and time that the video was uploaded. The value is specified in ISO 8601 format. */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /** A list of keyword tags associated with the video. Tags may contain spaces. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A map of thumbnail images associated with the video. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other
    * information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  
  /** The video's title. @mutable youtube.videos.insert youtube.videos.update */
  var title: js.UndefOr[String] = js.undefined
}
object VideoSnippet {
  
  @scala.inline
  def apply(): VideoSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSnippet]
  }
  
  @scala.inline
  implicit class VideoSnippetMutableBuilder[Self <: VideoSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryId(value: String): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    @scala.inline
    def setDefaultAudioLanguage(value: String): Self = StObject.set(x, "defaultAudioLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAudioLanguageUndefined: Self = StObject.set(x, "defaultAudioLanguage", js.undefined)
    
    @scala.inline
    def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLiveBroadcastContent(value: String): Self = StObject.set(x, "liveBroadcastContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveBroadcastContentUndefined: Self = StObject.set(x, "liveBroadcastContent", js.undefined)
    
    @scala.inline
    def setLocalized(value: VideoLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
