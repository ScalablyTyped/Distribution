package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMessageAttachment extends StObject {
  
  /**
    * The content of the attachment. If the attachment is a rich card, set the property to the rich card object. This
    * property and contentUrl are mutually exclusive.
    */
  var content: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The media type of the content attachment. It can have the following values: reference: Attachment is a link to another
    * file. Populate the contentURL with the link to the object.file: Raw file attachment. Populate the contenturl field with
    * the base64 encoding of the file in data: format.image/: Image type with the type of the image specified ex: image/png,
    * image/jpeg, image/gif. Populate the contentUrl field with the base64 encoding of the file in data: format.video/: Video
    * type with the format specified. Ex: video/mp4. Populate the contentUrl field with the base64 encoding of the file in
    * data: format.audio/: Audio type with the format specified. Ex: audio/wmw. Populate the contentUrl field with the base64
    * encoding of the file in data: format.application/card type: Rich card attachment type with the card type specifying the
    * exact card format to use. Set content with the json format of the card. Supported values for card type
    * include:application/vnd.microsoft.card.adaptive: A rich card that can contain any combination of text, speech,
    * images,,buttons, and input fields. Set the content property to,an AdaptiveCard
    * object.application/vnd.microsoft.card.animation: A rich card that plays animation. Set the content property,to an
    * AnimationCardobject.application/vnd.microsoft.card.audio: A rich card that plays audio files. Set the content
    * property,to an AudioCard object.application/vnd.microsoft.card.video: A rich card that plays videos. Set the content
    * property,to a VideoCard object.application/vnd.microsoft.card.hero: A Hero card. Set the content property to a HeroCard
    * object.application/vnd.microsoft.card.thumbnail: A Thumbnail card. Set the content property to a ThumbnailCard
    * object.application/vnd.microsoft.com.card.receipt: A Receipt card. Set the content property to a ReceiptCard
    * object.application/vnd.microsoft.com.card.signin: A user Sign In card. Set the content property to a SignInCard object.
    */
  var contentType: js.UndefOr[NullableOption[String]] = js.native
  
  // URL for the content of the attachment. Supported protocols: http, https, file and data.
  var contentUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Unique id of the attachment.
  var id: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of the attachment.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * URL to a thumbnail image that the channel can use if it supports using an alternative, smaller form of content or
    * contentUrl. For example, if you set contentType to application/word and set contentUrl to the location of the Word
    * document, you might include a thumbnail image that represents the document. The channel could display the thumbnail
    * image instead of the document. When the user clicks the image, the channel would open the document.
    */
  var thumbnailUrl: js.UndefOr[NullableOption[String]] = js.native
}
object ChatMessageAttachment {
  
  @scala.inline
  def apply(): ChatMessageAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessageAttachment]
  }
  
  @scala.inline
  implicit class ChatMessageAttachmentMutableBuilder[Self <: ChatMessageAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: NullableOption[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentType(value: NullableOption[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentUrl(value: NullableOption[String]): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: NullableOption[String]): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUrlNull: Self = StObject.set(x, "thumbnailUrl", null)
    
    @scala.inline
    def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
  }
}
