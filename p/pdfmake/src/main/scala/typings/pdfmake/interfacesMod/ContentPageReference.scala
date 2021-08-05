package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentPageReference
  extends StObject
     with ContentBase
     with _Content {
  
  var pageReference: String
}
object ContentPageReference {
  
  inline def apply(pageReference: String): ContentPageReference = {
    val __obj = js.Dynamic.literal(pageReference = pageReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentPageReference]
  }
  
  extension [Self <: ContentPageReference](x: Self) {
    
    inline def setPageReference(value: String): Self = StObject.set(x, "pageReference", value.asInstanceOf[js.Any])
  }
}
