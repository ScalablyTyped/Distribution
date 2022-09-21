package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MimeContent extends StObject {
  
  // Indicates the content mime type.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The byte array that contains the actual content.
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object MimeContent {
  
  inline def apply(): MimeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MimeContent]
  }
  
  extension [Self <: MimeContent](x: Self) {
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
