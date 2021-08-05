package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.FileMatch
import typings.monacoEditor.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object json {
  
  @JSImport("monaco-editor", "languages.json.jsonDefaults")
  @js.native
  val jsonDefaults: LanguageServiceDefaults = js.native
  
  trait DiagnosticsOptions extends StObject {
    
    /**
      * If set, comments are tolerated. If set to false, syntax errors will be emitted for comments.
      */
    val allowComments: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  If set, the schema service would load schema content on-demand with 'fetch' if available
      */
    val enableSchemaRequest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A list of known schemas and/or associations of schemas to file names.
      */
    val schemas: js.UndefOr[js.Array[FileMatch]] = js.undefined
    
    /**
      * If set, the validator will be enabled and perform syntax validation as well as schema based validation.
      */
    val validate: js.UndefOr[Boolean] = js.undefined
  }
  object DiagnosticsOptions {
    
    inline def apply(): DiagnosticsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiagnosticsOptions]
    }
    
    extension [Self <: DiagnosticsOptions](x: Self) {
      
      inline def setAllowComments(value: Boolean): Self = StObject.set(x, "allowComments", value.asInstanceOf[js.Any])
      
      inline def setAllowCommentsUndefined: Self = StObject.set(x, "allowComments", js.undefined)
      
      inline def setEnableSchemaRequest(value: Boolean): Self = StObject.set(x, "enableSchemaRequest", value.asInstanceOf[js.Any])
      
      inline def setEnableSchemaRequestUndefined: Self = StObject.set(x, "enableSchemaRequest", js.undefined)
      
      inline def setSchemas(value: js.Array[FileMatch]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      inline def setSchemasVarargs(value: FileMatch*): Self = StObject.set(x, "schemas", js.Array(value :_*))
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  @js.native
  trait LanguageServiceDefaults extends StObject {
    
    val diagnosticsOptions: DiagnosticsOptions = js.native
    
    val languageId: String = js.native
    
    val modeConfiguration: ModeConfiguration = js.native
    
    def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, js.Any]): IDisposable = js.native
    def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, js.Any], thisArg: js.Any): IDisposable = js.native
    
    def setDiagnosticsOptions(options: DiagnosticsOptions): Unit = js.native
    
    def setModeConfiguration(modeConfiguration: ModeConfiguration): Unit = js.native
  }
  
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
      * Defines whether the built-in diagnostic provider is enabled.
      */
    val diagnostics: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in documentFormattingEdit provider is enabled.
      */
    val documentFormattingEdits: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in documentRangeFormattingEdit provider is enabled.
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
      * Defines whether the built-in selection range provider is enabled.
      */
    val selectionRanges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in tokens provider is enabled.
      */
    val tokens: js.UndefOr[Boolean] = js.undefined
  }
  object ModeConfiguration {
    
    inline def apply(): ModeConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModeConfiguration]
    }
    
    extension [Self <: ModeConfiguration](x: Self) {
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setCompletionItems(value: Boolean): Self = StObject.set(x, "completionItems", value.asInstanceOf[js.Any])
      
      inline def setCompletionItemsUndefined: Self = StObject.set(x, "completionItems", js.undefined)
      
      inline def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      inline def setDocumentFormattingEdits(value: Boolean): Self = StObject.set(x, "documentFormattingEdits", value.asInstanceOf[js.Any])
      
      inline def setDocumentFormattingEditsUndefined: Self = StObject.set(x, "documentFormattingEdits", js.undefined)
      
      inline def setDocumentRangeFormattingEdits(value: Boolean): Self = StObject.set(x, "documentRangeFormattingEdits", value.asInstanceOf[js.Any])
      
      inline def setDocumentRangeFormattingEditsUndefined: Self = StObject.set(x, "documentRangeFormattingEdits", js.undefined)
      
      inline def setDocumentSymbols(value: Boolean): Self = StObject.set(x, "documentSymbols", value.asInstanceOf[js.Any])
      
      inline def setDocumentSymbolsUndefined: Self = StObject.set(x, "documentSymbols", js.undefined)
      
      inline def setFoldingRanges(value: Boolean): Self = StObject.set(x, "foldingRanges", value.asInstanceOf[js.Any])
      
      inline def setFoldingRangesUndefined: Self = StObject.set(x, "foldingRanges", js.undefined)
      
      inline def setHovers(value: Boolean): Self = StObject.set(x, "hovers", value.asInstanceOf[js.Any])
      
      inline def setHoversUndefined: Self = StObject.set(x, "hovers", js.undefined)
      
      inline def setSelectionRanges(value: Boolean): Self = StObject.set(x, "selectionRanges", value.asInstanceOf[js.Any])
      
      inline def setSelectionRangesUndefined: Self = StObject.set(x, "selectionRanges", js.undefined)
      
      inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
}
