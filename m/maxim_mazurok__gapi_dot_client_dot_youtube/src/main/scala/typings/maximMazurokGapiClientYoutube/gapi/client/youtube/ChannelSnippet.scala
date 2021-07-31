package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelSnippet extends StObject {
  
  /** The country of the channel. */
  var country: js.UndefOr[String] = js.undefined
  
  /** The custom url of the channel. */
  var customUrl: js.UndefOr[String] = js.undefined
  
  /** The language of the channel's default title and description. */
  var defaultLanguage: js.UndefOr[String] = js.undefined
  
  /** The description of the channel. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Localized title and description, read-only. */
  var localized: js.UndefOr[ChannelLocalization] = js.undefined
  
  /** The date and time that the channel was created. The value is specified in < a href="//www.w3.org/TR/NOTE-datetime">ISO 8601 format. */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /**
    * A map of thumbnail images associated with the channel. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other
    * information about the thumbnail. When displaying thumbnails in your application, make sure that your code uses the image URLs exactly as they are returned in API responses. For
    * example, your application should not use the http domain instead of the https domain in a URL returned in an API response. Beginning in July 2018, channel thumbnail URLs will only
    * be available in the https domain, which is how the URLs appear in API responses. After that time, you might see broken images in your application if it tries to load YouTube images
    * from the http domain. Thumbnail images might be empty for newly created channels and might take up to one day to populate.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  
  /** The channel's title. */
  var title: js.UndefOr[String] = js.undefined
}
object ChannelSnippet {
  
  @scala.inline
  def apply(): ChannelSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSnippet]
  }
  
  @scala.inline
  implicit class ChannelSnippetMutableBuilder[Self <: ChannelSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setCustomUrl(value: String): Self = StObject.set(x, "customUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUrlUndefined: Self = StObject.set(x, "customUrl", js.undefined)
    
    @scala.inline
    def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLocalized(value: ChannelLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
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
