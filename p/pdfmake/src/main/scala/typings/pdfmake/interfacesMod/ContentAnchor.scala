package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentAnchor
  extends StObject
     with ContentBase
     with _Content {
  
  var id: String
  
  var text: String | ContentAnchor
}
object ContentAnchor {
  
  inline def apply(id: String, text: String | ContentAnchor): ContentAnchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentAnchor]
  }
  
  extension [Self <: ContentAnchor](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setText(value: String | ContentAnchor): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
