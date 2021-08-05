package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MimeType extends StObject {
  
  /** The MIME type of the quoted content. */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** The quoted content itself. This is interpreted as plain text if set through the API. */
  var value: js.UndefOr[String] = js.undefined
}
object MimeType {
  
  inline def apply(): MimeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MimeType]
  }
  
  extension [Self <: MimeType](x: Self) {
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
