package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorAssistant extends StObject {
  
  def provideColorPresentations(color: Color, editor: TextEditor, context: ColorPresentationContext): AssistantArray[ColorPresentation]
  
  def provideColors(editor: TextEditor, context: ColorInformationContext): AssistantArray[ColorInformation]
}
object ColorAssistant {
  
  inline def apply(
    provideColorPresentations: (Color, TextEditor, ColorPresentationContext) => AssistantArray[ColorPresentation],
    provideColors: (TextEditor, ColorInformationContext) => AssistantArray[ColorInformation]
  ): ColorAssistant = {
    val __obj = js.Dynamic.literal(provideColorPresentations = js.Any.fromFunction3(provideColorPresentations), provideColors = js.Any.fromFunction2(provideColors))
    __obj.asInstanceOf[ColorAssistant]
  }
  
  extension [Self <: ColorAssistant](x: Self) {
    
    inline def setProvideColorPresentations(value: (Color, TextEditor, ColorPresentationContext) => AssistantArray[ColorPresentation]): Self = StObject.set(x, "provideColorPresentations", js.Any.fromFunction3(value))
    
    inline def setProvideColors(value: (TextEditor, ColorInformationContext) => AssistantArray[ColorInformation]): Self = StObject.set(x, "provideColors", js.Any.fromFunction2(value))
  }
}
