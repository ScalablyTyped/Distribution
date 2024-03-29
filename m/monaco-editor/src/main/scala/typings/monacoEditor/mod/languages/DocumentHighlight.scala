package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentHighlight extends StObject {
  
  /**
    * The highlight kind, default is {@link DocumentHighlightKind.Text text}.
    */
  var kind: js.UndefOr[DocumentHighlightKind] = js.undefined
  
  /**
    * The range this highlight applies to.
    */
  var range: IRange
}
object DocumentHighlight {
  
  inline def apply(range: IRange): DocumentHighlight = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHighlight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentHighlight] (val x: Self) extends AnyVal {
    
    inline def setKind(value: DocumentHighlightKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
