package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IMarkdownString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHintLabelPart extends StObject {
  
  var command: js.UndefOr[Command] = js.undefined
  
  var label: String
  
  var location: js.UndefOr[Location] = js.undefined
  
  var tooltip: js.UndefOr[String | IMarkdownString] = js.undefined
}
object InlayHintLabelPart {
  
  inline def apply(label: String): InlayHintLabelPart = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlayHintLabelPart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlayHintLabelPart] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setTooltip(value: String | IMarkdownString): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
