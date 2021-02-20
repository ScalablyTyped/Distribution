package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentTextReference
  extends ContentBase
     with _Content {
  
  var textReference: String = js.native
}
object ContentTextReference {
  
  @scala.inline
  def apply(textReference: String): ContentTextReference = {
    val __obj = js.Dynamic.literal(textReference = textReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTextReference]
  }
  
  @scala.inline
  implicit class ContentTextReferenceMutableBuilder[Self <: ContentTextReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextReference(value: String): Self = StObject.set(x, "textReference", value.asInstanceOf[js.Any])
  }
}
