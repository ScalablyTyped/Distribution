package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTextReference
  extends StObject
     with ContentBase
     with _Content {
  
  var textReference: String
}
object ContentTextReference {
  
  inline def apply(textReference: String): ContentTextReference = {
    val __obj = js.Dynamic.literal(textReference = textReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTextReference]
  }
  
  extension [Self <: ContentTextReference](x: Self) {
    
    inline def setTextReference(value: String): Self = StObject.set(x, "textReference", value.asInstanceOf[js.Any])
  }
}
