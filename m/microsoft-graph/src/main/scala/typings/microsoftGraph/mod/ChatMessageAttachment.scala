package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatMessageAttachment extends StObject {
  
  /**
    * The content of the attachment. If the attachment is a rich card, set the property to the rich card object. This
    * property and contentUrl are mutually exclusive.
    */
  var content: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The media type of the content attachment. It can have the following values: reference: Attachment is a link to another
    * file. Populate the contentURL with the link to the object.Any contentTypes supported by the Bot Framework's Attachment
    * objectapplication/vnd.microsoft.card.codesnippet: A code snippet. application/vnd.microsoft.card.announcement: An
    * announcement header.
    */
  var contentType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // URL for the content of the attachment. Supported protocols: http, https, file and data.
  var contentUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. Unique id of the attachment.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the attachment.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * URL to a thumbnail image that the channel can use if it supports using an alternative, smaller form of content or
    * contentUrl. For example, if you set contentType to application/word and set contentUrl to the location of the Word
    * document, you might include a thumbnail image that represents the document. The channel could display the thumbnail
    * image instead of the document. When the user clicks the image, the channel would open the document.
    */
  var thumbnailUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object ChatMessageAttachment {
  
  inline def apply(): ChatMessageAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessageAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMessageAttachment] (val x: Self) extends AnyVal {
    
    inline def setContent(value: NullableOption[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentType(value: NullableOption[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentUrl(value: NullableOption[String]): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setThumbnailUrl(value: NullableOption[String]): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlNull: Self = StObject.set(x, "thumbnailUrl", null)
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
  }
}
