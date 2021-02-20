package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentAnchor
  extends ContentBase
     with _Content {
  
  var id: String = js.native
  
  var text: String | ContentAnchor = js.native
}
object ContentAnchor {
  
  @scala.inline
  def apply(id: String, text: String | ContentAnchor): ContentAnchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentAnchor]
  }
  
  @scala.inline
  implicit class ContentAnchorMutableBuilder[Self <: ContentAnchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String | ContentAnchor): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
