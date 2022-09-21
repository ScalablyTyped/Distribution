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
      * `DiagnosticsOptions.allowComments` will override this setting.
      */
    val allowComments: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The severity of reported comments. If not set, 'DiagnosticsOptions.allowComments' defines whether comments are ignored or reported as errors.
      */
    val comments: js.UndefOr[SeverityLevel] = js.undefined
    
    /**
      *  If set, the schema service would load schema content on-demand with 'fetch' if available
      */
    val enableSchemaRequest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The severity of problems that occurred when resolving and loading schemas. If set to 'ignore', schema resolving problems are not reported. If not set, 'warning' is used.
      */
    val schemaRequest: js.UndefOr[SeverityLevel] = js.undefined
    
    /**
      * The severity of problems from schema validation. If set to 'ignore', schema validation will be skipped. If not set, 'warning' is used.
      */
    val schemaValidation: js.UndefOr[SeverityLevel] = js.undefined
    
    /**
      * A list of known schemas and/or associations of schemas to file names.
      */
    val schemas: js.UndefOr[js.Array[FileMatch]] = js.undefined
    
    /**
      * The severity of reported trailing commas. If not set, trailing commas will be reported as errors.
      */
    val trailingCommas: js.UndefOr[SeverityLevel] = js.undefined
    
    /**
      * If set, the validator will be enabled and perform syntax and schema based validation,
      * unless `DiagnosticsOptions.schemaValidation` is set to `ignore`.
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
      
      inline def setComments(value: SeverityLevel): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setEnableSchemaRequest(value: Boolean): Self = StObject.set(x, "enableSchemaRequest", value.asInstanceOf[js.Any])
      
      inline def setEnableSchemaRequestUndefined: Self = StObject.set(x, "enableSchemaRequest", js.undefined)
      
      inline def setSchemaRequest(value: SeverityLevel): Self = StObject.set(x, "schemaRequest", value.asInstanceOf[js.Any])
      
      inline def setSchemaRequestUndefined: Self = StObject.set(x, "schemaRequest", js.undefined)
      
      inline def setSchemaValidation(value: SeverityLevel): Self = StObject.set(x, "schemaValidation", value.asInstanceOf[js.Any])
      
      inline def setSchemaValidationUndefined: Self = StObject.set(x, "schemaValidation", js.undefined)
      
      inline def setSchemas(value: js.Array[FileMatch]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      inline def setSchemasVarargs(value: FileMatch*): Self = StObject.set(x, "schemas", js.Array(value*))
      
      inline def setTrailingCommas(value: SeverityLevel): Self = StObject.set(x, "trailingCommas", value.asInstanceOf[js.Any])
      
      inline def setTrailingCommasUndefined: Self = StObject.set(x, "trailingCommas", js.undefined)
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  @js.native
  trait LanguageServiceDefaults extends StObject {
    
    val diagnosticsOptions: DiagnosticsOptions = js.native
    
    val languageId: String = js.native
    
    val modeConfiguration: ModeConfiguration = js.native
    
    def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, Any]): IDisposable = js.native
    def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, Any], thisArg: Any): IDisposable = js.native
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.monacoEditor.monacoEditorStrings.error
    - typings.monacoEditor.monacoEditorStrings.warning
    - typings.monacoEditor.monacoEditorStrings.ignore
  */
  trait SeverityLevel extends StObject
  object SeverityLevel {
    
    inline def error: typings.monacoEditor.monacoEditorStrings.error = "error".asInstanceOf[typings.monacoEditor.monacoEditorStrings.error]
    
    inline def ignore: typings.monacoEditor.monacoEditorStrings.ignore = "ignore".asInstanceOf[typings.monacoEditor.monacoEditorStrings.ignore]
    
    inline def warning: typings.monacoEditor.monacoEditorStrings.warning = "warning".asInstanceOf[typings.monacoEditor.monacoEditorStrings.warning]
  }
}
