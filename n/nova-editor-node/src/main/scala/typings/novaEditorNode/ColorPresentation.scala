package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/color-presentation/
trait ColorPresentation extends StObject {
  
  var additionalTextEdits: js.Array[TextEdit]
  
  var format: js.UndefOr[ColorFormat] = js.undefined
  
  var insertText: js.UndefOr[String] = js.undefined
  
  var kind: String
  
  var label: String
  
  var usesFloats: js.UndefOr[Boolean] = js.undefined
}
object ColorPresentation {
  
  inline def apply(additionalTextEdits: js.Array[TextEdit], kind: String, label: String): ColorPresentation = {
    val __obj = js.Dynamic.literal(additionalTextEdits = additionalTextEdits.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPresentation]
  }
  
  extension [Self <: ColorPresentation](x: Self) {
    
    inline def setAdditionalTextEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "additionalTextEdits", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTextEditsVarargs(value: TextEdit*): Self = StObject.set(x, "additionalTextEdits", js.Array(value*))
    
    inline def setFormat(value: ColorFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInsertText(value: String): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setUsesFloats(value: Boolean): Self = StObject.set(x, "usesFloats", value.asInstanceOf[js.Any])
    
    inline def setUsesFloatsUndefined: Self = StObject.set(x, "usesFloats", js.undefined)
  }
}
