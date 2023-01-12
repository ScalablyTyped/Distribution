package typings.monacoEditor.mod.languages.css

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModeConfiguration extends StObject {
  
  /**
    * Defines whether the built-in color provider is enabled.
    */
  val colors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in completionItemProvider is enabled.
    */
  val completionItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in definitions provider is enabled.
    */
  val definitions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in diagnostic provider is enabled.
    */
  val diagnostics: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in document formatting edit provider is enabled.
    */
  val documentFormattingEdits: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in references provider is enabled.
    */
  val documentHighlights: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in document formatting range edit provider is enabled.
    */
  val documentRangeFormattingEdits: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in documentSymbolProvider is enabled.
    */
  val documentSymbols: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in foldingRange provider is enabled.
    */
  val foldingRanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in hoverProvider is enabled.
    */
  val hovers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in references provider is enabled.
    */
  val references: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in rename provider is enabled.
    */
  val rename: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in selection range provider is enabled.
    */
  val selectionRanges: js.UndefOr[Boolean] = js.undefined
}
object ModeConfiguration {
  
  inline def apply(): ModeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setCompletionItems(value: Boolean): Self = StObject.set(x, "completionItems", value.asInstanceOf[js.Any])
    
    inline def setCompletionItemsUndefined: Self = StObject.set(x, "completionItems", js.undefined)
    
    inline def setDefinitions(value: Boolean): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDocumentFormattingEdits(value: Boolean): Self = StObject.set(x, "documentFormattingEdits", value.asInstanceOf[js.Any])
    
    inline def setDocumentFormattingEditsUndefined: Self = StObject.set(x, "documentFormattingEdits", js.undefined)
    
    inline def setDocumentHighlights(value: Boolean): Self = StObject.set(x, "documentHighlights", value.asInstanceOf[js.Any])
    
    inline def setDocumentHighlightsUndefined: Self = StObject.set(x, "documentHighlights", js.undefined)
    
    inline def setDocumentRangeFormattingEdits(value: Boolean): Self = StObject.set(x, "documentRangeFormattingEdits", value.asInstanceOf[js.Any])
    
    inline def setDocumentRangeFormattingEditsUndefined: Self = StObject.set(x, "documentRangeFormattingEdits", js.undefined)
    
    inline def setDocumentSymbols(value: Boolean): Self = StObject.set(x, "documentSymbols", value.asInstanceOf[js.Any])
    
    inline def setDocumentSymbolsUndefined: Self = StObject.set(x, "documentSymbols", js.undefined)
    
    inline def setFoldingRanges(value: Boolean): Self = StObject.set(x, "foldingRanges", value.asInstanceOf[js.Any])
    
    inline def setFoldingRangesUndefined: Self = StObject.set(x, "foldingRanges", js.undefined)
    
    inline def setHovers(value: Boolean): Self = StObject.set(x, "hovers", value.asInstanceOf[js.Any])
    
    inline def setHoversUndefined: Self = StObject.set(x, "hovers", js.undefined)
    
    inline def setReferences(value: Boolean): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setRename(value: Boolean): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    inline def setSelectionRanges(value: Boolean): Self = StObject.set(x, "selectionRanges", value.asInstanceOf[js.Any])
    
    inline def setSelectionRangesUndefined: Self = StObject.set(x, "selectionRanges", js.undefined)
  }
}
