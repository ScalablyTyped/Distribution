package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePartBody extends StObject {
  
  /**
    * When present, contains the ID of an external attachment that can be retrieved in a separate `messages.attachments.get` request. When not present, the entire content of the message
    * part body is contained in the data field.
    */
  var attachmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The body data of a MIME message part as a base64url encoded string. May be empty for MIME container types that have no message body or when the body data is sent as a separate
    * attachment. An attachment ID is present if the body data is contained in a separate attachment.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /** Number of bytes for the message part data (encoding notwithstanding). */
  var size: js.UndefOr[Double] = js.undefined
}
object MessagePartBody {
  
  inline def apply(): MessagePartBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePartBody]
  }
  
  extension [Self <: MessagePartBody](x: Self) {
    
    inline def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
