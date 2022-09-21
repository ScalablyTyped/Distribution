package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistSnippet extends StObject {
  
  /** The ID that YouTube uses to uniquely identify the channel that published the playlist. */
  var channelId: js.UndefOr[String] = js.undefined
  
  /** The channel title of the channel that the video belongs to. */
  var channelTitle: js.UndefOr[String] = js.undefined
  
  /** The language of the playlist's default title and description. */
  var defaultLanguage: js.UndefOr[String] = js.undefined
  
  /** The playlist's description. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Localized title and description, read-only. */
  var localized: js.UndefOr[PlaylistLocalization] = js.undefined
  
  /** The date and time that the playlist was created. */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /** Keyword tags associated with the playlist. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Note: if the playlist has a custom thumbnail, this field will not be populated. The video id selected by the user that will be used as the thumbnail of this playlist. This field
    * defaults to the first publicly viewable video in the playlist, if: 1. The user has never selected a video to be the thumbnail of the playlist. 2. The user selects a video to be the
    * thumbnail, and then removes that video from the playlist. 3. The user selects a non-owned video to be the thumbnail, but that video becomes private, or gets deleted.
    */
  var thumbnailVideoId: js.UndefOr[String] = js.undefined
  
  /**
    * A map of thumbnail images associated with the playlist. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other
    * information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  
  /** The playlist's title. */
  var title: js.UndefOr[String] = js.undefined
}
object PlaylistSnippet {
  
  inline def apply(): PlaylistSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistSnippet]
  }
  
  extension [Self <: PlaylistSnippet](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLocalized(value: PlaylistLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setThumbnailVideoId(value: String): Self = StObject.set(x, "thumbnailVideoId", value.asInstanceOf[js.Any])
    
    inline def setThumbnailVideoIdUndefined: Self = StObject.set(x, "thumbnailVideoId", js.undefined)
    
    inline def setThumbnails(value: ThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
