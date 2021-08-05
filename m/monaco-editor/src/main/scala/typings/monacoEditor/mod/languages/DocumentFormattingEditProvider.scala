package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentFormattingEditProvider extends StObject {
  
  val displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Provide formatting edits for a whole document.
    */
  def provideDocumentFormattingEdits(model: ITextModel, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]]
}
object DocumentFormattingEditProvider {
  
  inline def apply(
    provideDocumentFormattingEdits: (ITextModel, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
  ): DocumentFormattingEditProvider = {
    val __obj = js.Dynamic.literal(provideDocumentFormattingEdits = js.Any.fromFunction3(provideDocumentFormattingEdits))
    __obj.asInstanceOf[DocumentFormattingEditProvider]
  }
  
  extension [Self <: DocumentFormattingEditProvider](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setProvideDocumentFormattingEdits(value: (ITextModel, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]): Self = StObject.set(x, "provideDocumentFormattingEdits", js.Any.fromFunction3(value))
  }
}
