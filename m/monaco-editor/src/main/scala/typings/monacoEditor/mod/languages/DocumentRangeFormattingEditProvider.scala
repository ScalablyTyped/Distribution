package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Range
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentRangeFormattingEditProvider extends StObject {
  
  val displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Provide formatting edits for a range in a document.
    *
    * The given range is a hint and providers can decide to format a smaller
    * or larger range. Often this is done by adjusting the start and end
    * of the range to full syntax nodes.
    */
  def provideDocumentRangeFormattingEdits(model: ITextModel, range: Range, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]]
  
  var provideDocumentRangesFormattingEdits: js.UndefOr[
    js.Function4[
      /* model */ ITextModel, 
      /* ranges */ js.Array[Range], 
      /* options */ FormattingOptions, 
      /* token */ CancellationToken, 
      ProviderResult[js.Array[TextEdit]]
    ]
  ] = js.undefined
}
object DocumentRangeFormattingEditProvider {
  
  inline def apply(
    provideDocumentRangeFormattingEdits: (ITextModel, Range, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
  ): DocumentRangeFormattingEditProvider = {
    val __obj = js.Dynamic.literal(provideDocumentRangeFormattingEdits = js.Any.fromFunction4(provideDocumentRangeFormattingEdits))
    __obj.asInstanceOf[DocumentRangeFormattingEditProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentRangeFormattingEditProvider] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setProvideDocumentRangeFormattingEdits(
      value: (ITextModel, Range, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
    ): Self = StObject.set(x, "provideDocumentRangeFormattingEdits", js.Any.fromFunction4(value))
    
    inline def setProvideDocumentRangesFormattingEdits(
      value: (/* model */ ITextModel, /* ranges */ js.Array[Range], /* options */ FormattingOptions, /* token */ CancellationToken) => ProviderResult[js.Array[TextEdit]]
    ): Self = StObject.set(x, "provideDocumentRangesFormattingEdits", js.Any.fromFunction4(value))
    
    inline def setProvideDocumentRangesFormattingEditsUndefined: Self = StObject.set(x, "provideDocumentRangesFormattingEdits", js.undefined)
  }
}
