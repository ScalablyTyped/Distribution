package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Footnote extends StObject {
  
  /** The contents of the footnote. The indexes for a footnote's content begin at zero. */
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
  
  /** The ID of the footnote. */
  var footnoteId: js.UndefOr[String] = js.undefined
}
object Footnote {
  
  inline def apply(): Footnote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Footnote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Footnote] (val x: Self) extends AnyVal {
    
    inline def setContent(value: js.Array[StructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: StructuralElement*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setFootnoteId(value: String): Self = StObject.set(x, "footnoteId", value.asInstanceOf[js.Any])
    
    inline def setFootnoteIdUndefined: Self = StObject.set(x, "footnoteId", js.undefined)
  }
}
