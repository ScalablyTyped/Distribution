package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IMarkdownString
import typings.monacoEditor.mod.IPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHint extends StObject {
  
  var kind: js.UndefOr[InlayHintKind] = js.undefined
  
  var label: String | js.Array[InlayHintLabelPart]
  
  var paddingLeft: js.UndefOr[Boolean] = js.undefined
  
  var paddingRight: js.UndefOr[Boolean] = js.undefined
  
  var position: IPosition
  
  var textEdits: js.UndefOr[js.Array[TextEdit]] = js.undefined
  
  var tooltip: js.UndefOr[String | IMarkdownString] = js.undefined
}
object InlayHint {
  
  inline def apply(label: String | js.Array[InlayHintLabelPart], position: IPosition): InlayHint = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlayHint]
  }
  
  extension [Self <: InlayHint](x: Self) {
    
    inline def setKind(value: InlayHintKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabel(value: String | js.Array[InlayHintLabelPart]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelVarargs(value: InlayHintLabelPart*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setPaddingLeft(value: Boolean): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingRight(value: Boolean): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPosition(value: IPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTextEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "textEdits", value.asInstanceOf[js.Any])
    
    inline def setTextEditsUndefined: Self = StObject.set(x, "textEdits", js.undefined)
    
    inline def setTextEditsVarargs(value: TextEdit*): Self = StObject.set(x, "textEdits", js.Array(value*))
    
    inline def setTooltip(value: String | IMarkdownString): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
