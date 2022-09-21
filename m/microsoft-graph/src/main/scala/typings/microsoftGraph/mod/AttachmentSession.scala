package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentSession
  extends StObject
     with Entity {
  
  var content: js.UndefOr[NullableOption[Any]] = js.undefined
  
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var nextExpectedRanges: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object AttachmentSession {
  
  inline def apply(): AttachmentSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentSession]
  }
  
  extension [Self <: AttachmentSession](x: Self) {
    
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
