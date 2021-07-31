package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header extends StObject {
  
  /** The contents of the header. The indexes for a header's content begin at zero. */
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
  
  /** The ID of the header. */
  var headerId: js.UndefOr[String] = js.undefined
}
object Header {
  
  @scala.inline
  def apply(): Header = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Array[StructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: StructuralElement*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setHeaderId(value: String): Self = StObject.set(x, "headerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderIdUndefined: Self = StObject.set(x, "headerId", js.undefined)
  }
}
