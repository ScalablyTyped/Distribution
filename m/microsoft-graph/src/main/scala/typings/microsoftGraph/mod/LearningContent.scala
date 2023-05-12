package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LearningContent
  extends StObject
     with Entity {
  
  // Keywords, topics, and other tags associated with the learning content. Optional.
  var additionalTags: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The content web URL for the learning content. Required.
  var contentWebUrl: js.UndefOr[String] = js.undefined
  
  // The authors, creators, or contributors of the learning content. Optional.
  var contributors: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * The date and time when the learning content was created. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Optional.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The description or summary for the learning content. Optional.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The duration of the learning content in seconds. The value is represented in ISO 8601 format for durations. Optional.
  var duration: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique external content ID for the learning content. Required.
  var externalId: js.UndefOr[String] = js.undefined
  
  // The format of the learning content. For example, Course, Video, Book, Book Summary, Audiobook Summary. Optional.
  var format: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates whether the content is active or not. Inactive content doesn't show up in the UI. The default value is true.
    * Optional.
    */
  var isActive: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates whether the learning content requires the user to sign-in on the learning provider platform or not. The
    * default value is false. Optional.
    */
  var isPremium: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether the learning content is searchable or not. The default value is true. Optional.
  var isSearchable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The language of the learning content, for example, en-us or fr-fr. Required.
  var languageTag: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the learning content was last modified. The Timestamp type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    * Optional.
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The number of pages of the learning content, for example, 9. Optional.
  var numberOfPages: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The skills tags associated with the learning content. Optional.
  var skillTags: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The source name of the learning content, such as LinkedIn Learning or Coursera. Optional.
  var sourceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The URL of learning content thumbnail image. Optional.
  var thumbnailWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The title of the learning content. Required.
  var title: js.UndefOr[String] = js.undefined
}
object LearningContent {
  
  inline def apply(): LearningContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LearningContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LearningContent] (val x: Self) extends AnyVal {
    
    inline def setAdditionalTags(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "additionalTags", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTagsNull: Self = StObject.set(x, "additionalTags", null)
    
    inline def setAdditionalTagsUndefined: Self = StObject.set(x, "additionalTags", js.undefined)
    
    inline def setAdditionalTagsVarargs(value: String*): Self = StObject.set(x, "additionalTags", js.Array(value*))
    
    inline def setContentWebUrl(value: String): Self = StObject.set(x, "contentWebUrl", value.asInstanceOf[js.Any])
    
    inline def setContentWebUrlUndefined: Self = StObject.set(x, "contentWebUrl", js.undefined)
    
    inline def setContributors(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    inline def setContributorsNull: Self = StObject.set(x, "contributors", null)
    
    inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
    
    inline def setContributorsVarargs(value: String*): Self = StObject.set(x, "contributors", js.Array(value*))
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDuration(value: NullableOption[String]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setFormat(value: NullableOption[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIsActive(value: NullableOption[Boolean]): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveNull: Self = StObject.set(x, "isActive", null)
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setIsPremium(value: NullableOption[Boolean]): Self = StObject.set(x, "isPremium", value.asInstanceOf[js.Any])
    
    inline def setIsPremiumNull: Self = StObject.set(x, "isPremium", null)
    
    inline def setIsPremiumUndefined: Self = StObject.set(x, "isPremium", js.undefined)
    
    inline def setIsSearchable(value: NullableOption[Boolean]): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
    
    inline def setIsSearchableNull: Self = StObject.set(x, "isSearchable", null)
    
    inline def setIsSearchableUndefined: Self = StObject.set(x, "isSearchable", js.undefined)
    
    inline def setLanguageTag(value: String): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
    
    inline def setLanguageTagUndefined: Self = StObject.set(x, "languageTag", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setNumberOfPages(value: NullableOption[Double]): Self = StObject.set(x, "numberOfPages", value.asInstanceOf[js.Any])
    
    inline def setNumberOfPagesNull: Self = StObject.set(x, "numberOfPages", null)
    
    inline def setNumberOfPagesUndefined: Self = StObject.set(x, "numberOfPages", js.undefined)
    
    inline def setSkillTags(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "skillTags", value.asInstanceOf[js.Any])
    
    inline def setSkillTagsNull: Self = StObject.set(x, "skillTags", null)
    
    inline def setSkillTagsUndefined: Self = StObject.set(x, "skillTags", js.undefined)
    
    inline def setSkillTagsVarargs(value: String*): Self = StObject.set(x, "skillTags", js.Array(value*))
    
    inline def setSourceName(value: NullableOption[String]): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameNull: Self = StObject.set(x, "sourceName", null)
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
    
    inline def setThumbnailWebUrl(value: NullableOption[String]): Self = StObject.set(x, "thumbnailWebUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailWebUrlNull: Self = StObject.set(x, "thumbnailWebUrl", null)
    
    inline def setThumbnailWebUrlUndefined: Self = StObject.set(x, "thumbnailWebUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
