package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.ArgumentsInColorFunction
import typings.monacoEditor.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object css {
  
  @JSImport("monaco-editor", "languages.css.cssDefaults")
  @js.native
  val cssDefaults: LanguageServiceDefaults = js.native
  
  @JSImport("monaco-editor", "languages.css.lessDefaults")
  @js.native
  val lessDefaults: LanguageServiceDefaults = js.native
  
  @JSImport("monaco-editor", "languages.css.scssDefaults")
  @js.native
  val scssDefaults: LanguageServiceDefaults = js.native
  
  @js.native
  trait DiagnosticsOptions extends StObject {
    
    val lint: js.UndefOr[ArgumentsInColorFunction] = js.native
    
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
      def setLint(value: ArgumentsInColorFunction): Self = StObject.set(x, "lint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLintUndefined: Self = StObject.set(x, "lint", js.undefined)
      
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
      * Defines whether the built-in definitions provider is enabled.
      */
    val definitions: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in diagnostic provider is enabled.
      */
    val diagnostics: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in references provider is enabled.
      */
    val documentHighlights: js.UndefOr[Boolean] = js.native
    
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
      * Defines whether the built-in references provider is enabled.
      */
    val references: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in rename provider is enabled.
      */
    val rename: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines whether the built-in selection range provider is enabled.
      */
    val selectionRanges: js.UndefOr[Boolean] = js.native
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
      def setDefinitions(value: Boolean): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      @scala.inline
      def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      @scala.inline
      def setDocumentHighlights(value: Boolean): Self = StObject.set(x, "documentHighlights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentHighlightsUndefined: Self = StObject.set(x, "documentHighlights", js.undefined)
      
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
      def setReferences(value: Boolean): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      @scala.inline
      def setRename(value: Boolean): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      @scala.inline
      def setSelectionRanges(value: Boolean): Self = StObject.set(x, "selectionRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionRangesUndefined: Self = StObject.set(x, "selectionRanges", js.undefined)
    }
  }
}
