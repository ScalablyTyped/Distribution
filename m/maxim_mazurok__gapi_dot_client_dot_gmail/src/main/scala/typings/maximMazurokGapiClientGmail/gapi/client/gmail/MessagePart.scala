package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePart extends StObject {
  
  /** The message part body for this part, which may be empty for container MIME message parts. */
  var body: js.UndefOr[MessagePartBody] = js.native
  
  /** The filename of the attachment. Only present if this message part represents an attachment. */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * List of headers on this message part. For the top-level message part, representing the entire message payload, it will contain the standard RFC 2822 email headers such as `To`,
    * `From`, and `Subject`.
    */
  var headers: js.UndefOr[js.Array[MessagePartHeader]] = js.native
  
  /** The MIME type of the message part. */
  var mimeType: js.UndefOr[String] = js.native
  
  /** The immutable ID of the message part. */
  var partId: js.UndefOr[String] = js.native
  
  /**
    * The child MIME message parts of this part. This only applies to container MIME message parts, for example `multipart/ *`. For non- container MIME message part types, such as
    * `text/plain`, this field is empty. For more information, see RFC 1521.
    */
  var parts: js.UndefOr[js.Array[MessagePart]] = js.native
}
object MessagePart {
  
  @scala.inline
  def apply(): MessagePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePart]
  }
  
  @scala.inline
  implicit class MessagePartMutableBuilder[Self <: MessagePart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: MessagePartBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Array[MessagePartHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: MessagePartHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setPartId(value: String): Self = StObject.set(x, "partId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartIdUndefined: Self = StObject.set(x, "partId", js.undefined)
    
    @scala.inline
    def setParts(value: js.Array[MessagePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    @scala.inline
    def setPartsVarargs(value: MessagePart*): Self = StObject.set(x, "parts", js.Array(value :_*))
  }
}
