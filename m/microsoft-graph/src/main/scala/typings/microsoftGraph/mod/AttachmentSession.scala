package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentSession
  extends StObject
     with Entity {
  
  // The content streams that are uploaded.
  var content: js.UndefOr[NullableOption[Any]] = js.undefined
  
  /**
    * The date and time in UTC when the upload session will expire. The complete file must be uploaded before this expiration
    * time is reached.
    */
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates a single value {start} that represents the location in the file where the next upload should begin.
  var nextExpectedRanges: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object AttachmentSession {
  
  inline def apply(): AttachmentSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentSession] (val x: Self) extends AnyVal {
    
    inline def setContent(value: NullableOption[Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeNull: Self = StObject.set(x, "expirationDateTime", null)
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setNextExpectedRanges(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "nextExpectedRanges", value.asInstanceOf[js.Any])
    
    inline def setNextExpectedRangesNull: Self = StObject.set(x, "nextExpectedRanges", null)
    
    inline def setNextExpectedRangesUndefined: Self = StObject.set(x, "nextExpectedRanges", js.undefined)
    
    inline def setNextExpectedRangesVarargs(value: String*): Self = StObject.set(x, "nextExpectedRanges", js.Array(value*))
  }
}
