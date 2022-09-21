package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintDocument
  extends StObject
     with Entity {
  
  // The document's content (MIME) type. Read-only.
  var contentType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The document's name. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The document's size in bytes. Read-only.
  var size: js.UndefOr[Double] = js.undefined
}
object PrintDocument {
  
  inline def apply(): PrintDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintDocument]
  }
  
  extension [Self <: PrintDocument](x: Self) {
    
    inline def setContentType(value: NullableOption[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
