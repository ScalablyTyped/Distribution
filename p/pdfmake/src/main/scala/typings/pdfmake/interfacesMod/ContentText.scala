package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentText
  extends StObject
     with ContentLink
     with ContentBase
     with _Content {
  
  var text: Content
}
object ContentText {
  
  inline def apply(text: Content): ContentText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentText]
  }
  
  extension [Self <: ContentText](x: Self) {
    
    inline def setText(value: Content): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
