package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModeConfiguration extends StObject {
  
  /**
    * Defines whether the built-in code actions provider is enabled.
    */
  val codeActions: js.UndefOr[Boolean] = js.undefined
  
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
    * Defines whether the built-in hoverProvider is enabled.
    */
  val hovers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in inlay hints provider is enabled.
    */
  val inlayHints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in onType formatting edit provider is enabled.
    */
  val onTypeFormattingEdits: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in references provider is enabled.
    */
  val references: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in rename provider is enabled.
    */
  val rename: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines whether the built-in signature help provider is enabled.
    */
  val signatureHelp: js.UndefOr[Boolean] = js.undefined
}
object ModeConfiguration {
  
  inline def apply(): ModeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCodeActions(value: Boolean): Self = StObject.set(x, "codeActions", value.asInstanceOf[js.Any])
    
    inline def setCodeActionsUndefined: Self = StObject.set(x, "codeActions", js.undefined)
    
    inline def setCompletionItems(value: Boolean): Self = StObject.set(x, "completionItems", value.asInstanceOf[js.Any])
    
    inline def setCompletionItemsUndefined: Self = StObject.set(x, "completionItems", js.undefined)
    
    inline def setDefinitions(value: Boolean): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDocumentHighlights(value: Boolean): Self = StObject.set(x, "documentHighlights", value.asInstanceOf[js.Any])
    
    inline def setDocumentHighlightsUndefined: Self = StObject.set(x, "documentHighlights", js.undefined)
    
    inline def setDocumentRangeFormattingEdits(value: Boolean): Self = StObject.set(x, "documentRangeFormattingEdits", value.asInstanceOf[js.Any])
    
    inline def setDocumentRangeFormattingEditsUndefined: Self = StObject.set(x, "documentRangeFormattingEdits", js.undefined)
    
    inline def setDocumentSymbols(value: Boolean): Self = StObject.set(x, "documentSymbols", value.asInstanceOf[js.Any])
    
    inline def setDocumentSymbolsUndefined: Self = StObject.set(x, "documentSymbols", js.undefined)
    
    inline def setHovers(value: Boolean): Self = StObject.set(x, "hovers", value.asInstanceOf[js.Any])
    
    inline def setHoversUndefined: Self = StObject.set(x, "hovers", js.undefined)
    
    inline def setInlayHints(value: Boolean): Self = StObject.set(x, "inlayHints", value.asInstanceOf[js.Any])
    
    inline def setInlayHintsUndefined: Self = StObject.set(x, "inlayHints", js.undefined)
    
    inline def setOnTypeFormattingEdits(value: Boolean): Self = StObject.set(x, "onTypeFormattingEdits", value.asInstanceOf[js.Any])
    
    inline def setOnTypeFormattingEditsUndefined: Self = StObject.set(x, "onTypeFormattingEdits", js.undefined)
    
    inline def setReferences(value: Boolean): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setRename(value: Boolean): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    inline def setSignatureHelp(value: Boolean): Self = StObject.set(x, "signatureHelp", value.asInstanceOf[js.Any])
    
    inline def setSignatureHelpUndefined: Self = StObject.set(x, "signatureHelp", js.undefined)
  }
}
