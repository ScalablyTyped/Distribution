package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.FileMatch
import typings.monacoEditor.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object json {
  
  @JSImport("monaco-editor", "languages.json.jsonDefaults")
  @js.native
  val jsonDefaults: LanguageServiceDefaults = js.native
  
  @js.native
  trait DiagnosticsOptions extends StObject {
    
    /**
      * If set, comments are tolerated. If set to false, syntax errors will be emitted for comments.
      */
    val allowComments: js.UndefOr[Boolean] = js.native
    
    /**
      *  If set, the schema service would load schema content on-demand with 'fetch' if available
      */
    val enableSchemaRequest: js.UndefOr[Boolean] = js.native
    
    /**
      * A list of known schemas and/or associations of schemas to file names.
      */
    val schemas: js.UndefOr[js.Array[FileMatch]] = js.native
    
    /**
      * If set, the validator will be enabled and perform syntax validation as well as schema based validation.
      */
    val validate: js.UndefOr[Boolean] = js.native
  }
  object DiagnosticsOptions {
    
    @scala.inline
    def apply(): DiagnosticsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiagnosticsOptions]
    }
    
    @scala.inline
    implicit class DiagnosticsOptionsMutableBuilder[Self <: DiagnosticsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowComments(value: Boolean): Self = StObject.set(x, "allowComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCommentsUndefined: Self = StObject.set(x, "allowComments", js.undefined)
      
      @scala.inline
      def setEnableSchemaRequest(value: Boolean): Self = StObject.set(x, "enableSchemaRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSchemaRequestUndefined: Self = StObject.set(x, "enableSchemaRequest", js.undefined)
      
      @scala.inline
      def setSchemas(value: js.Array[FileMatch]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      @scala.inline
      def setSchemasVarargs(value: FileMatch*): Self = StObject.set(x, "schemas", js.Array(value :_*))
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  @js.native
  trait LanguageServiceDefaults extends StObject {
    
    val diagnosticsOptions: DiagnosticsOptions = js.native
    
    val languageId: String = js.native
    
    val modeConfiguration: ModeConfiguration = js.native
    
    def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, _]): IDisposable = js.native
    def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, _], thisArg: js.Any): IDisposable = js.native
    
    def setDiagnosticsOptions(options: DiagnosticsOptions): Unit = js.native
    
    def setModeConfiguration(modeConfiguration: ModeConfiguration): Unit = js.native
  }
  
  @js.native
  trait ModeConfiguration extends StObject {
    
    /**
      * Defines whether the built-in color provider is enabled.
      */
    val colors: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in completionItemProvider is enabled.
      */
    val completionItems: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in diagnostic provider is enabled.
      */
    val diagnostics: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in documentFormattingEdit provider is enabled.
      */
    val documentFormattingEdits: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in documentRangeFormattingEdit provider is enabled.
      */
    val documentRangeFormattingEdits: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in documentSymbolProvider is enabled.
      */
    val documentSymbols: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in foldingRange provider is enabled.
      */
    val foldingRanges: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in hoverProvider is enabled.
      */
    val hovers: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in selection range provider is enabled.
      */
    val selectionRanges: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in tokens provider is enabled.
      */
    val tokens: js.UndefOr[Boolean] = js.native
  }
  object ModeConfiguration {
    
    @scala.inline
    def apply(): ModeConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModeConfiguration]
    }
    
    @scala.inline
    implicit class ModeConfigurationMutableBuilder[Self <: ModeConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setCompletionItems(value: Boolean): Self = StObject.set(x, "completionItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletionItemsUndefined: Self = StObject.set(x, "completionItems", js.undefined)
      
      @scala.inline
      def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      @scala.inline
      def setDocumentFormattingEdits(value: Boolean): Self = StObject.set(x, "documentFormattingEdits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentFormattingEditsUndefined: Self = StObject.set(x, "documentFormattingEdits", js.undefined)
      
      @scala.inline
      def setDocumentRangeFormattingEdits(value: Boolean): Self = StObject.set(x, "documentRangeFormattingEdits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentRangeFormattingEditsUndefined: Self = StObject.set(x, "documentRangeFormattingEdits", js.undefined)
      
      @scala.inline
      def setDocumentSymbols(value: Boolean): Self = StObject.set(x, "documentSymbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentSymbolsUndefined: Self = StObject.set(x, "documentSymbols", js.undefined)
      
      @scala.inline
      def setFoldingRanges(value: Boolean): Self = StObject.set(x, "foldingRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoldingRangesUndefined: Self = StObject.set(x, "foldingRanges", js.undefined)
      
      @scala.inline
      def setHovers(value: Boolean): Self = StObject.set(x, "hovers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoversUndefined: Self = StObject.set(x, "hovers", js.undefined)
      
      @scala.inline
      def setSelectionRanges(value: Boolean): Self = StObject.set(x, "selectionRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionRangesUndefined: Self = StObject.set(x, "selectionRanges", js.undefined)
      
      @scala.inline
      def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
}
