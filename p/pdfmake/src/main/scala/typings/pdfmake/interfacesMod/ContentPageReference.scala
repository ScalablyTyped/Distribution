package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentPageReference
  extends ContentBase
     with _Content {
  
  var pageReference: String = js.native
}
object ContentPageReference {
  
  @scala.inline
  def apply(pageReference: String): ContentPageReference = {
    val __obj = js.Dynamic.literal(pageReference = pageReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentPageReference]
  }
  
  @scala.inline
  implicit class ContentPageReferenceMutableBuilder[Self <: ContentPageReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageReference(value: String): Self = StObject.set(x, "pageReference", value.asInstanceOf[js.Any])
  }
}
